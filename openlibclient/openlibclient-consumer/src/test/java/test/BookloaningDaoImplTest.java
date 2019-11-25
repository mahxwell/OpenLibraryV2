package test;

import org.apache.log4j.Logger;
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

    /* Add New Bookloaning In DataBase */

    @Test
    public void addBookloaning() {

        try {

            String formater = "yyyy-MM-dd'T'HH:mm:ss";

            DateFormat format = new SimpleDateFormat(formater);

            Date date = new Date();
            XMLGregorianCalendar gDateFormatted1 =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
            int n = 1;
            /* Add 20 new Bookloaning */
            for (int i = 0; i < 10; i++) {
                Bookloaning bookloaning = new Bookloaning();
                bookloaning.setExtended(true);
                bookloaning.setBeginDate(gDateFormatted1);
                bookloaning.setEndDate(gDateFormatted1);
                bookloaning.setGetBookId(1);
                bookloaning.setUserIdUser(1);
                bookloaning.setCopyIdCopy(n = n + 1);
                bookloaningDao.addBookloaning(bookloaning);
            }
        } catch (Exception e) {
            logger.error("Error addBookLoaningTest method = " + e);
        }
    }

    /*  Update Bookloaning */

    @Test
    public void updateBookloaning() {

        try {

            String formater = "yyyy-MM-dd'T'HH:mm:ss";

            DateFormat format = new SimpleDateFormat(formater);

            Date date = new Date();
            XMLGregorianCalendar gDateFormatted1 =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
            List<Bookloaning> bookloanings = bookloaningDao.bookloanings();
            if (bookloanings != null || bookloanings.size() < 3) {
                Bookloaning bookloaning = new Bookloaning();
                bookloaning.setExtended(true);
                bookloaning.setBeginDate(gDateFormatted1);
                bookloaning.setEndDate(gDateFormatted1);
                bookloaning.setUserIdUser(2);
                bookloaning.setCopyIdCopy(15);
                bookloaningDao.updateBookloaning(bookloaning, bookloanings.get(0));
            } else {
                logger.error("No Bookloaning or update Bookloaning out of range....");
            }
        } catch (Exception e) {
            logger.error("Error updateBookloaningtest method = " + e);
        }
    }

    /* Delete Bookloaning */

    @Test
    public void deleteBookloaning() {
        List<Bookloaning> bookloanings = bookloaningDao.bookloanings();
        if (bookloanings != null || bookloanings.size() < 3) {
            bookloaningDao.deleteBookloaning(bookloanings.get(1));
        } else {
            logger.error("No Bookloaning or update Bookloaning out of range....");
        }

    }

    /* Show Bookloaning List */

    @Test
    public void bookloanings() {
        List<Bookloaning> bookloanings = bookloaningDao.bookloanings();
        if (bookloanings != null)
            logger.info(bookloanings.toString());
        else
            logger.error("No Bookloaning available !");
    }

    /* Show Bookloaning List */

    @Test
    public void bookloaningsByBookAndUser() {
        List<Bookloaning> bookloanings = bookloaningDao.bookloaningsByBookAndByUser(2, 2);
        if (bookloanings != null)
            logger.info(bookloanings.toString());
        else
            logger.error("No Bookloaning available !");
    }

    @Test
    public void bookloaningsByBookAndUserByDare() {
        List<Bookloaning> bookloanings = bookloaningDao.bookloaningsByBookOrderByDateAsc(1);
        if (bookloanings != null)
            logger.info(bookloanings.toString());
        else
            logger.error("No Bookloaning available !");
    }
}
