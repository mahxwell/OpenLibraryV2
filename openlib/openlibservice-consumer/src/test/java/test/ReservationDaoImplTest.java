package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.ReservationDao;

import org.mahxwell.openlib.model.bean.openlib.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@ContextConfiguration(locations = "classpath:application-context-test.xml")
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
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            reservation.setReservationDate(timestamp.toString());
            reservation.setReservationMail(new Date());
            reservation.setGetBookId(book_id);
            reservation.setUserIdUser(user_id);
            reservation.setCopyIdCopy(copy_id);
        } catch (Exception e) {
            logger.error("Error InitializeReservationObject method = " + e);
        }
        return reservation;
    }

    /* Add New Reservation In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addReservation() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Reservation */

    @Test
    @Transactional
    @Rollback(true)
    public void updateReservation() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);

            Reservation reservationUpdate = InitializeReservationObject(2, 2, 2);
            List<Reservation> reservations = reservationDao.Reservations();
            reservationDao.updateReservation(reservationUpdate, reservations.get(0));

        } catch (Exception e) {
            logger.error(e);
        }


    }


    /* Delete Reservation */


    @Test
    @Transactional
    @Rollback(true)
    public void deleteReservation() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Reservation List */

    @Test
    @Transactional
    @Rollback(true)
    public void reservations() {


        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);

            List<Reservation> reservations = reservationDao.Reservations();

            Assert.assertNotNull(reservations);
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Find One Reservation By Identification Number */

    @Test
    @Transactional
    @Rollback(true)
    public void getReservation() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);

            List<Reservation> reservations = reservationDao.Reservations();

            Integer reservation_id = reservations.get(0).getReservationId();

            Reservation reservationGetting = reservationDao.getReservation(reservation_id);

            Assert.assertNotNull(reservationGetting);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Reservation By UserId AND CopyId */

    @Test
    @Transactional
    @Rollback(true)
    public void getReservationByUserIdAndCopyId() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);

            Reservation reservation1 = reservationDao.getReservationByUserIdAndCopyId(1, 1);

            Assert.assertNotNull(reservation1);

        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Find Reservations By Books */

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsByBooks() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);

            Reservation reservation1 = InitializeReservationObject(1, 2, 2);
            reservationDao.addReservation(reservation1);

            Integer book_id1 = reservation.getGetBookId();
            Integer book_id2 = reservation1.getGetBookId();

            Assert.assertEquals(book_id1, book_id2);

            reservationDao.reservationsByBooks(book_id1);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find Reservations By Users */

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsByUser() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);

            Reservation reservation1 = InitializeReservationObject(2, 1, 2);
            reservationDao.addReservation(reservation1);

            Integer user_id1 = reservation.getUserIdUser();
            Integer user_id2 = reservation1.getUserIdUser();

            Assert.assertEquals(user_id1, user_id2);

            reservationDao.reservationsByUser(user_id1);
        } catch (Exception e) {
            logger.error(e);
        }

    }

    /* Find Reservations By Books AND Users */

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsByUserAndByBooks() {

        try {
            Reservation reservation = InitializeReservationObject(1, 1, 1);
            reservationDao.addReservation(reservation);

            Reservation reservation1 = InitializeReservationObject(2, 1, 2);
            reservationDao.addReservation(reservation1);

            reservationDao.reservationsByUserAndByBooks(reservation.getUserIdUser(), reservation1.getGetBookId());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find Reservations By Copies */

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsByCopyId() {

        try {
            List<Reservation> reservationList = reservationDao.reservationsByCopyId(1);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find Reservations When Date Mail is not Null -> Send mail in batch function */

    @Test
    @Transactional
    @Rollback(true)
    public void getReservationByMailDateNotNull() {
        try {
            List<Reservation> reservations = reservationDao.getReservationByMailDateNotNull();
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Get All reservations Ordered by Id (forced -> if not some troubles after table modifications) */

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsOrderById() {

        try {
            List<Reservation> reservations = reservationDao.reservationsOrderById();
        } catch (Exception e) {
            logger.error(e);
        }
    }
}