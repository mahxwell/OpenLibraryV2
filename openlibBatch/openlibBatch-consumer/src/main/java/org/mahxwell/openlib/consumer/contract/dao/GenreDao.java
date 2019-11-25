package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.service.genre.Genre;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Genre Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface GenreDao {

    void addGenre(final Genre newGenre);

    void updateGenre(final Genre genreToUpdate, final Genre genreToFind);

    void deleteGenre(final Genre genreToDelete);

    List<Genre> genres();

    Genre getGenre(final Integer genre_id);
}
