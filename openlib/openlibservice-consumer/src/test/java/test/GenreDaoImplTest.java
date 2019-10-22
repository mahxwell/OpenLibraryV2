package test;

import org.apache.log4j.Logger;
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

    /* Add New Genre In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addGenre() {
        /* Add 20 new genre */
        for (int i = 0; i < 20; i++) {
            Genre genre = new Genre();
            genre.setGenreName("genreName" + i);
            genreDao.addGenre(genre);
        }
    }

    /*  Update Genre */

    @Test
    @Transactional
    @Rollback(true)
    public void updateGenre() {
        List<Genre> genres = genreDao.Genres();
        if (genres != null || genres.size() < 3) {
            Genre genre = new Genre();
            genre.setGenreName("updatedName");
            genreDao.updateGenre(genre, genres.get(1));
        } else {
            logger.error("No Genre or update Genre out of range....");
        }
    }

    /* Delete Genre */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteGenre() {
        List<Genre> genres = genreDao.Genres();
        if (genres != null || genres.size() < 3) {
            genreDao.deleteGenre(genres.get(1));
        } else {
            logger.error("Delete failed");
        }
    }

    /* Show Genre List */

    @Test
    @Transactional
    @Rollback(true)
    public void genres() {
        List<Genre> genres = genreDao.Genres();
        if (genres != null)
            logger.info(genres.toString());
        else
            logger.error("No Genre available !");
    }
}