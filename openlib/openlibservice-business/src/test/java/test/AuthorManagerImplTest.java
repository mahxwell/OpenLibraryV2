package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.AuthorManager;
import org.mahxwell.openlib.model.bean.openlib.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@ContextConfiguration(locations = "classpath:application-context-business-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorManagerImplTest {


    @Autowired
    private AuthorManager authorManager;
    private static final Logger logger = Logger.getLogger(AuthorManagerImplTest.class);

    /**
     * Test
     * Initialize Author Object For Unit Tests
     *
     * @param name Set Author Name
     * @param surname Set Author Surname
     * @param nationality Set Author BirthDate
     * @return A Author Object
     */
    private Author InitializeAuthorObject(final String name, final String surname, final String nationality) {
        Author author = new Author();
        try {
            author.setAuthorName(name);
            author.setAuthorSurname(surname);
            author.setAuthorNationality(nationality);
            author.setAuthorBirthdate(new Date());
        } catch (Exception e) {
            logger.error(e);
        }
        return author;
    }
    /* Add New Author In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addAuthor() {

        try {
            Author author = InitializeAuthorObject("Titi", "Toto", "France");
            authorManager.addAuthor(author);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Author */

    @Test
    @Transactional
    @Rollback(true)
    public void updateAuthor() {

        try {
            Author author = InitializeAuthorObject("Titi", "Toto", "France");
            authorManager.addAuthor(author);

            Author authorUpdate = InitializeAuthorObject("Tata", "Papa", "UK");
            List<Author> authors = authorManager.Authors();
            authorManager.updateAuthor(authorUpdate, authors.get(0));
        } catch (Exception e) {
            logger.error(e);
        }
    }
    /* Delete Author */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteAuthor() {

        try {
            Author author = InitializeAuthorObject("Titi", "Toto", "France");
            authorManager.addAuthor(author);
            List<Author> authors = authorManager.Authors();
            authorManager.deleteAuthor(authors.get(0));
        } catch (Exception e) {
            logger.error(e);
        }
    }
    /* Show Author List */

    @Test
    @Transactional
    @Rollback(true)
    public void authors() {

        try {
            List<Author> authors = authorManager.Authors();
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
    @Transactional
    @Rollback(true)
    public void getAuthor() {
        try {
            List<Author> authors = authorManager.Authors();
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