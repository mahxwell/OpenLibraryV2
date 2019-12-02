package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
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


    /**
     * Test
     * Initialize BookLoaning Object For Unit Tests
     *
     * @param extended Set Extended Status
     * @param beginDate Set Loan Begin Date
     * @param endDate Set Loan Ending Date
     * @param getBookId Set Book Identification Number
     * @param copyId Set Copy Identification Number
     * @param userId Set User Identification Number
     * @return A Bookloaning Object
     */
    private Bookloaning InitializeBookLoaningObject(final Boolean extended, final Date beginDate, final Date endDate,
                                                   final Integer getBookId, final Integer copyId, final Integer userId) {
        Bookloaning bookloaning = new Bookloaning();
        try {
            bookloaning.setExtended(extended);
            bookloaning.setBeginDate(beginDate);
            bookloaning.setEndDate(endDate);
            bookloaning.setGetBookId(getBookId);
            bookloaning.setCopyIdCopy(copyId);
            bookloaning.setUserIdUser(userId);
        } catch (Exception e) {
            logger.error(e);
        }
        return bookloaning;
    }


    /* Add New Bookloaning In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addBookloaning() {

        try {
            Bookloaning bookloaning = InitializeBookLoaningObject(false,
                    new Date(), new Date(), 1, 1, 1);
            bookloaningDao.addBookloaning(bookloaning);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Bookloaning */

    @Test
    @Transactional
    @Rollback(true)
    public void updateBookloaning() {

        try {
            Bookloaning bookloaning = InitializeBookLoaningObject(true, new Date(),
                    new Date(), 1, 1, 1);
            List<Bookloaning> bookloanings = bookloaningDao.Bookloanings();

            bookloaningDao.updateBookloaning(bookloaning, bookloanings.get(0));
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Bookloaning */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteBookloaning() {

        try {
            List<Bookloaning> bookloanings = bookloaningDao.Bookloanings();
            bookloaningDao.deleteBookloaning(bookloanings.get(0));
        } catch (Exception e) {
            logger.error(e);
        }

    }

    /* Show Bookloaning List */

    @Test
    @Transactional
    @Rollback(true)
    public void bookloanings() {

        try {
            List<Bookloaning> bookloanings = bookloaningDao.Bookloanings();
            if (bookloanings != null)
                logger.info(bookloanings.toString());
            else
                logger.error("No Bookloaning available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Bookloaning List By User */

    @Test
    @Transactional
    @Rollback(true)
    public void bookloaningsByUser() {
        try {
            List<Bookloaning> bookloanings = bookloaningDao.bookloaningsByUser(1);
            if (bookloanings != null)
                logger.info(bookloanings.toString());
            else
                logger.error("No Bookloaning available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Bookloaning By Copy */

    @Test
    @Transactional
    @Rollback(true)
    public void bookloaningsByCopy() {
        try {
            List<Bookloaning> bookloanings = bookloaningDao.bookloaningsByCopy(1);
            if (bookloanings != null)
                logger.info(bookloanings.toString());
            else
                logger.error("No Bookloaning available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Show Bookloaning List  By User AND By Book*/

    @Test
    @Transactional
    @Rollback(true)
    public void bookloaningsByUserAndBook() {

        try {
            List<Bookloaning> bookloanings = bookloaningDao.bookloaningsByBookAndByUser(2, 1);
            if (bookloanings != null)
                logger.info(bookloanings.toString());
            else
                logger.error("No Bookloaning available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Bookloaning By Identification Number */

    @Test
    @Transactional
    @Rollback(true)
    public void getBookloaning() {
        try {
            List<Bookloaning> bookloanings = bookloaningDao.Bookloanings();
            if (bookloanings != null) {
                logger.info(bookloanings.toString());
            } else {
                logger.error("No Bookloanings available !");
            }
            Bookloaning bookloaning = bookloaningDao.getBookloaning(1);
            Assert.assertEquals(bookloaning.getBookLoaningId(), bookloanings.get(0).getBookLoaningId());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show BookloaningLate List */

    @Test
    @Transactional
    @Rollback(true)
    public void bookloaningsLate() {

        try {
            List<Bookloaning> bookloanings = bookloaningDao.getBookloaningLate();
            if (bookloanings != null)
                logger.info(bookloanings.toString());
            else
                logger.error("No Bookloaning available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Bookloaning List By Book*/

    @Test
    @Transactional
    @Rollback(true)
    public void bookloaningListByBook() {
        try {
            List<Bookloaning> bookloanings = bookloaningDao.bookloaningsByBook(1);
            if (bookloanings != null)
                logger.info(bookloanings.toString());
            else
                logger.error("No Bookloaning available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Bookloaning List By Book Ordered By Asc */

    @Test
    @Transactional
    @Rollback(true)
    public void bookloaningListByBookOrderByDate() {

        try {
            List<Bookloaning> bookloanings = bookloaningDao.bookloaningsByBookOrderByDateAsc(1);
            if (bookloanings != null)
                logger.info(bookloanings.toString());
            else
                logger.error("No Bookloaning available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }
}