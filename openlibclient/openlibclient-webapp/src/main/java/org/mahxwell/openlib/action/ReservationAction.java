package org.mahxwell.openlib.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.collections4.ListUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.BookloaningManager;
import org.mahxwell.openlib.business.contract.manager.CopyManager;
import org.mahxwell.openlib.business.contract.manager.ReservationManager;
import org.mahxwell.openlib.service.book.Book;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.mahxwell.openlib.service.copy.Copy;
import org.mahxwell.openlib.service.reservation.Reservation;
import org.mahxwell.openlib.service.user.User;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Mahxwell
 * <h1>Reservation Action Class</h1>
 * <p>Contain All Struts2 Framework Book Actions</p>
 */
public class ReservationAction extends ActionSupport implements SessionAware {

    private static final Logger logger = Logger.getLogger(ReservationAction.class);
    private Map<String, Object> session;
    private HttpServletRequest servletRequest;

    private List<Bookloaning> bookloaningListOrderByDate;
    private List<Reservation> reservationList;
    private Book book;
    private User user;
    private List<Copy> copyList;

    private BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();
    private ReservationManager reservationManager = ContextLoader.INSTANCE.getReservationManager();
    private CopyManager copyManager = ContextLoader.INSTANCE.getCopyManager();

    /**
     * Add V2
     * Create a new Reservation Object
     *
     * @return
     */
    public String doCreateReservation() {

        user = (User) this.session.get("user");
        book = (Book) this.session.get("book");

        if (user != null && book != null) {
            try {
                bookloaningListOrderByDate = bookloaningManager.bookloaningsByBookOrderByDateAsc(book.getBookId());
                reservationList = reservationManager.reservationsByBooks(book.getBookId());
                Integer freeCopyId = getFreeCopyId(reservationList, book.getBookId());

                /**
                 * Check if Error occured in Queue
                 */
                if (freeCopyId == -1) {
                    return ActionSupport.ERROR;
                }

                /**
                 * Set then Insert New Reservation Object
                 */
                try {
                    String formater = "yyyy-MM-dd'T'HH:mm:ss";
                    DateFormat format = new SimpleDateFormat(formater);
                    Date date = new Date();
                    XMLGregorianCalendar gDateFormatted =
                            DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
                    Reservation reservation = new Reservation();
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    String timestampToString = timestamp.toString();
                    reservation.setReservationDate(timestampToString);
                    reservation.setReservationMail(gDateFormatted);
                    reservation.setGetBookId(book.getBookId());
                    reservation.setUserIdUser(user.getUserId());
                    reservation.setCopyIdCopy(freeCopyId);
                    reservationManager.addReservation(reservation);
                } catch (Exception e) {
                    logger.error("Failed adding reservation : " + e);
                }
            } catch (Exception e) {
                logger.error("bookloaningListOrderByDate error : " + e);
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Add V2
     * Check free copy for queue
     *
     * @param reservations reservation list by book identification number
     * @param book_id      Book Unique Identification Number
     * @return
     */
    private Integer getFreeCopyId(final List<Reservation> reservations, final Integer book_id) {
        try {

            /**
             * Get All Copy list and then Compare them
             * If substract of two lists is positive, the first copy_id of the list can be reserved
             * If substract of two lists is null (= 0 here), calling a new method to determine second reservation queue
             */
            List<Copy> copies = copyManager.copiesByBook(book_id);

            List<Integer> copies1 = new ArrayList<>();
            List<Integer> copies2 = new ArrayList<>();

            for (int i = 0; i < copies.size(); i++)
                copies1.add(copies.get(i).getCopyId());

            for (int j = 0; j < reservations.size(); j++)
                copies2.add(reservations.get(j).getCopyIdCopy());

            List<Integer> finalCopyList = ListUtils.subtract(copies1, copies2);

            if (finalCopyList.size() <= 0) {
                return getSecondCopyReservation(book_id);
            } else {
                return finalCopyList.get(0);
            }
        } catch (Exception e) {
            logger.error(e);
        }
        return -1;
    }


    /**
     * Add V2
     * Check Existing Queue to allow second flow of Reservation
     *
     * @param book_id Book Unique Identification Number
     * @return
     */
    private Integer getSecondCopyReservation(final Integer book_id) {

        List<Copy> copies = copyManager.copiesByBook(book_id);

        /**
         * Second reservation queue
         * If all copies of are reserved a first time, a second reservation can be triggered
         * (each copies can have two reservations)
         */
        int i = 0;

        while (i < copies.size()) {
            try {
                List<Reservation> reservationList = reservationManager.reservationsByCopyId(copies.get(i).getCopyId());
                if (reservationList.size() >= 2)
                    i++;
                else
                    return copies.get(i).getCopyId();
            } catch (Exception e) {
                logger.error(e);
            }
        }
        return -1;
    }

    /**
     * Add V2
     * Delete a Reservation Object
     *
     * @return
     */
    public String deDeleteReservation() {
        user = (User) this.session.get("user");
        book = (Book) this.session.get("book");

        if (user != null && book != null) {
            try {
                Reservation reservation = reservationManager.reservationsByUserAndByBooks(user.getUserId(), book.getBookId());
                reservationManager.deleteReservation(reservation);
            } catch (Exception e) {
                logger.error("Error deleting reservation : " + e);
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /* GETTERS AND SETTERS */

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Copy> getCopyList() {
        return copyList;
    }

    public void setCopyList(List<Copy> copyList) {
        this.copyList = copyList;
    }

    public List<Bookloaning> getBookloaningListOrderByDate() {
        return bookloaningListOrderByDate;
    }

    public void setBookloaningListOrderByDate(List<Bookloaning> bookloaningListOrderByDate) {
        this.bookloaningListOrderByDate = bookloaningListOrderByDate;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
