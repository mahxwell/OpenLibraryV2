package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.ReservationDao;

import org.mahxwell.openlib.service.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.apache.log4j.Logger;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@ContextConfiguration(locations = "classpath:consumer-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ReservationDaoImplTest {


    @Autowired
    private ReservationDao reservationDao;
    private static final Logger logger = Logger.getLogger(ReservationDaoImplTest.class);

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
            List<Reservation> reservations = reservationDao.Reservations();
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
            reservationDao.addReservation(reservation);
            reservationDao.deleteReservation(getLastReservation());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Reservation */

    @Test
    public void updateReservation() {

        try {
            Reservation reservation = InitializeReservationObject(2, 2, 4);
            reservationDao.addReservation(reservation);
            reservationDao.updateReservation(reservation, getLastReservation());
            reservationDao.deleteReservation(getLastReservation());
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Delete Reservation */


    @Test
    public void deleteReservation() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);
            reservationDao.deleteReservation(getLastReservation());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Reservation List */

    @Test
    public void reservations() {


        try {
            reservationDao.Reservations();
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Find One Reservation By Identification Number */

    @Test
    public void getReservation() {

        try {
            reservationDao.getReservation(getLastReservation().getReservationId());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Reservation By UserId AND CopyId */

    @Test
    public void getReservationByUserIdAndCopyId() {

        try {
            reservationDao.getReservationByUserIdAndCopyId(1, 1);

        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Find Reservations By Books */

    @Test
    public void reservationsByBooks() {

        try {
            reservationDao.reservationsByBooks(1);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find Reservations By Users */

    @Test
    public void reservationsByUser() {

        try {
            reservationDao.reservationsByUser(1);
        } catch (Exception e) {
            logger.error(e);
        }

    }

    /* Find Reservations By Books AND Users */

    @Test
    public void reservationsByUserAndByBooks() {

        try {
            reservationDao.reservationsByUserAndByBooks(1, 1);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find Reservations By Copies */

    @Test
    public void reservationsByCopyId() {

        try {
            List<Reservation> reservationList = reservationDao.reservationsByCopyId(1);
        } catch (Exception e) {
            logger.error(e);
        }
    }
}