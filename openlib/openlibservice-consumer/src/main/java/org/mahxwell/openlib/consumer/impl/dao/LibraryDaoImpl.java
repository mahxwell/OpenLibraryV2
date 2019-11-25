package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.LibraryDao;
import org.mahxwell.openlib.consumer.impl.LibraryRowMapper;
import org.mahxwell.openlib.model.bean.openlib.Library;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Library Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class LibraryDaoImpl extends AbstractDaoImpl implements LibraryDao {

    /**
     * DAO
     * Add a New Library Object in DataBase
     *
     * @param newLibrary New Library Object
     */
    @Override
    public void addLibrary(final Library newLibrary) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.library(name, post_code) VALUES"
                + " (:name, :post_code)";

        parameters.addValue("name", newLibrary.getLibraryName());
        parameters.addValue("post_code", newLibrary.getLibraryPostCode());
        template.update(query, parameters);

        return;

    }

    /**
     * DAO
     * Update an Existing Library Object in DataBase
     *
     * @param libraryToUpdate Library Object Updated
     * @param libraryToFind   Library Object to update
     */
    @Override
    public void updateLibrary(final Library libraryToUpdate, final Library libraryToFind) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.library SET"
                + " name = :name, post_code = :post_code"
                + " WHERE library_id = :library_id";

        parameters.addValue("library_id", libraryToFind.getLibraryId());
        parameters.addValue("name", libraryToUpdate.getLibraryName());
        parameters.addValue("post_code", libraryToUpdate.getLibraryPostCode());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Delete an Existing Library Object in DataBase
     *
     * @param libraryToDelete Library Object to delete
     */
    @Override
    public void deleteLibrary(final Library libraryToDelete) {

        Integer library_id = libraryToDelete.getLibraryId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.library WHERE library_id = :library_id";
        parameters.addValue("library_id", library_id);
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Get a Library List Object
     *
     * @return Libraries -> List of Library Object
     */
    @Override
    public List<Library> Libraries() {

        LibraryRowMapper libraryRowMapper = new LibraryRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.library";

        List<Library> libraries = template.query(query, libraryRowMapper.getLibraryRowMapper());

        return libraries;
    }


    /**
     * DAO
     * Get a Precise Library Object by Identification Number
     *
     * @param library_id Library unique Identification number
     * @return Library Object Found
     */
    @Override
    public Library getLibrary(final Integer library_id) {
        String query
                = "SELECT * FROM librarydb.library"
                + " WHERE library_id = " + library_id;

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        LibraryRowMapper libraryRowMapper = new LibraryRowMapper();

        List<Library> libraries = template.query(query, libraryRowMapper.getLibraryRowMapper());
        return libraries.get(0);
    }
}
