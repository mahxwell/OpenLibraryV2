package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.AuthorManager;
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

@ContextConfiguration(locations = "classpath:business-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorManagerImplTest {

    @Autowired
    private AuthorManager authorManager;
    private static final Logger logger = Logger.getLogger(AuthorManagerImplTest.class);

    /**
     * Test
     * Initialize Author Object For Unit Tests
     *
     * @param name        Set Author Name
     * @param surname     Set Author Surname
     * @param nationality Set Author BirthDate
     * @return A Author Object
     */
    private Author InitializeAuthorObject(final String name, final String surname, final String nationality) {
        Author author = new Author();
        try {
            String formater = "yyyy-MM-dd'T'HH:mm:ss";

            DateFormat format = new SimpleDateFormat(formater);

            XMLGregorianCalendar gDateFormatted1 =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(new Date()));
            author.setAuthorName(name);
            author.setAuthorSurname(surname);
            author.setAuthorNationality(nationality);
            author.setAuthorBirthdate(gDateFormatted1);
        } catch (Exception e) {
            logger.error(e);
        }
        return author;
    }

    /**
     * Test
     * Get Last Author Object in Data Base
     * @return Last Object -> For Delete
     */
    private Author getLastAuthor() {
        try {
            List<Author> authors = authorManager.authors();
            return authors.get(authors.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    /* Add New Author In DataBase */

    @Test
    public void addAuthor() {

        try {
            Author author = InitializeAuthorObject("Titi", "Toto", "France");
            authorManager.addAuthor(author);
            authorManager.deleteAuthor(getLastAuthor());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Author */

    @Test
    public void updateAuthor() {

        try {
            Author author = InitializeAuthorObject("Titi", "Toto", "France");
            authorManager.addAuthor(author);
            Author authorUpdate = InitializeAuthorObject("Tata", "Papa", "UK");
            authorManager.updateAuthor(authorUpdate, getLastAuthor());
            authorManager.deleteAuthor(getLastAuthor());

        } catch (Exception e) {
            logger.error(e);
        }
    }
    /* Delete Author */

    @Test
    public void deleteAuthor() {

        try {
            Author author = InitializeAuthorObject("Titi", "Toto", "France");
            authorManager.addAuthor(author);
            authorManager.deleteAuthor(getLastAuthor());
        } catch (Exception e) {
            logger.error(e);
        }
    }
    /* Show Author List */

    @Test
    public void authors() {

        try {
            List<Author> authors = authorManager.authors();
            if (authors != null) {
                logger.info(authors.toString());
            } else {
                logger.error("No Authors available !");
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Author By Identification Number */

    @Test
    public void getAuthor() {
        try {
            List<Author> authors = authorManager.authors();
            if (authors != null) {
                logger.info(authors.toString());
            } else {
                logger.error("No Authors available !");
            }
            Author author = authorManager.getAuthor(1);
            Assert.assertEquals(author.getAuthorId(), authors.get(0).getAuthorId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
