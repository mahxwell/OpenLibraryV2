package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.LibraryManager;
import org.mahxwell.openlib.model.bean.openlib.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ContextConfiguration(locations = "classpath:application-context-business-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class LibraryManagerImplTest {

    @Autowired
    private LibraryManager libraryManager;
    private static final Logger logger = Logger.getLogger(LibraryManagerImplTest.class);


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
            libraryManager.addLibrary(library);
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
            List<Library> libraries = libraryManager.Libraries();
            Library library = InitializeLibraryObject("OpenLibUpdated", "75001");
            libraryManager.updateLibrary(library, libraries.get(0));
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
            List<Library> libraries = libraryManager.Libraries();
            if (libraries != null) {
                libraryManager.deleteLibrary(libraries.get(1));
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
            List<Library> libraries = libraryManager.Libraries();
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
            List<Library> libraries = libraryManager.Libraries();
            if (libraries != null) {
                logger.info(libraries.toString());
            } else {
                logger.error("No Libraries available !");
            }
            Library library = libraryManager.getLibrary(1);
            Assert.assertEquals(library.getLibraryId(), libraries.get(0).getLibraryId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}