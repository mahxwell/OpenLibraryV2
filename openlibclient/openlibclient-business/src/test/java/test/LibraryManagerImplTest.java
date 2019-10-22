package test;

import org.apache.log4j.Logger;
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

    private static final Logger logger = Logger.getLogger(LibraryManagerImplTest.class);

    @Autowired
    LibraryManager libraryManager;


    @Test
    public void addLibrary() {

        Library library = new Library();

        library.setLibraryName("LibraryNameClient");
        library.setLibraryPostCode("PCCLient");
        if (library != null)
            libraryManager.addLibrary(library);
        else
            logger.error("Library is null");
    }

    @Test
    public void updateLibrary() {
        List<Library> libraries = libraryManager.libraries();

        if (libraries.size() > 0) {

            Library library = libraries.get(0);

            Library updateLibrary = new Library();

            updateLibrary.setLibraryName("LibraryNameClientUpdated");
            updateLibrary.setLibraryPostCode("LibraryCPClientUpdated");
            if (library != null && updateLibrary != null) {
                libraryManager.updateLibrary(updateLibrary, library);
            } else
                logger.error("Could not update library");
        } else
            logger.error("No Library available");

    }

    @Test
    public void deleteLibrary() {
        List<Library> libraries = libraryManager.libraries();

        if (libraries.size() > 0)
            libraryManager.deleteLibrary(libraries.get(0));
        else
            logger.error("Could not find Library List");
    }

    @Test
    public void libraries() {
        List<Library> libraries = libraryManager.libraries();

        if (libraries == null)
            logger.error("Library list is null");
        else {
            for (int i = 0; i < libraries.size(); i++) {
                logger.info(libraries.get(i).getLibraryName());
            }
            logger.info("FINISHED");
        }
    }
}