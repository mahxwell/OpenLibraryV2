package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.AuthorDao;
import org.mahxwell.openlib.service.author.Author;
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
public class AuthorDaoImplTest {

    @Autowired
    private AuthorDao authorDao;
    private static final Logger logger = Logger.getLogger(AuthorDaoImplTest.class);

    /* Add New Author In DataBase */

    @Test
    public void addAuthor() {

        try {

            String formater = "yyyy-MM-dd'T'HH:mm:ss";

            DateFormat format = new SimpleDateFormat(formater);

            Date date = new Date();
            XMLGregorianCalendar gDateFormatted1 =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));

            //  Date date = new Date();
            /* Add 20 new author */
            for (int i = 0; i < 20; i++) {
                Author author = new Author();
                author.setAuthorName("AuthorName" + i);
                author.setAuthorSurname("AuthorSurName" + i);
                author.setAuthorNationality("AuthorNationality" + i);
                author.setAuthorBirthdate(gDateFormatted1);
                authorDao.addAuthor(author);
            }
        } catch (Exception e) {
            logger.error("Error addAuthor Test = " + e);
        }
    }

    /*  Update Author */

    @Test
    public void updateAuthor() {
        try {

            String formater = "yyyy-MM-dd'T'HH:mm:ss";

            DateFormat format = new SimpleDateFormat(formater);

            Date date = new Date();
            XMLGregorianCalendar gDateFormatted1 =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));

            List<Author> authors = authorDao.authors();
            if (authors != null || authors.size() < 3) {
                Author author = new Author();
                author.setAuthorName("updatedName");
                author.setAuthorSurname("updatedSurname");
                author.setAuthorNationality("updatedNationality");
                author.setAuthorBirthdate(gDateFormatted1);
                authorDao.updateAuthor(author, authors.get(1));
            } else {
                logger.error("No Author or update Author out of range....");
            }
        } catch (Exception e) {
            logger.error("Error updateAuthor Test = " + e);
        }
    }
    /* Delete Author */

    @Test
    public void deleteAuthor() {

        List<Author> authors = authorDao.authors();
        if (authors != null || authors.size() < 3) {
            authorDao.deleteAuthor(authors.get(1));
        } else {
            logger.error("Delete failed");
        }

    }
    /* Show Author List */

    @Test
    public void authors() {
        List<Author> authors = authorDao.authors();
        if (authors != null)
            logger.info(authors.toString());
        else
            logger.error("No Authors available !");
    }
}
