package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.ReservationDao;
import org.mahxwell.openlib.consumer.impl.ReservationRowMapper;
import org.mahxwell.openlib.model.bean.openlib.Reservation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Reservation Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class ReservationDaoImpl extends AbstractDaoImpl implements ReservationDao {

    /**
     * DAO
     * Add a New Reservation Object in DataBase
     *
     * @param newReservation New Reservation Object
     */
    @Override
    public void addReservation(final Reservation newReservation) {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.reservation(reservation_date, get_book_id,  user_id_user, copy_id_copy) VALUES"
                + " (:reservation_date, :get_book_id, :user_id_user, :copy_id_copy)";

        parameters.addValue("reservation_date", newReservation.getReservationDate());
        parameters.addValue("get_book_id", newReservation.getGetBookId());
        parameters.addValue("user_id_user", newReservation.getUserIdUser());
        parameters.addValue("copy_id_copy", newReservation.getCopyIdCopy());
        template.update(query, parameters);

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

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.reservation SET"
                + " reservation_date = :reservation_date, get_book_id = :get_book_id,  user_id_user = :user_id_user, copy_id_copy = :copy_id_copy"
                + " WHERE reservation_id = :reservation_id";

        parameters.addValue("reservation_id", reservationToFind.getReservationId());
        parameters.addValue("reservation_date", reservationToUpdate.getReservationDate());
        parameters.addValue("get_book_id", reservationToUpdate.getGetBookId());
        parameters.addValue("user_id_user", reservationToUpdate.getUserIdUser());
        parameters.addValue("copy_id_copy", reservationToUpdate.getCopyIdCopy());
        template.update(query, parameters);

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

        Integer reservation_id = reservationToDelete.getReservationId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.reservation WHERE reservation_id = :reservation_id";
        parameters.addValue("reservation_id", reservation_id);
        template.update(query, parameters);

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

        ReservationRowMapper reservationRowMapper = new ReservationRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());
        String query = "SELECT * FROM librarydb.reservation";

        List<Reservation> reservations = template.query(query, reservationRowMapper.getReservationRowMapper());

        return reservations;
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

        String query
                = "SELECT * FROM librarydb.reservation"
                + " WHERE reservation_id = " + reservation_id;

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        ReservationRowMapper reservationRowMapper = new ReservationRowMapper();

        List<Reservation> reservations = template.query(query, reservationRowMapper.getReservationRowMapper());
        return reservations.get(0);
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

        ReservationRowMapper reservationRowMapper = new ReservationRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.reservation"
                + " WHERE user_id_user = " + "'" + user_id + "'"
                + " AND copy_id_copy = " + "'" + copy_id + "'";
        List<Reservation> reservations = template.query(query, reservationRowMapper.getReservationRowMapper());

        return reservations.get(0);
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

        ReservationRowMapper reservationRowMapper = new ReservationRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.reservation"
                + " WHERE get_book_id = " + "'" + book_id + "'";

        List<Reservation> reservations = template.query(query, reservationRowMapper.getReservationRowMapper());

        return reservations;
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

        ReservationRowMapper reservationRowMapper = new ReservationRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.reservation"
                + " WHERE user_id_user = " + "'" + user_id + "'";

        List<Reservation> reservations = template.query(query, reservationRowMapper.getReservationRowMapper());

        return reservations;
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

        ReservationRowMapper reservationRowMapper = new ReservationRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.reservation"
                + " WHERE user_id_user = " + "'" + user_id + "'"
                + " AND get_book_id = " + "'" + book_id + "'";
        List<Reservation> reservations = template.query(query, reservationRowMapper.getReservationRowMapper());

        return reservations.get(0);
    }
}
