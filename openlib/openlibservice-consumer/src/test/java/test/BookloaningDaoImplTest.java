package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.BookloaningDao;
import org.mahxwell.openlib.model.bean.openlib.Bookloaning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookloaningDaoImplTest {

    @Autowired
    private BookloaningDao bookloaningDao;
    private static final Logger logger = Logger.getLogger(BookloaningDaoImplTest.class);

    /* Add New Bookloaning In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addBookloaning() {

        Date date = new Date();

        int n = 1;
        /* Add 20 new Bookloaning */
        for (int i = 0; i < 10; i++) {
            Bookloaning bookloaning = new Bookloaning();
            bookloaning.setExtended(true);
            bookloaning.setBeginDate(date);
            bookloaning.setEndDate(date);
            bookloaning.setGetBookId(1);
            bookloaning.setUserIdUser(1);
            bookloaning.setCopyIdCopy(n = n + 1);
            bookloaningDao.addBookloaning(bookloaning);
        }
    }

    /*  Update Bookloaning */

    @Test
    @Transactional
    @Rollback(true)
    public void updateBookloaning() {
        Date date = new Date();
        List<Bookloaning> bookloanings = bookloaningDao.Bookloanings();
        if (bookloanings != null || bookloanings.size() < 3) {
            Bookloaning bookloaning = new Bookloaning();
            bookloaning.setExtended(true);
            bookloaning.setBeginDate(date);
            bookloaning.setEndDate(date);
            bookloaning.setGetBookId(1);
            bookloaning.setUserIdUser(2);
            bookloaning.setCopyIdCopy(15);
            bookloaningDao.updateBookloaning(bookloaning, bookloanings.get(0));
        } else {
            logger.error("No Bookloaning or update Bookloaning out of range....");
        }

    }

    /* Delete Bookloaning */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteBookloaning() {
        List<Bookloaning> bookloanings = bookloaningDao.Bookloanings();
        if (bookloanings != null || bookloanings.size() < 3) {
            bookloaningDao.deleteBookloaning(bookloanings.get(1));
        } else {
            logger.error("No Bookloaning or update Bookloaning out of range....");
        }

    }

    /* Show Bookloaning List */

    @Test
    @Transactional
    @Rollback(true)
    public void bookloanings() {
        List<Bookloaning> bookloanings = bookloaningDao.Bookloanings();
        if (bookloanings != null)
            logger.info(bookloanings.toString());
        else
            logger.error("No Bookloaning available !");
    }

    /* Show Bookloaning List */

    @Test
    @Transactional
    @Rollback(true)
    public void bookloaningsByUserAndBook() {
        List<Bookloaning> bookloanings = bookloaningDao.bookloaningsByBookAndByUser(4, 1);
        if (bookloanings != null)
            logger.info(bookloanings.toString());
        else
            logger.error("No Bookloaning available !");
    }

    /* Show BookloaningLate List */

    @Test
    @Transactional
    @Rollback(true)
    public void bookloaningsLate() {
        List<Bookloaning> bookloanings = bookloaningDao.getBookloaningLate();
        if (bookloanings != null)
            logger.info(bookloanings.toString());
        else
            logger.error("No Bookloaning available !");
    }
}