package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.ReservationManager;
import org.mahxwell.openlib.model.bean.openlib.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@ContextConfiguration(locations = "classpath:application-context-business-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ReservationManagerImplTest {

    @Autowired
    private ReservationManager reservationManager;
    private static final Logger logger = Logger.getLogger(ReservationManagerImplTest.class);


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


    @Test
    @Transactional
    @Rollback(true)
    public void addReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void updateReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservationUpdate = InitializeReservationObject(2, 2, 2);
        List<Reservation> reservations = reservationManager.Reservations();
        reservationManager.updateReservation(reservationUpdate, reservations.get(0));

    }

    @Test
    @Transactional
    @Rollback(true)
    public void deleteReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void reservations() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        List<Reservation> reservations = reservationManager.Reservations();

        Assert.assertNotNull(reservations);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void getReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        List<Reservation> reservations = reservationManager.Reservations();

        Integer reservation_id = reservations.get(0).getReservationId();

        Reservation reservationGetting = reservationManager.getReservation(reservation_id);

        Assert.assertNotNull(reservationGetting);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void getReservationByUserIdAndCopyId() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservation1 = reservationManager.getReservationByUserIdAndCopyId(1, 1);

        Assert.assertNotNull(reservation1);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsByBooks() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(1, 2, 2);
        reservationManager.addReservation(reservation1);

        Integer book_id1 = reservation.getGetBookId();
        Integer book_id2 = reservation1.getGetBookId();

        Assert.assertEquals(book_id1, book_id2);

        reservationManager.reservationsByBooks(book_id1);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsByUser() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(2, 1, 2);
        reservationManager.addReservation(reservation1);

        Integer user_id1 = reservation.getUserIdUser();
        Integer user_id2 = reservation1.getUserIdUser();

        Assert.assertEquals(user_id1, user_id2);

        reservationManager.reservationsByUser(user_id1);

    }

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsByUserAndByBooks() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(2, 1, 2);
        reservationManager.addReservation(reservation1);

        reservationManager.reservationsByUserAndByBooks(reservation.getUserIdUser(), reservation1.getGetBookId());
    }

    @Test
    @Transactional
    @Rollback(true)
    public void reservationsByCopyId() {

        List<Reservation> reservationList = reservationManager.reservationsByCopyId(1);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void getReservationByMailDateNotNull() {
        List<Reservation> reservations = reservationManager.getReservationByMailDateNotNull();
    }
}