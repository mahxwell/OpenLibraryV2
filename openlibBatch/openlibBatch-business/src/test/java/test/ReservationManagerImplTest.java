package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
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

    private static final Logger logger = Logger.getLogger(ReservationManagerImplTest.class);

    @Autowired
    ReservationManager reservationManager;

    private String formater = "yyyy-MM-dd'T'HH:mm:ss";

    private DateFormat format = new SimpleDateFormat(formater);


    private Reservation InitializeReservationObject(final Integer book_id, final Integer user_id, final Integer copy_id) {
        Reservation reservation = new Reservation();
        try {
            Date date = new Date();
            XMLGregorianCalendar gDateFormatted =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
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

    private void cleanAllReservation() {
        List<Reservation> reservations = reservationManager.Reservations();
        if (reservations != null) {
            for (int i = 0; i < reservations.size(); i++) {
                reservationManager.deleteReservation(reservations.get(i));
            }
        } else {
            logger.error("reservation list is null, unable to clean empty list");
        }
    }

    @Test
    public void addReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);
        cleanAllReservation();
    }

    @Test
    public void updateReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservationUpdate = InitializeReservationObject(2, 2, 2);
        List<Reservation> reservations = reservationManager.Reservations();
        reservationManager.updateReservation(reservationUpdate, reservations.get(0));
        cleanAllReservation();
    }

    @Test
    public void deleteReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);
        cleanAllReservation();
    }

    @Test
    public void reservations() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        List<Reservation> reservations = reservationManager.Reservations();

        Assert.assertNotNull(reservations);
        cleanAllReservation();
    }

    @Test
    public void getReservation() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        List<Reservation> reservations = reservationManager.Reservations();

        Integer reservation_id = reservations.get(0).getReservationId();

        Reservation reservationGetting = reservationManager.getReservation(reservation_id);

        Assert.assertNotNull(reservationGetting);
        cleanAllReservation();
    }

    @Test
    public void getReservationByUserIdAndCopyId() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservation1 = reservationManager.getReservationByUserIdAndCopyId(1, 1);

        Assert.assertNotNull(reservation1);
        cleanAllReservation();
    }

    @Test
    public void reservationsByBooks() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(1, 2, 2);
        reservationManager.addReservation(reservation1);

        Integer book_id1 = reservation.getGetBookId();
        Integer book_id2 = reservation1.getGetBookId();

        Assert.assertEquals(book_id1, book_id2);

        reservationManager.reservationsByBooks(book_id1);
        cleanAllReservation();
    }

    @Test
    public void reservationsByUser() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(2, 1, 2);
        reservationManager.addReservation(reservation1);

        Integer user_id1 = reservation.getUserIdUser();
        Integer user_id2 = reservation1.getUserIdUser();

        Assert.assertEquals(user_id1, user_id2);

        reservationManager.reservationsByUser(user_id1);
        cleanAllReservation();
    }

    @Test
    public void reservationsByUserAndByBooks() {

        Reservation reservation = InitializeReservationObject(1, 1, 1);
        reservationManager.addReservation(reservation);

        Reservation reservation1 = InitializeReservationObject(2, 1, 2);
        reservationManager.addReservation(reservation1);

        reservationManager.reservationsByUserAndByBooks(reservation.getUserIdUser(), reservation1.getGetBookId());
        cleanAllReservation();
    }

    @Test
    public void reservationsByCopyId(){
        List<Reservation> reservations = reservationManager.reservationsByCopyId(1);
 /*       for (int i = 0; i < reservations.size(); i++){
            System.out.println(reservations.get(i));
        }*/
    }
}