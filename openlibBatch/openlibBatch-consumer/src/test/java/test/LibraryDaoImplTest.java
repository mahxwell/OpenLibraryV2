package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.LibraryDao;
import org.mahxwell.openlib.service.library.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@ContextConfiguration(locations = "classpath:consumer-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class LibraryDaoImplTest {

    private static final Logger logger = Logger.getLogger(LibraryDaoImplTest.class);


    @Autowired
    LibraryDao libraryDao;


    @Test
    public void addLibrary() {

        Library library = new Library();

        library.setLibraryName("ClientLibrary");
        library.setLibraryPostCode("66666666");
        if (library != null)
            libraryDao.addLibrary(library);
        else
            logger.error("Could not add Library");
    }

    @Test
    public void updateLibrary() {

        List<Library> libraries = libraryDao.libraries();
        if (libraries.size() > 0) {
            Library library = libraries.get(0);

            Library updateLibrary = new Library();
            updateLibrary.setLibraryName("UpdatedLibrary");
            updateLibrary.setLibraryPostCode("UpdateCP");

            if (library != null && updateLibrary != null) {
                libraryDao.updateLibrary(updateLibrary, library);
            } else
                logger.error("Could not update library");

        } else
            logger.error("No Library available");
    }

    @Test
    public void deleteLibrary() {

        List<Library> libraries = libraryDao.libraries();

        if (libraries.size() > 0) {
            libraryDao.deleteLibrary(libraries.get(0));
        } else
            logger.error("Could not find library list");

    }

    @Test
    public void libraries() {
        List<Library> libraries = libraryDao.libraries();

        if (libraries == null)
            logger.error("Library list is null");
        else {
            for (int i = 0; i < libraries.size(); i++) {
                logger.info(libraries.get(i).getLibraryName());
            }
            logger.info("Finish");
        }
    }
}