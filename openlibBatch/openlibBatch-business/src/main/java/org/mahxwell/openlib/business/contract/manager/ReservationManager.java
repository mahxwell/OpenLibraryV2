package org.mahxwell.openlib.business.contract.manager;

import org.mahxwell.openlib.service.reservation.Reservation;

import java.util.List;

public interface ReservationManager {

    void addReservation(final Reservation newReservation);

    void updateReservation(final Reservation reservationToUpdate, final Reservation reservationToFind);

    void deleteReservation(final Reservation reservationToDelete);

    List<Reservation> Reservations();

    Reservation getReservation(final Integer reservation_id);

    Reservation getReservationByUserIdAndCopyId(final Integer user_id, final Integer copy_id);

    List<Reservation> reservationsByBooks(final Integer book_id);

    List<Reservation> reservationsByUser(final Integer user_id);

    Reservation reservationsByUserAndByBooks(final Integer user_id, final Integer book_id);

    List<Reservation> reservationsByCopyId(final Integer copy_id);

    List<Reservation> getReservationByMailDateNotNull();

    List<Reservation> reservationsOrderById();
}