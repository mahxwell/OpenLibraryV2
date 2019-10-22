package org.mahxwell.openlib.business.contract.manager;


import org.mahxwell.openlib.model.bean.openlib.Genre;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Genre Manager Interface</h2>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface GenreManager {
    void addGenre(final Genre newGenre);

    void updateGenre(final Genre genreToUpdate, final Genre genreIdToFind);

    void deleteGenre(final Genre genreId);

    List<Genre> Genres();

    Genre getGenre(final Integer genre_id);
}
