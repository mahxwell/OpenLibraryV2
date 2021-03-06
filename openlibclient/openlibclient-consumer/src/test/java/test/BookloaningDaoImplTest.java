package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.BookloaningDao;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@ContextConfiguration(locations = "classpath:consumer-context-test.xml")
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

            String formater = "yyyy-MM-dd'T'HH:mm:ss";

            DateFormat format = new SimpleDateFormat(formater);

            XMLGregorianCalendar gDateFormatted =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(new Date()));

            bookloaning.setExtended(extended);
            bookloaning.setBeginDate(gDateFormatted);
            bookloaning.setEndDate(gDateFormatted);
            bookloaning.setGetBookId(getBookId);
            bookloaning.setCopyIdCopy(copyId);
            bookloaning.setUserIdUser(userId);
        } catch (Exception e) {
            logger.error(e);
        }
        return bookloaning;
    }

    /**
     * Test
     * Get Last Bookloaning Object in Data Base
     * @return Last Object -> For Delete
     */
    private Bookloaning getLastBookloaning() {
        try {
            List<Bookloaning> bookloanings = bookloaningDao.bookloanings();
            return bookloanings.get(bookloanings.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }


    /* Add New Bookloaning In DataBase */

    @Test
    public void addBookloaning() {

        try {
            Bookloaning bookloaning = InitializeBookLoaningObject(false,
                    new Date(), new Date(), 1, 1, 1);
            bookloaningDao.addBookloaning(bookloaning);
            bookloaningDao.deleteBookloaning(getLastBookloaning());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Bookloaning */

    @Test
    public void updateBookloaning() {

        try {
            Bookloaning bookloaning = InitializeBookLoaningObject(true,
                    new Date(), new Date(), 1, 1, 1);
            bookloaningDao.addBookloaning(bookloaning);
            bookloaningDao.updateBookloaning(bookloaning, getLastBookloaning());
            bookloaningDao.deleteBookloaning(getLastBookloaning());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Bookloaning */

    @Test
    public void deleteBookloaning() {

        try {
            Bookloaning bookloaning = InitializeBookLoaningObject(false,
                    new Date(), new Date(), 1, 1, 1);
            bookloaningDao.addBookloaning(bookloaning);
            bookloaningDao.deleteBookloaning(getLastBookloaning());
        } catch (Exception e) {
            logger.error(e);
        }

    }

    /* Show Bookloaning List */

    @Test
    public void bookloanings() {

        try {
            List<Bookloaning> bookloanings = bookloaningDao.bookloanings();
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
    public void getBookloaning() {
        try {
            List<Bookloaning> bookloanings = bookloaningDao.bookloanings();
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

    /* Show Bookloaning List By Book*/

    @Test
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
