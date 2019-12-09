package org.mahxwell.openlib.batch;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mahxwell.openlib.business.contract.manager.*;
import org.mahxwell.openlib.mail.JavaMailSenderUser;
import org.mahxwell.openlib.service.book.Book;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.mahxwell.openlib.service.copy.Copy;
import org.mahxwell.openlib.service.reservation.Reservation;

import org.apache.commons.collections4.ListUtils;
import org.mahxwell.openlib.service.user.User;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Create a Java Thread that send mail when a book previously reserved by a user is available
 */
public class TaskFreeBookReservationMail {

    private static final Logger logger = LogManager.getLogger(TaskFreeBookReservationMail.class);

    private CopyManager copyManager = ContextLoader.INSTANCE.getCopyManager();
    private UserManager userManager = ContextLoader.INSTANCE.getUserManager();
    private ReservationManager reservationManagerForMail = ContextLoader.INSTANCE.getReservationManager();
    private BookManager bookManager = ContextLoader.INSTANCE.getBookManager();

    /**
     * Here Java Thread by Using Runnable task calling all methods to send mails
     */
    Runnable taskFreeReservation = () -> {
        try {
            BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();
            ReservationManager reservationManager = ContextLoader.INSTANCE.getReservationManager();

            /**
             * Test to check if a user that receive a mail has loaned the reserved book (more than 48h)
             */
            checkIf48hoursPassedAlgorithm();
            List<Reservation> reservations = reservationManager.reservationsOrderById();

            List<Bookloaning> bookloanings = bookloaningManager.bookloanings();

            List<Integer> freeCopyList = checkReservationsAndBookloanings(reservations, bookloanings);

            //TODO UNCOMMENT FOR FINAL

            usersReservation(freeCopyList, reservations);


        } catch (RuntimeException e) {
            logger.error(e);
        } catch (Exception e) {
            logger.error(e);
        }
    };

    /**
     * Create a List of Integer returning a list of copy_id that are in Reservations table
     * but not anymore in bookloaning table => A reserved book is now available
     *
     * @param reservations list of reservations
     * @param bookloanings list of bookloanings
     * @return A list of Integer -> Differences between bookloaning and reservations
     */
    private List<Integer> checkReservationsAndBookloanings(final List<Reservation> reservations,
                                                           final List<Bookloaning> bookloanings) {

        List<Integer> copiesOfBooloaning = new ArrayList<>();
        List<Integer> copiesOfReservation = new ArrayList<>();

        for (int i = 0; i < reservations.size(); i++)
            copiesOfReservation.add(reservations.get(i).getCopyIdCopy());

        try {
            List<Copy> copiesForSize = new ArrayList<>();
            int k, m;
            for (int j = 0; j < bookloanings.size(); j++) {
                copiesForSize = copyManager.copiesByBook(bookloanings.get(j).getGetBookId());
                m = k = 0;
                m = copiesForSize.size();
                while (k < m) {
                    copiesOfBooloaning.add(bookloanings.get(j).getCopyIdCopy());
                    k++;
                }
            }
        } catch (Exception e) {
            logger.error(e);
        }

        List<Integer> getCopyIds = ListUtils.subtract(copiesOfReservation, copiesOfBooloaning);
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(getCopyIds);
        getCopyIds.clear();
        getCopyIds.addAll(set);
        return getCopyIds;
    }

    /**
     * @param freeCopyList List of Integer presenting Copies identification number who are now available
     * @param reservations List of all reservations
     * @return A list of users to send mail (only the first for each Copy)
     */
    private List<User> usersReservation(final List<Integer> freeCopyList, final List<Reservation> reservations) {

        List<User> usersToSendMail = new ArrayList<>();

        /**
         * Count to send mail to only first user of the list and only one time by book
         */
        List<Integer> securityMailCount = new ArrayList<>();

        try {

            int i = 0;
            int j;
            while (i < reservations.size()) {
                j = 0;
                User user = new User();
                while (j < freeCopyList.size()) {
                    if (reservations.get(i).getCopyIdCopy() == freeCopyList.get(j)
                            && !securityMailCount.contains(reservations.get(i).getCopyIdCopy())) {
                        securityMailCount.add(reservations.get(i).getCopyIdCopy());
                        user = userManager.getUser(reservations.get(i).getUserIdUser());
                        Book book = bookManager.getBook(reservations.get(i).getGetBookId());

                        /**
                         * Send a mail to previous user
                         */
                        JavaMailSenderUser.sendMessageToUserReservation(user.getUserEmail(),
                                book.getBookTitle(), user.getUserName());

                        /**
                         * Set reservation_mail date  row in table Reservation with current date
                         * (Used to check if a user is late to loan a reserved book)
                         */
                        Reservation reservationSetDate = reservationManagerForMail
                                .getReservationByUserIdAndCopyId(user.getUserId(), reservations.get(i).getCopyIdCopy());

                        String formater = "yyyy-MM-dd'T'HH:mm:ss";
                        DateFormat format = new SimpleDateFormat(formater);
                        Date date = new Date();
                        XMLGregorianCalendar gDateFormatted =
                                DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));

                        reservationSetDate.setReservationMail(gDateFormatted);
                        reservationManagerForMail.updateReservation(reservationSetDate, reservationSetDate);
                    }

                    j++;
                }
                i++;
            }
        } catch (Exception e) {
            logger.error(e);
        }
        return usersToSendMail;
    }

    /**
     * Test to check if a user has loaned a reserved book in time (2 days)
     * -> if he has nothing happen
     * -> if he has not, this method will erase user from reservation list (to later send a mail to second)
     */
    public void checkIf48hoursPassedAlgorithm() {

        try {
            List<Reservation> reservations = reservationManagerForMail.getReservationByMailDateNotNull();

            for (int i = 0; i < reservations.size(); i++) {
                Date date = reservations.get(i).getReservationMail().toGregorianCalendar().getTime();

                //TODO DELETE RESERVATION WHEN IS TRUE
                /**
                 * Delete Reservation if a user is late to loan a reserved book =
                 */
                boolean checkDate = checkLimitDate(date);
                if (checkDate == true) {
                    try {
                        User user = userManager.getUser(reservations.get(i).getUserIdUser());
                        Book book = bookManager.getBook(reservations.get(i).getGetBookId());
                        JavaMailSenderUser.sendMessageToUserReservationWhenTooLate(user.getUserEmail(),
                                book.getBookTitle(), user.getUserName());
                        reservationManagerForMail.deleteReservation(reservations.get(i));
                    } catch (Exception e) {
                        logger.error(e);
                    }
                }
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /**
     * @param datePlus48 Had 2 days to date got in reservation table => row reversation_mail
     * @return true -> if date is over limit (auto erase from reservation table)
     * false -> if date is ok and not over limit
     */
    private boolean checkLimitDate(Date datePlus48) {

        try {
            Calendar c = Calendar.getInstance();
            c.setTime(datePlus48);
            c.add(Calendar.DATE, 2);
            datePlus48 = c.getTime();

            Date dateNow = new Date();

            /**
             * Compare current Date (dateNow) with reservation date (datePlus48)
             */
            if (dateNow.compareTo(datePlus48) >= 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            logger.error(e);
        }
        return false;
    }
}
