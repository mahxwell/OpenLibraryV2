package org.mahxwell.openlib.action;

import com.opensymphony.xwork2.ActionSupport;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ReservationAction extends ActionSupport implements SessionAware {

    private static final Logger logger = Logger.getLogger(ReservationAction.class);
    private Map<String, Object> session;
    private HttpServletRequest servletRequest;

    private List<Bookloaning> bookloaningListOrderByDate;
    private List<Reservation> reservationList;
    private Book book;
    private User user;
    private List<Copy> copyList;


    BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();
    ReservationManager reservationManager = ContextLoader.INSTANCE.getReservationManager();
    CopyManager copyManager = ContextLoader.INSTANCE.getCopyManager();

    public String doCreateReservation() {

        user = (User) this.session.get("user");
        book = (Book) this.session.get("book");

        if (user != null && book != null) {
            try {
                bookloaningListOrderByDate = bookloaningManager.bookloaningsByBookOrderByDateAsc(book.getBookId());
                copyList = copyManager.copiesByBook(book.getBookId());
                reservationList = reservationManager.reservationsByBooks(book.getBookId());

                boolean maxLengthQueud;

                if (reservationList.size() <= (copyList.size() + copyList.size())) {
                    maxLengthQueud = true;
                } else {
                    maxLengthQueud = false;
                }

                if (bookloaningListOrderByDate.size() > 0 && maxLengthQueud == true) {
                    try {
                        String formater = "yyyy-MM-dd'T'HH:mm:ss";
                        DateFormat format = new SimpleDateFormat(formater);
                        Date date = new Date();
                        XMLGregorianCalendar gDateFormatted =
                                DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
                        Reservation reservation = new Reservation();
                        reservation.setReservationDate(gDateFormatted);
                        reservation.setGetBookId(book.getBookId());
                        reservation.setUserIdUser(user.getUserId());
                        reservation.setCopyIdCopy(bookloaningListOrderByDate.get(0).getCopyIdCopy());
                        reservationManager.addReservation(reservation);
                    } catch (Exception e) {
                        logger.error("Failed adding reservation : " + e);
                    }
                }
            } catch (Exception e) {
                logger.error("bookloaningListOrderByDate error : " + e);
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

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
