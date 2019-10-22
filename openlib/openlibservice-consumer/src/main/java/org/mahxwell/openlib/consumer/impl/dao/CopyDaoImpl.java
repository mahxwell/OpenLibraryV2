package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.CopyDao;
import org.mahxwell.openlib.consumer.impl.CopyRowMapper;
import org.mahxwell.openlib.model.bean.openlib.Copy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Copy Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class CopyDaoImpl extends AbstractDaoImpl implements CopyDao {

    /**
     * DAO
     * Add a New Library Object in DataBase
     *
     * @param newCopy New Library Object
     */
    @Override
    public void addCopy(final Copy newCopy) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.copy(book_id_book) VALUES"
                + " (:book_id_book)";

        parameters.addValue("book_id_book", newCopy.getBookIdBook());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Update an Existing Copy Object in DataBase
     *
     * @param copyToUpdate Copy Object Updated
     * @param copyToFind   Copy Object to update
     */
    @Override
    public void updateCopy(final Copy copyToUpdate, final Copy copyToFind) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.copy SET"
                + " book_id_book = :book_id_book"
                + " WHERE copy_id = :copy_id";

        parameters.addValue("copy_id", copyToFind.getCopyId());
        parameters.addValue("book_id_book", copyToUpdate.getBookIdBook());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Delete an Existing Copy Object in DataBase
     *
     * @param copyToDelete Copy Object to delete
     */
    @Override
    public void deleteCopy(final Copy copyToDelete) {

        Integer copy_id = copyToDelete.getCopyId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.copy WHERE copy_id = :copy_id";
        parameters.addValue("copy_id", copy_id);
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Get a Copy List Object
     *
     * @return Copies -> List of Copy Object
     */
    @Override
    public List<Copy> Copies() {

        CopyRowMapper copyRowMapper = new CopyRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.copy";

        List<Copy> copies = template.query(query, copyRowMapper.getCopyRowMapper());

        return copies;
    }

    /**
     * DAO
     * Get a Copy List by Book Object
     *
     * @param book_id Book unique Identification Number
     * @return Copies -> List of Copy Object
     */
    @Override
    public List<Copy> CopiesByBook(final Integer book_id) {

        CopyRowMapper copyRowMapper = new CopyRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.copy WHERE book_id_book = " + book_id;

        List<Copy> copies = template.query(query, copyRowMapper.getCopyRowMapper());

        return copies;
    }

    /**
     * DAO
     * Get a Precise Copy Object by Identification Number
     *
     * @param copy_id Copy unique Identification number
     * @return Copy Object Found
     */
    @Override
    public Copy getCopy(final Integer copy_id) {
        String query
                = "SELECT * FROM librarydb.copy"
                + " WHERE copy_id = " + copy_id;

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        CopyRowMapper copyRowMapper = new CopyRowMapper();

        List<Copy> copies = template.query(query, copyRowMapper.getCopyRowMapper());
        return copies.get(0);
    }
}