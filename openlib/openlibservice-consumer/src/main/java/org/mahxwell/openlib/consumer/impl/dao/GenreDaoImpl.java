package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.GenreDao;
import org.mahxwell.openlib.consumer.impl.GenreRowMapper;
import org.mahxwell.openlib.model.bean.openlib.Genre;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Genre Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class GenreDaoImpl extends AbstractDaoImpl implements GenreDao {

    /**
     * DAO
     * Add a New Genre Object in DataBase
     *
     * @param newGenre New Genre Object
     */
    @Override
    public void addGenre(final Genre newGenre) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.genre(name) VALUES"
                + " (:name)";

        parameters.addValue("name", newGenre.getGenreName());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Update an Existing Genre Object in DataBase
     *
     * @param genreToUpdate Genre Object Updated
     * @param genreToFind   Genre Object to update
     */
    @Override
    public void updateGenre(final Genre genreToUpdate, final Genre genreToFind) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.genre SET"
                + " name = :name"
                + " WHERE genre_id = :genre_id";

        parameters.addValue("genre_id", genreToFind.getGenreId());
        parameters.addValue("name", genreToUpdate.getGenreName());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Delete an Existing Genre Object in DataBase
     *
     * @param genreToDelete Genre Object to delete
     */
    @Override
    public void deleteGenre(final Genre genreToDelete) {

        Integer genre_id = genreToDelete.getGenreId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.genre WHERE genre_id = :genre_id";
        parameters.addValue("genre_id", genre_id);
        template.update(query, parameters);
    }

    /**
     * DAO
     * Get a Library List Object
     *
     * @return Libraries -> List of Library Object
     */
    @Override
    public List<Genre> Genres() {

        GenreRowMapper genreRowMapper = new GenreRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.genre";

        List<Genre> genres = template.query(query, genreRowMapper.getGenreRowMapper());

        return genres;
    }

    /**
     * DAO
     * Get a Precise Genre Object by Identification Number
     *
     * @param genre_id Genre unique Identification number
     * @return Genre Object Found
     */
    @Override
    public Genre getGenre(final Integer genre_id) {
        String query
                = "SELECT * FROM librarydb.genre"
                + " WHERE genre_id = " + genre_id;

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        GenreRowMapper genreRowMapper = new GenreRowMapper();

        List<Genre> genres = template.query(query, genreRowMapper.getGenreRowMapper());
        return genres.get(0);
    }
}