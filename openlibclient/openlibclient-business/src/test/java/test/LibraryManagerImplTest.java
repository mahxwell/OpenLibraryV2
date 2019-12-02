package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.LibraryManager;
import org.mahxwell.openlib.service.library.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:business-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class LibraryManagerImplTest {

    @Autowired
    LibraryManager libraryManager;
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

    /**
     * Test
     * Get Last Author Object in Data Base
     * @return Last Object -> For Delete
     */
    private Library getLastLibrary() {
        try {
            List<Library> libraries = libraryManager.libraries();
            return libraries.get(libraries.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }
    /* Add New Library In DataBase */

    @Test
    public void addLibrary() {
        try {
            Library library = InitializeLibraryObject("OpenLibCentrale", "75001");
            libraryManager.addLibrary(library);
            libraryManager.deleteLibrary(getLastLibrary());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Library */

    @Test
    public void updateLibrary() {
        try {
            Library library = InitializeLibraryObject("OpenLibCentraleUpdated", "75001");
            libraryManager.addLibrary(library);
            libraryManager.updateLibrary(library, getLastLibrary());
            libraryManager.deleteLibrary(getLastLibrary());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Library */

    @Test
    public void deleteLibrary() {
        try {
            Library library = InitializeLibraryObject("OpenLibCentrale", "75001");
            libraryManager.addLibrary(library);
            libraryManager.deleteLibrary(getLastLibrary());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Library List */

    @Test
    public void listLibrary() {
        try {
            List<Library> libraries = libraryManager.libraries();
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
    public void getLibrary() {
        try {
            List<Library> libraries = libraryManager.libraries();
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