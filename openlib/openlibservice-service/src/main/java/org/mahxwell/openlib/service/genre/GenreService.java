package org.mahxwell.openlib.service.genre;

import org.apache.log4j.Logger;
import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.GenreManager;
import org.mahxwell.openlib.model.bean.openlib.Genre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Genre Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "genre")
public class GenreService extends AbstractManagerService {

    private static final Logger logger = Logger.getLogger(GenreService.class);

    /* Get GenreManager bean from Enum Contextloader */

    GenreManager genreManager = ContextLoader.INSTANCE.getGenreManager();

    /**
     * WebService
     * Get a Genre List Object
     *
     * @return Genres -> List of Genre Object
     */
    @WebMethod(operationName = "listgenre")
    public List<Genre> getGenreListService() {

        try {
            List<Genre> genres = genreManager.Genres();
            if (genres != null) {
                return genres;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listgenre method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Add a New Genre Object in DataBase
     *
     * @param newGenre New Genre Object
     */
    @WebMethod(operationName = "addGenre")
    public void addGenreService(final Genre newGenre) {
        try {
            genreManager.addGenre(newGenre);
        } catch (Exception e) {
            logger.error("Error addEditor method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing Genre Object in DataBase
     *
     * @param genreToUpdate Genre Object Updated
     * @param genreToFind   Genre Object to update
     */
    @WebMethod(operationName = "updateGenre")
    public void updateGenreService(final Genre genreToUpdate, final Genre genreToFind) {
        try {
            genreManager.updateGenre(genreToUpdate, genreToFind);
        } catch (Exception e) {
            logger.error("Error updateGenre method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing Genre Object in DataBase
     *
     * @param genreToDelete Genre Object to delete
     */
    @WebMethod(operationName = "deleteGenre")
    public void deleteGenreService(final Genre genreToDelete) {
        try {
            genreManager.deleteGenre(genreToDelete);
        } catch (Exception e) {
            logger.error("Error deleteGenre method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get a Precise Genre Object by Identification Number
     *
     * @param genre_id Genre unique Identification number
     * @return Genre Object Found
     */
    @WebMethod(operationName = "getGenre")
    public Genre getGenre(final Integer genre_id) {
        try {
            Genre genre = genreManager.getGenre(genre_id);
            if (genre != null)
                return genre;
            else
                return null;
        } catch (Exception e) {
            logger.error("Error getGenre method = " + e);
        }
        return null;
    }
}
