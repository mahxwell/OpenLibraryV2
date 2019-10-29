package test;

import org.junit.Assert;
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

    private String formater = "yyyy-MM-dd'T'HH:mm:ss";

    private DateFormat format = new SimpleDateFormat(formater);

    private Date date = new Date();

    private Reservation InitializeReservationObject(final Integer book_id, final Integer user_id, final Integer copy_id) {
        Reservation reservation = new Reservation();
        try {
            XMLGregorianCalendar gDateFormatted =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
            reservation.setReservationDate(gDateFormatted);
            reservation.setGetBookId(book_id);
            reservation.setUserIdUser(user_id);
            reservation.setCopyIdCopy(copy_id);
        } catch (Exception e) {
            logger.error("Error InitializeReservationObject method = " + e);
        }
        return reservation;
    }

    private void cleanAllReservation() {
        List<Reservation> reservations = reservationDao.Reservations();
        if (reservations != null) {
            for (int i = 0; i < reservations.size(); i++) {
                reservationDao.deleteReservation(reservations.get(i));
            }
        } else {
            logger.error("reservation list is null, unable to clean empty list");
        }
    }


    @Test
    public void addReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);
        cleanAllReservation();
    }

    @Test
    public void updateReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);

        Reservation reservationUpdate = InitializeReservationObject(2, 2, 2);
        List<Reservation> reservations = reservationDao.Reservations();
        reservationDao.updateReservation(reservationUpdate, reservations.get(0));

        cleanAllReservation();
    }

    @Test
    public void deleteReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);
        cleanAllReservation();
    }

    @Test
    public void reservations() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);

        List<Reservation> reservations = reservationDao.Reservations();

        Assert.assertNotNull(reservations);
        cleanAllReservation();
    }

    @Test
    public void getReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);

        List<Reservation> reservations = reservationDao.Reservations();

        Integer reservation_id = reservations.get(0).getReservationId();

        Reservation reservationGetting = reservationDao.getReservation(reservation_id);

        Assert.assertNotNull(reservationGetting);
        cleanAllReservation();
    }

    @Test
    public void getReservationByUserIdAndCopyId() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);

        Reservation reservation1 = reservationDao.getReservationByUserIdAndCopyId(1, 1);

        Assert.assertNotNull(reservation1);
        cleanAllReservation();
    }

    @Test
    public void reservationsByBooks() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(1, 2, 2);
        reservationDao.addReservation(reservation1);

        Integer book_id1 = reservation.getGetBookId();
        Integer book_id2 = reservation1.getGetBookId();

        Assert.assertEquals(book_id1, book_id2);

        reservationDao.reservationsByBooks(book_id1);
        cleanAllReservation();
    }

    @Test
    public void reservationsByUser() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(2, 1, 2);
        reservationDao.addReservation(reservation1);

        Integer user_id1 = reservation.getUserIdUser();
        Integer user_id2 = reservation1.getUserIdUser();

        Assert.assertEquals(user_id1, user_id2);

        reservationDao.reservationsByUser(user_id1);

        cleanAllReservation();
    }

    @Test
    public void reservationsByUserAndByBooks() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationDao.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(2, 1, 2);
        reservationDao.addReservation(reservation1);

        reservationDao.reservationsByUserAndByBooks(reservation.getUserIdUser(), reservation1.getGetBookId());
        cleanAllReservation();
    }
}