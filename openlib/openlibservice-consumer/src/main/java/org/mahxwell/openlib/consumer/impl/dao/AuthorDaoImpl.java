package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.AuthorDao;
import org.mahxwell.openlib.consumer.impl.AuthorRowMapper;
import org.mahxwell.openlib.model.bean.openlib.Author;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Author Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class AuthorDaoImpl extends AbstractDaoImpl implements AuthorDao {


    /**
     * DAO
     * Add a New Author Object in DataBase
     *
     * @param newAuthor New Author Object
     */
    @Override
    public void addAuthor(final Author newAuthor) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.author(name, surname, nationality, birthdate) VALUES"
                + " (:name, :surname, :nationality, :birthdate)";

        parameters.addValue("name", newAuthor.getAuthorName());
        parameters.addValue("surname", newAuthor.getAuthorSurname());
        parameters.addValue("nationality", newAuthor.getAuthorNationality());
        parameters.addValue("birthdate", newAuthor.getAuthorBirthdate());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Update an Existing Author Object in DataBase
     *
     * @param authorToUpdate Author Object Updated
     * @param authorToFind   Author Object to update
     */
    @Override
    public void updateAuthor(final Author authorToUpdate, final Author authorToFind) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.author SET"
                + " name = :name, surname = :surname, nationality = :nationality, birthdate = :birthdate"
                + " WHERE author_id = :author_id";

        parameters.addValue("author_id", authorToFind.getAuthorId());
        parameters.addValue("name", authorToUpdate.getAuthorName());
        parameters.addValue("surname", authorToUpdate.getAuthorSurname());
        parameters.addValue("nationality", authorToUpdate.getAuthorNationality());
        parameters.addValue("birthdate", authorToUpdate.getAuthorBirthdate());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Delete an Existing Author Object in DataBase
     *
     * @param authorToDelete Author Object to delete
     */
    @Override
    public void deleteAuthor(final Author authorToDelete) {

        Integer author_id = authorToDelete.getAuthorId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.author WHERE author_id = :author_id";
        parameters.addValue("author_id", author_id);
        template.update(query, parameters);

        return;
    }


    /**
     * DAO
     * Get a Author List Object
     *
     * @return Users -> List of User Object
     */
    @Override
    public List<Author> Authors() {

        AuthorRowMapper authorRowMapper = new AuthorRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.author";

        List<Author> authors = template.query(query, authorRowMapper.getAuthorRowMapper());

        return authors;
    }

    /**
     * DAO
     * Get a Precise Author Object by Identification Number
     *
     * @param author_id Author unique Identification number
     * @return Author Object Found
     */
    @Override
    public Author getAuthor(final Integer author_id) {
        String query
                = "SELECT * FROM librarydb.author"
                + " WHERE author_id = " + author_id;

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        AuthorRowMapper authorRowMapper = new AuthorRowMapper();

        List<Author> authors = template.query(query, authorRowMapper.getAuthorRowMapper());
        return authors.get(0);
    }
}
