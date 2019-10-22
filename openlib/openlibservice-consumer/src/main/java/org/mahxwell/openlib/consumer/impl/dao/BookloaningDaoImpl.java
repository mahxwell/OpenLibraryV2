package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.BookloaningDao;
import org.mahxwell.openlib.consumer.impl.BookloaningRowMapper;
import org.mahxwell.openlib.model.bean.openlib.Bookloaning;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Bookloaning Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class BookloaningDaoImpl extends AbstractDaoImpl implements BookloaningDao {

    /**
     * DAO
     * Add a New Bookloaning Object in DataBase
     *
     * @param newBookloaning New Bookloaning Object
     */
    @Override
    public void addBookloaning(final Bookloaning newBookloaning) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.bookloaning(is_extended, begin_date, endind_date, get_book_id,  user_id_user, copy_id_copy) VALUES"
                + " (:is_extended, :begin_date, :endind_date, :get_book_id, :user_id_user, :copy_id_copy)";

        parameters.addValue("is_extended", newBookloaning.isExtended());
        parameters.addValue("begin_date", newBookloaning.getBeginDate());
        parameters.addValue("endind_date", newBookloaning.getEndDate());
        parameters.addValue("get_book_id", newBookloaning.getGetBookId());
        parameters.addValue("user_id_user", newBookloaning.getUserIdUser());
        parameters.addValue("copy_id_copy", newBookloaning.getCopyIdCopy());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Update an Existing Bookloaning Object in DataBase
     *
     * @param bookloaningToUpdate Bookloaning Object Updated
     * @param bookloaningToFind   Bookloaning Object to update
     */
    @Override
    public void updateBookloaning(final Bookloaning bookloaningToUpdate, final Bookloaning bookloaningToFind) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.bookloaning SET"
                + " is_extended = :is_extended, begin_date = :begin_date, endind_date = :endind_date, get_book_id = :get_book_id,  user_id_user = :user_id_user, copy_id_copy = :copy_id_copy"
                + " WHERE bookloaning_id = :bookloaning_id";

        parameters.addValue("bookloaning_id", bookloaningToFind.getBookLoaningId());
        parameters.addValue("is_extended", bookloaningToUpdate.isExtended());
        parameters.addValue("begin_date", bookloaningToUpdate.getBeginDate());
        parameters.addValue("endind_date", bookloaningToUpdate.getEndDate());
        parameters.addValue("get_book_id", bookloaningToUpdate.getGetBookId());
        parameters.addValue("user_id_user", bookloaningToUpdate.getUserIdUser());
        parameters.addValue("copy_id_copy", bookloaningToUpdate.getCopyIdCopy());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Delete an Existing Bookloaning Object in DataBase
     *
     * @param bookloaningToDelete Bookloaning Object to delete
     */
    @Override
    public void deleteBookloaning(final Bookloaning bookloaningToDelete) {

        Integer bookloaning_id = bookloaningToDelete.getBookLoaningId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.bookloaning WHERE bookloaning_id = :bookloaning_id";
        parameters.addValue("bookloaning_id", bookloaning_id);
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Get a Bookloaning List Object
     *
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> Bookloanings() {

        BookloaningRowMapper bookloaningRowMapper = new BookloaningRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());
        String query = "SELECT * FROM librarydb.bookloaning";

        List<Bookloaning> bookloanings = template.query(query, bookloaningRowMapper.getBookloaningRowMapper());

        return bookloanings;
    }

    /**
     * DAO
     * Get a Precise Bookloaning Object by Identification Number
     *
     * @param bookloaning_id Bookloaning unique Identification number
     * @return Bookloaning Object Found
     */
    @Override
    public Bookloaning getBookloaning(final Integer bookloaning_id) {
        String query
                = "SELECT * FROM librarydb.bookloaning"
                + " WHERE bookloaning_id = " + bookloaning_id;

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        BookloaningRowMapper bookloaningRowMapper = new BookloaningRowMapper();

        List<Bookloaning> bookloanings = template.query(query, bookloaningRowMapper.getBookloaningRowMapper());
        return bookloanings.get(0);
    }

    /**
     * DAO
     * Get a Bookloaning List by User Object
     *
     * @param user_id User Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByUser(final Integer user_id) {
        BookloaningRowMapper bookloaningRowMapper = new BookloaningRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());
        String query = "SELECT * FROM librarydb.bookloaning WHERE user_id_user = " + user_id;

        List<Bookloaning> bookloanings = template.query(query, bookloaningRowMapper.getBookloaningRowMapper());
        return bookloanings;
    }

    /**
     * DAO
     * Get a Bookloaning List by Copy Object
     *
     * @param copy_id Copy Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByCopy(final Integer copy_id) {
        BookloaningRowMapper bookloaningRowMapper = new BookloaningRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());
        String query = "SELECT * FROM librarydb.bookloaning WHERE copy_id_copy = " + copy_id;

        List<Bookloaning> bookloanings = template.query(query, bookloaningRowMapper.getBookloaningRowMapper());
        return bookloanings;
    }

    /**
     * DAO
     * Get a Bookloaning List by Book Object
     *
     * @param book_id Book Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByBook(final Integer book_id) {
        BookloaningRowMapper bookloaningRowMapper = new BookloaningRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());
        String query = "SELECT * FROM librarydb.bookloaning WHERE get_book_id = " + book_id;

        List<Bookloaning> bookloanings = template.query(query, bookloaningRowMapper.getBookloaningRowMapper());
        return bookloanings;
    }

    /**
     * DAO
     * Get a Bookloaning List by Book Object AND User Object
     *
     * @param book_id Book Unique Identification Number
     * @param user_id User Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByBookAndByUser(final Integer book_id, final Integer user_id) {
        BookloaningRowMapper bookloaningRowMapper = new BookloaningRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.bookloaning"
                + " WHERE get_book_id = " + "'" + book_id + "'"
                + " AND user_id_user = " + "'" + user_id + "'";
        List<Bookloaning> bookloanings = template.query(query, bookloaningRowMapper.getBookloaningRowMapper());
        return bookloanings;
    }

    /**
     * DAO
     * Get all Bookloaning Object where deadline is passed
     *
     * @return
     */
    @Override
    public List<Bookloaning> getBookloaningLate() {

        BookloaningRowMapper bookloaningRowMapper = new BookloaningRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());
        String query = "SELECT * FROM librarydb.bookloaning WHERE endind_date <= current_date ";

        List<Bookloaning> bookloanings = template.query(query, bookloaningRowMapper.getBookloaningRowMapper());
        return bookloanings;
    }
}

