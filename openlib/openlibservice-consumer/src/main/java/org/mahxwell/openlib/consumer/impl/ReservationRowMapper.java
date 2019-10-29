package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.model.bean.openlib.Reservation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservationRowMapper {

    public RowMapper<Reservation> getReservationRowMapper() {
        return getReservationRowMapper;
    }

    private RowMapper<Reservation> getReservationRowMapper = new RowMapper<Reservation>() {

        @Override
        public Reservation mapRow(ResultSet resultSet, int i) throws SQLException {
            Reservation reservation = new Reservation();
            reservation.setReservationId(resultSet.getInt("reservation_id"));
            reservation.setReservationDate(resultSet.getDate("reservation_date"));
            reservation.setGetBookId(resultSet.getInt("get_book_id"));
            reservation.setUserIdUser(resultSet.getInt("user_id_user"));
            reservation.setCopyIdCopy(resultSet.getInt("copy_id_copy"));
            return reservation;
        }
    };
}
