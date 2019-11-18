package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.ReservationDao;
import org.mahxwell.openlib.service.reservation.Reservation;
import org.mahxwell.openlib.service.reservation.ReservationService;
import org.mahxwell.openlib.service.reservation.Reservation_Service;

import java.util.List;

public class ReservationDaoImpl implements ReservationDao {

    private Reservation_Service reservation_service = new Reservation_Service();
    private ReservationService reservationService = reservation_service.getReservationServicePort();

    /**
     * DAO
     * Add a New Reservation Object in DataBase
     *
     * @param newReservation New Reservation Object
     */
    @Override
    public void addReservation(final Reservation newReservation) {
        reservationService.addReservation(newReservation);
        return;
    }

    /**
     * DAO
     * Update an Existing Reservation Object in DataBase
     *
     * @param reservationToUpdate Reservation Object Updated
     * @param reservationToFind   Reservation Object to update
     */
    @Override
    public void updateReservation(final Reservation reservationToUpdate, final Reservation reservationToFind) {
        reservationService.updateReservation(reservationToUpdate, reservationToFind);
        return;
    }

    /**
     * DAO
     * Delete an Existing Bookloaning Object in DataBase
     *
     * @param reservationToDelete Bookloaning Object to delete
     */
    @Override
    public void deleteReservation(final Reservation reservationToDelete) {
        reservationService.deleteReservation(reservationToDelete);
        return;
    }

    /**
     * DAO
     * Get a Reservation List Object
     *
     * @return Reservations -> List of Reservation Object
     */
    @Override
    public List<Reservation> Reservations() {
        return reservationService.listreservation();
    }

    /**
     * DAO
     * Get a Precise Reservation Object by Identification Number
     *
     * @param reservation_id Reservation unique Identification number
     * @return Reservation Object Found
     */
    @Override
    public Reservation getReservation(final Integer reservation_id) {
        return reservationService.getReservation(reservation_id);
    }

    /**
     * DAO
     * Get a Precise Reservation Object by User ID and Copy ID
     *
     * @param user_id User unique Identification number
     * @param copy_id Copy unique Identification number
     * @return Reservation Object with specific ID
     */
    @Override
    public Reservation getReservationByUserIdAndCopyId(final Integer user_id, final Integer copy_id) {
        return reservationService.getReservationByUserIdAndCopyId(user_id, copy_id);
    }

    /**
     * DAO
     * Get a Precise Reservation List by Book ID
     *
     * @param book_id Book unique Identification number
     * @return
     */
    @Override
    public List<Reservation> reservationsByBooks(final Integer book_id) {
        return reservationService.listreservationByBooks(book_id);
    }

    /**
     * DAO
     * Get a Precise Reservation List by User ID
     *
     * @param user_id User unique Identification number
     * @return
     */
    @Override
    public List<Reservation> reservationsByUser(final Integer user_id) {
        return reservationService.listreservationByUser(user_id);
    }

    /**
     * DAO
     * Get ONE Precise Reservation Object by User ID AND Book ID
     *
     * @param user_id User unique Identification number
     * @param book_id Book unique Identification number
     * @return
     */
    @Override
    public Reservation reservationsByUserAndByBooks(final Integer user_id, final Integer book_id) {
        return reservationService.reservationByUserAndByBooks(user_id, book_id);
    }

    /**
     * DAO
     * Get a Reservation Object List by Copy_id
     *
     * @param copy_id Copy unique Identification number
     * @return
     */
    @Override
    public List<Reservation> reservationsByCopyId(final Integer copy_id) {
        return reservationService.reservationsByCopyId(copy_id);
    }
}
