package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.GenreManager;
import org.mahxwell.openlib.model.bean.openlib.Genre;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Genre Manager Implementation Class</h2>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
@Transactional
public class GenreManagerImpl extends AbstractManagerImpl implements GenreManager {

    /**
     * Manager
     * Add a New Genre Object in DataBase
     *
     * @param newGenre New Genre Object
     */
    @Override
    public void addGenre(final Genre newGenre) {
        getDaoFactory().getGenreDao().addGenre(newGenre);
        return;
    }

    /**
     * Manager
     * Update an Existing Genre Object in DataBase
     *
     * @param genreToUpdate Genre Object Updated
     * @param genreToFind   Genre Object to update
     */
    @Override
    public void updateGenre(final Genre genreToUpdate, final Genre genreToFind) {
        getDaoFactory().getGenreDao().updateGenre(genreToUpdate, genreToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing Genre Object in DataBase
     *
     * @param genreToDelete Genre Object to delete
     */
    @Override
    public void deleteGenre(final Genre genreToDelete) {
        getDaoFactory().getGenreDao().deleteGenre(genreToDelete);
        return;
    }

    /**
     * Manager
     * Get a Genre List Object
     *
     * @return Genres -> List of Genre Object
     */
    @Override
    public List<Genre> Genres() {
        return getDaoFactory().getGenreDao().Genres();
    }

    /**
     * Manager
     * Get a Precise Genre Object by Identification Number
     *
     * @param genre_id Genre unique Identification number
     * @return Genre Object Found
     */
    @Override
    public Genre getGenre(final Integer genre_id) {
        return getDaoFactory().getGenreDao().getGenre(genre_id);
    }
}
