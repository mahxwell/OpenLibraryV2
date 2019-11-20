package org.mahxwell.openlib.batch;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mahxwell.openlib.business.contract.manager.*;
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

    /**
     * Here Java Thread by Using Runnable task calling all methods to send mails
     */
    Runnable taskFreeReservation = () -> {
        try {
            UserManager userManager = ContextLoader.INSTANCE.getUserManager();
            BookManager bookManager = ContextLoader.INSTANCE.getBookManager();
            BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();
            ReservationManager reservationManager = ContextLoader.INSTANCE.getReservationManager();

            List<Reservation> reservations = reservationManager.Reservations();
            List<Bookloaning> bookloanings = bookloaningManager.bookloanings();

            List<Integer> freeCopyList = checkReservationsAndBookloanings(reservations, bookloanings);

            //TEST
            List<User> usersToSendMail = usersReservation(freeCopyList, reservations);

    /*        for (int i = 0; i < usersToSendMail.size(); i++)
                System.out.println(usersToSendMail.get(i).getUserName());*/


/////////////PRINT TO DELETE
            System.out.println("test4");
            for (int i = 0; i < freeCopyList.size(); i++)
                System.out.println(freeCopyList.get(i));
///////////////////
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

        List<Integer> securityMailCount = new ArrayList<>();

        try {
            List<Integer> userListId = new ArrayList<>();

            int i = 0;
            int j;
            while (i < reservations.size()) {
                j = 0;
                while (j < freeCopyList.size()) {
                    if (reservations.get(i).getCopyIdCopy() == freeCopyList.get(j)
                            && !securityMailCount.contains(reservations.get(i).getCopyIdCopy())) {
                        securityMailCount.add(reservations.get(i).getCopyIdCopy());
                        User user = userManager.getUser(reservations.get(i).getUserIdUser());

                        ///MAIL SENDER

                        Reservation reservationSetDate  = reservationManagerForMail
                                .getReservationByUserIdAndCopyId(user.getUserId(), reservations.get(i).getCopyIdCopy());

                        String formater = "yyyy-MM-dd'T'HH:mm:ss";
                        DateFormat format = new SimpleDateFormat(formater);
                        Date date = new Date();
                        XMLGregorianCalendar gDateFormatted =
                                DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));

                        reservationSetDate.setReservationMail(gDateFormatted);
                        reservationManagerForMail.updateReservation(reservationSetDate, reservationSetDate);

                        // SEND EMAIL HERE


                        System.out.println("test " + user.getUserName().toString());
                    }
                    j++;
                }
                i++;
            }

           // usersToSendMail = userToSendMailFinding(userListId);

        } catch (Exception e) {
            logger.error(e);
        }
        return usersToSendMail;
    }

    private List<User> userToSendMailFinding(final List<Integer> userListId) {

        List<User> usersToSendMail = new ArrayList<>();

        try {
            List<User> users = userManager.Users();

            int i = 0;
            int k;
            while (i < userListId.size()) {
                k = 0;
                while (k < users.size()) {
                    if (userListId.get(i) == users.get(k).getUserId()
                            && !usersToSendMail.contains(userListId.get(i))) {
                        usersToSendMail.add(users.get(k));
                    }
                    k++;
                }
                i++;
            }
            return usersToSendMail;
        } catch (Exception e) {
        }
        return usersToSendMail;
    }
}
