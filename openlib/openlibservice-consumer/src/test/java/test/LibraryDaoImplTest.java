package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
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

    /**
     * Test
     * Initialize Library Object for Unit Tests
     *
     * @param libraryName Set Library Name
     * @param postCode Set Library Post Code
     * @return A Library Object
     */
    private Library InitializeLibraryObject(final String libraryName, final String postCode) {
        Library library = new Library();
        try {
            library.setLibraryName(libraryName);
            library.setLibraryPostCode(postCode);
        } catch (Exception e) {
            logger.error(e);
        }
        return library;
    }

    /* Add New Library In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addLibrary() {
        try {
            Library library = InitializeLibraryObject("OpenLibCentrale", "75001");
            libraryDao.addLibrary(library);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Library */

    @Test
    @Transactional
    @Rollback(true)
    public void updateLibrary() {
        try {
            List<Library> libraries = libraryDao.Libraries();
            Library library = InitializeLibraryObject("OpenLibUpdated", "75001");
            libraryDao.updateLibrary(library, libraries.get(0));
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Library */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteLibrary() {
        try {
            List<Library> libraries = libraryDao.Libraries();
            if (libraries != null) {
                libraryDao.deleteLibrary(libraries.get(1));
            } else {
                logger.error("No Library or update Library out of range....");
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Library List */

    @Test
    @Transactional
    @Rollback(true)
    public void listLibrary() {
        try {
            List<Library> libraries = libraryDao.Libraries();
            if (libraries != null)
                logger.info(libraries.toString());
            else
                logger.error("No library available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Library By Identification Number */

    @Test
    @Transactional
    @Rollback(true)
    public void getLibrary() {
        try {
            List<Library> libraries = libraryDao.Libraries();
            if (libraries != null) {
                logger.info(libraries.toString());
            } else {
                logger.error("No Libraries available !");
            }
            Library library = libraryDao.getLibrary(1);
            Assert.assertEquals(library.getLibraryId(), libraries.get(0).getLibraryId());
        } catch (Exception e) {
            logger.error(e);
        }
    }

}