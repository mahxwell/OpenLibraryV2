package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.ReservationManager;
import org.mahxwell.openlib.service.reservation.Reservation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Reservation Manager Implementation Class</h2>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
@Transactional
public class ReservationManagerImpl extends AbstractManagerImpl implements ReservationManager {

    /**
     * Manager
     * Add a New Reservation Object in DataBase
     *
     * @param newReservation New Reservation Object
     */
    @Override
    public void addReservation(final Reservation newReservation) {
        getDaoFactory().getReservationDao().addReservation(newReservation);
        return;
    }

    /**
     * Manager
     * Update an Existing Reservation Object in DataBase
     *
     * @param reservationToUpdate Reservation Object Updated
     * @param reservationToFind   Reservation Object to update
     */
    @Override
    public void updateReservation(final Reservation reservationToUpdate, final Reservation reservationToFind) {
        getDaoFactory().getReservationDao().updateReservation(reservationToUpdate, reservationToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing Bookloaning Object in DataBase
     *
     * @param reservationToDelete Bookloaning Object to delete
     */
    @Override
    public void deleteReservation(final Reservation reservationToDelete) {
        getDaoFactory().getReservationDao().deleteReservation(reservationToDelete);
        return;
    }

    /**
     * Manager
     * Get a Reservation List Object
     *
     * @return Reservations -> List of Reservation Object
     */
    @Override
    public List<Reservation> Reservations() {
        return getDaoFactory().getReservationDao().Reservations();
    }

    /**
     * Manager
     * Get a Precise Reservation Object by Identification Number
     *
     * @param reservation_id Reservation unique Identification number
     * @return Reservation Object Found
     */
    @Override
    public Reservation getReservation(final Integer reservation_id) {
        return getDaoFactory().getReservationDao().getReservation(reservation_id);
    }

    /**
     * Manager
     * Get a Precise Reservation Object by User ID and Copy ID
     *
     * @param user_id User unique Identification number
     * @param copy_id Copy unique Identification number
     * @return Reservation Object with specific ID
     */
    @Override
    public Reservation getReservationByUserIdAndCopyId(final Integer user_id, final Integer copy_id) {
        return getDaoFactory().getReservationDao().getReservationByUserIdAndCopyId(user_id, copy_id);
    }

    /**
     * Manager
     * Get a Precise Reservation List by Book ID
     *
     * @param book_id Book unique Identification number
     * @return
     */
    @Override
    public List<Reservation> reservationsByBooks(final Integer book_id) {
        return getDaoFactory().getReservationDao().reservationsByBooks(book_id);
    }

    /**
     * Manager
     * Get a Precise Reservation List by User ID
     *
     * @param user_id User unique Identification number
     * @return
     */
    @Override
    public List<Reservation> reservationsByUser(final Integer user_id) {
        return getDaoFactory().getReservationDao().reservationsByUser(user_id);
    }

    /**
     * Manager
     * Get ONE Precise Reservation Object by User ID AND Book ID
     *
     * @param user_id User unique Identification number
     * @param book_id Book unique Identification number
     * @return
     */
    @Override
    public Reservation reservationsByUserAndByBooks(final Integer user_id, final Integer book_id) {
        return getDaoFactory().getReservationDao().reservationsByUserAndByBooks(user_id, book_id);
    }

}
