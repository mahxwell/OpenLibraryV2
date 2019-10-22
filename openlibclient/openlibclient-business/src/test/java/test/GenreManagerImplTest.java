package test;

import org.apache.log4j.Logger;
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

    /* Add New Genre In DataBase */

    @Test
    public void addGenre() {
        /* Add 20 new genre */
        for (int i = 0; i < 20; i++) {
            Genre genre = new Genre();
            genre.setGenreName("genreName" + i);
            genreManager.addGenre(genre);
        }
    }

    /*  Update Genre */

    @Test
    public void updateGenre() {
        List<Genre> genres = genreManager.genres();
        if (genres != null || genres.size() < 3) {
            Genre genre = new Genre();
            genre.setGenreName("updatedName");
            genreManager.updateGenre(genre, genres.get(1));
        } else {
            logger.error("No Genre or update Genre out of range....");
        }
    }

    /* Delete Genre */

    @Test
    public void deleteGenre() {
        List<Genre> genres = genreManager.genres();
        if (genres != null || genres.size() < 3) {
            genreManager.deleteGenre(genres.get(1));
        } else {
            logger.error("Delete failed");
        }
    }

    /* Show Genre List */

    @Test
    public void genres() {
        List<Genre> genres = genreManager.genres();
        if (genres != null)
            logger.info(genres.toString());
        else
            logger.error("No Genre available !");
    }
}
