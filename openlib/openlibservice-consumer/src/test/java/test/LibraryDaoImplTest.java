package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.LibraryDao;
import org.mahxwell.openlib.model.bean.openlib.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class LibraryDaoImplTest {

    @Autowired
    private LibraryDao libraryDao;
    private static final Logger logger = Logger.getLogger(LibraryDaoImplTest.class);

    /* Add New Library In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addLibrary() {

        /* Add 20 new library */
        for (int i = 0; i < 20; i++) {
            Library library = new Library();
            library.setLibraryName("LibraryName" + i);
            library.setLibraryPostCode("54000");
            libraryDao.addLibrary(library);
        }
    }

    /*  Update Library */

    @Test
    @Transactional
    @Rollback(true)
    public void updateLibrary() {

        List<Library> libraries = libraryDao.Libraries();
        if (libraries != null || libraries.size() < 3) {
            Library library = new Library();
            library.setLibraryName("updateLib");
            library.setLibraryPostCode("update0000");
            libraryDao.updateLibrary(library, libraries.get(1));
        } else {
            logger.error("No Library or update Library out of range....");
        }
    }

    /* Delete Library */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteLibrary() {

        List<Library> libraries = libraryDao.Libraries();
        if (libraries != null || libraries.size() < 3) {
            libraryDao.deleteLibrary(libraries.get(1));
        } else {
            logger.error("No Library or update Library out of range....");
        }

    }

    /* Show Library List */

    @Test
    @Transactional
    @Rollback(true)
    public void listLibrary() {

        List<Library> libraries = libraryDao.Libraries();
        if (libraries != null)
            logger.info(libraries.toString());
        else
            logger.error("No library available !");
    }

}