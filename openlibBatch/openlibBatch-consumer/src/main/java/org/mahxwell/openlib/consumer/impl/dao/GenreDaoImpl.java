package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.GenreDao;
import org.mahxwell.openlib.service.genre.Genre;
import org.mahxwell.openlib.service.genre.GenreService;
import org.mahxwell.openlib.service.genre.Genre_Service;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Genre Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
public class GenreDaoImpl implements GenreDao {

    private Genre_Service genre_service = new Genre_Service();
    private GenreService genreService = genre_service.getGenreServicePort();

    /**
     * DAO
     * Add a New Genre Object in DataBase
     *
     * @param newGenre New Genre Object
     */
    @Override
    public void addGenre(final Genre newGenre) {
        genreService.addGenre(newGenre);
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
        genreService.updateGenre(genreToUpdate, genreToFind);
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
        genreService.deleteGenre(genreToDelete);
        return;
    }

    /**
     * DAO
     * Get a Library List Object
     *
     * @return Libraries -> List of Library Object
     */
    @Override
    public List<Genre> genres() {
        return genreService.listgenre();
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
        return genreService.getGenre(genre_id);
    }
}
