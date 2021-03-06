package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.GenreDao;
import org.mahxwell.openlib.model.bean.openlib.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class GenreDaoImplTest {

    @Autowired
    private GenreDao genreDao;
    private static final Logger logger = Logger.getLogger(GenreDaoImplTest.class);

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


    /* Add New Genre In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addGenre() {
        try {
            Genre genre = InitializeGenreObject("Action");
            genreDao.addGenre(genre);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Genre */

    @Test
    @Transactional
    @Rollback(true)
    public void updateGenre() {
        try {
            List<Genre> genres = genreDao.Genres();
            Genre genre = InitializeGenreObject("Updated");
            genreDao.updateGenre(genre, genres.get(0));
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Genre */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteGenre() {
        try {
            List<Genre> genres = genreDao.Genres();
            if (genres != null) {
                genreDao.deleteGenre(genres.get(1));
            } else {
                logger.error("Delete failed");
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Genre List */

    @Test
    @Transactional
    @Rollback(true)
    public void genres() {
        try {
            List<Genre> genres = genreDao.Genres();
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
    @Transactional
    @Rollback(true)
    public void getBookloaning() {
        try {
            List<Genre> genres = genreDao.Genres();
            if (genres != null) {
                logger.info(genres.toString());
            } else {
                logger.error("No Genres available !");
            }
            Genre genre = genreDao.getGenre(1);
            Assert.assertEquals(genre.getGenreId(), genres.get(0).getGenreId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}