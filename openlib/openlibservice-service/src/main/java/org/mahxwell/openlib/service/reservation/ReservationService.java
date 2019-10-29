package org.mahxwell.openlib.service.reservation;

import org.apache.log4j.Logger;
import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.ReservationManager;
import org.mahxwell.openlib.model.bean.openlib.Reservation;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Reservation Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "reservation")
public class ReservationService extends AbstractManagerService {

    private static final Logger logger = Logger.getLogger(ReservationService.class);

    ReservationManager reservationManager = ContextLoader.INSTANCE.getReservationManager();


    /**
     * WebService
     * Add a New Reservation Object in DataBase
     *
     * @param newReservation New Reservation Object
     */
    @WebMethod(operationName = "addReservation")
    public void addReservation(final Reservation newReservation) {

        try {
            reservationManager.addReservation(newReservation);
        } catch (Exception e) {
            logger.error("Error addReservation method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing Reservation Object in DataBase
     *
     * @param reservationToUpdate Reservation Object Updated
     * @param reservationToFind   Reservation Object to update
     */
    @WebMethod(operationName = "updateReservation")
    public void updateReservation(final Reservation reservationToUpdate, final Reservation reservationToFind) {
        try {
            reservationManager.updateReservation(reservationToUpdate, reservationToFind);
        } catch (Exception e) {
            logger.error("Error updateReservation method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing Bookloaning Object in DataBase
     *
     * @param reservationToDelete Bookloaning Object to delete
     */
    @WebMethod(operationName = "deleteReservation")
    public void deleteReservation(final Reservation reservationToDelete) {
        try {
            reservationManager.deleteReservation(reservationToDelete);
        } catch (Exception e) {
            logger.error("Error deleteReservation method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get a Reservation List Object
     *
     * @return Reservations -> List of Reservation Object
     */
    @WebMethod(operationName = "listreservation")
    public List<Reservation> Reservations() {
        try {
            List<Reservation> reservations = reservationManager.Reservations();
            if (reservations != null) {
                return reservations;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error Reservations method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Get a Precise Reservation Object by Identification Number
     *
     * @param reservation_id Reservation unique Identification number
     * @return Reservation Object Found
     */
    @WebMethod(operationName = "getReservation")
    public Reservation getReservation(final Integer reservation_id) {
        try {
            Reservation reservation = reservationManager.getReservation(reservation_id);
            return reservation;
        } catch (Exception e) {
            logger.error("Error getReservation method = " + e);
            return null;
        }
    }

    /**
     * WebService
     * Get a Precise Reservation Object by User ID and Copy ID
     *
     * @param user_id User unique Identification number
     * @param copy_id Copy unique Identification number
     * @return Reservation Object with specific ID
     */
    @WebMethod(operationName = "getReservationByUserIdAndCopyId")
    public Reservation getReservationByUserIdAndCopyId(final Integer user_id, final Integer copy_id) {
        try {
            Reservation reservation = reservationManager.getReservationByUserIdAndCopyId(user_id, copy_id);
            return reservation;
        } catch (Exception e) {
            logger.error("Error getReservationByUserIdAndCopyId method = " + e);
            return null;
        }
    }

    /**
     * WebService
     * Get a Precise Reservation List by Book ID
     *
     * @param book_id Book unique Identification number
     * @return
     */
    @WebMethod(operationName = "listreservationByBooks")
    public List<Reservation> reservationsByBooks(final Integer book_id) {
        try {
            List<Reservation> reservations = reservationManager.reservationsByBooks(book_id);
            if (reservations != null) {
                return reservations;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error reservationsByBooks method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Get a Precise Reservation List by User ID
     *
     * @param user_id User unique Identification number
     * @return
     */
    @WebMethod(operationName = "listreservationByUser")
    public List<Reservation> reservationsByUser(final Integer user_id) {
        try {
            List<Reservation> reservations = reservationManager.reservationsByUser(user_id);
            if (reservations != null) {
                return reservations;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error reservationsByUser method = " + e);
        }
        return null;
    }

    /**
     * WebService¬
     * Get ONE Precise Reservation Object by User ID AND Book ID
     *
     * @param user_id User unique Identification number
     * @param book_id Book unique Identification number
     * @return
     */
    @WebMethod(operationName = "reservationByUserAndByBooks")
    public Reservation reservationsByUserAndByBooks(final Integer user_id, final Integer book_id) {
        try {
            Reservation reservation = reservationManager.reservationsByUserAndByBooks(user_id, book_id);
            return reservation;
        } catch (Exception e) {
            logger.error("Error reservationsByUserAndByBooks method = " + e);
            return null;
        }
    }

}
