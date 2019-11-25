package test;

import org.apache.log4j.Logger;
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
            libraryManager.addLibrary(library);
        }
    }

    /*  Update Library */

    @Test
    @Transactional
    @Rollback(true)
    public void updateLibrary() {

        List<Library> libraries = libraryManager.Libraries();
        if (libraries != null || libraries.size() < 3) {
            Library library = new Library();
            library.setLibraryName("updateLib");
            library.setLibraryPostCode("update0000");
            libraryManager.updateLibrary(library, libraries.get(1));
        } else {
            logger.error("No Library or update Library out of range....");
        }
    }

    /* Delete Library */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteLibrary() {

        List<Library> libraries = libraryManager.Libraries();
        if (libraries != null || libraries.size() < 3) {
            libraryManager.deleteLibrary(libraries.get(1));
        } else {
            logger.error("No Library or update Library out of range....");
        }

    }

    /* Show Library List */

    @Test
    @Transactional
    @Rollback(true)
    public void listLibrary() {

        List<Library> libraries = libraryManager.Libraries();
        if (libraries != null)
            logger.info(libraries.toString());
        else
            logger.error("No library available !");
    }

}