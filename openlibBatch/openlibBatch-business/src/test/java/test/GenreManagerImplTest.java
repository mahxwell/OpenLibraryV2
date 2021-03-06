package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.GenreManager;
import org.mahxwell.openlib.service.genre.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:business-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class GenreManagerImplTest {

    @Autowired
    private GenreManager genreManager;
    private static final Logger logger = Logger.getLogger(GenreManagerImplTest.class);

    /**
     * Test
     * Initialize Genre Object for Unit Tests
     *
     * @param genreName Set Genre Name
     * @return A Genre Object
     */
    private Genre InitializeGenreObject(final String genreName) {
        Genre genre = new Genre();
        try {
            genre.setGenreName(genreName);
        } catch (Exception e) {
            logger.error(e);
        }
        return genre;
    }

    /**
     * Test
     * Get Last Author Object in Data Base
     * @return Last Object -> For Delete
     */
    private Genre getLastGenre() {
        try {
            List<Genre> genres = genreManager.genres();
            return genres.get(genres.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    /* Add New Genre In DataBase */

    @Test
    public void addGenre() {
        try {
            Genre genre = InitializeGenreObject("Action");
            genreManager.addGenre(genre);
            genreManager.deleteGenre(getLastGenre());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Genre */

    @Test
    public void updateGenre() {
        try {
            Genre genre = InitializeGenreObject("Action");
            genreManager.addGenre(genre);
            genreManager.updateGenre(genre, getLastGenre());
            genreManager.deleteGenre(getLastGenre());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Genre */

    @Test
    public void deleteGenre() {
        try {
            Genre genre = InitializeGenreObject("Action");
            genreManager.addGenre(genre);
            genreManager.deleteGenre(getLastGenre());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Genre List */

    @Test
    public void genres() {
        try {
            List<Genre> genres = genreManager.genres();
            if (genres != null)
                logger.info(genres.toString());
            else
                logger.error("No Genre available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Genre By Identification Number */

    @Test
    public void getBookloaning() {
        try {
            List<Genre> genres = genreManager.genres();
            if (genres != null) {
                logger.info(genres.toString());
            } else {
                logger.error("No Genres available !");
            }
            Genre genre = genreManager.getGenre(1);
            Assert.assertEquals(genre.getGenreId(), genres.get(0).getGenreId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
