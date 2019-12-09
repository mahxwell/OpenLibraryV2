package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.ReservationManager;
import org.mahxwell.openlib.service.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@ContextConfiguration(locations = "classpath:business-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ReservationManagerImplTest {

    @Autowired
    ReservationManager reservationManager;
    private static final Logger logger = Logger.getLogger(ReservationManagerImplTest.class);

    /**
     * Test
     * Initialize Reservation Object for Unit Tests
     *
     * @param book_id Set Book Identification Number
     * @param user_id Set User Identification Number
     * @param copy_id Set Copy Identification Number
     * @return A Reservation Object
     */
    private Reservation InitializeReservationObject(final Integer book_id, final Integer user_id, final Integer copy_id) {
        Reservation reservation = new Reservation();
        try {

            String formater = "yyyy-MM-dd'T'HH:mm:ss";

            DateFormat format = new SimpleDateFormat(formater);

            XMLGregorianCalendar gDateFormatted =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(new Date()));

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            reservation.setReservationDate(timestamp.toString());
            reservation.setReservationMail(gDateFormatted);
            reservation.setGetBookId(book_id);
            reservation.setUserIdUser(user_id);
            reservation.setCopyIdCopy(copy_id);
        } catch (Exception e) {
            logger.error("Error InitializeReservationObject method = " + e);
        }
        return reservation;
    }

    /**
     * Test
     * Get Last Reservation Object in Data Base
     *
     * @return Last Object -> For Delete
     */
    private Reservation getLastReservation() {
        try {
            List<Reservation> reservations = reservationManager.Reservations();
            return reservations.get(reservations.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    /* Add New Reservation In DataBase */

    @Test
    public void addReservation() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationManager.addReservation(reservation);
            reservationManager.deleteReservation(getLastReservation());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Reservation */

    @Test
    public void updateReservation() {

        try {
            Reservation reservation = InitializeReservationObject(2, 2, 4);
            reservationManager.addReservation(reservation);
            reservationManager.updateReservation(reservation, getLastReservation());
            reservationManager.deleteReservation(getLastReservation());
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Delete Reservation */


    @Test
    public void deleteReservation() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationManager.addReservation(reservation);
            reservationManager.deleteReservation(getLastReservation());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Reservation List */

    @Test
    public void reservations() {

        try {
            reservationManager.Reservations();
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Find One Reservation By Identification Number */

    @Test
    public void getReservation() {

        try {
            reservationManager.getReservation(getLastReservation().getReservationId());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Reservation By UserId AND CopyId */

    @Test
    public void getReservationByUserIdAndCopyId() {

        try {
            reservationManager.getReservationByUserIdAndCopyId(1, 1);

        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Find Reservations By Books */

    @Test
    public void reservationsByBooks() {

        try {
            reservationManager.reservationsByBooks(1);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find Reservations By Users */

    @Test
    public void reservationsByUser() {

        try {
            reservationManager.reservationsByUser(1);
        } catch (Exception e) {
            logger.error(e);
        }

    }

    /* Find Reservations By Books AND Users */

    @Test
    public void reservationsByUserAndByBooks() {

        try {
            reservationManager.reservationsByUserAndByBooks(1, 1);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find Reservations By Copies */

    @Test
    public void reservationsByCopyId() {

        try {
            List<Reservation> reservationList = reservationManager.reservationsByCopyId(1);
        } catch (Exception e) {
            logger.error(e);
        }
    }
}