package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.AuthorDao;
import org.mahxwell.openlib.model.bean.openlib.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorDaoImplTest {


    @Autowired
    private AuthorDao authorDao;
    private static final Logger logger = Logger.getLogger(AuthorDaoImplTest.class);

    /* Add New Author In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addAuthor() {
        Date date = new Date();
        /* Add 20 new author */
        for (int i = 0; i < 20; i++) {
            Author author = new Author();
            author.setAuthorName("AuthorName" + i);
            author.setAuthorSurname("AuthorSurName" + i);
            author.setAuthorNationality("AuthorNationality" + i);
            author.setAuthorBirthdate(date);
            authorDao.addAuthor(author);
        }
    }

    /*  Update Author */

    @Test
    @Transactional
    @Rollback(true)
    public void updateAuthor() {
        List<Author> authors = authorDao.Authors();
        Date date = new Date();
        if (authors != null || authors.size() < 3) {
            Author author = new Author();
            author.setAuthorName("updatedName");
            author.setAuthorSurname("updatedSurname");
            author.setAuthorNationality("updatedNationality");
            author.setAuthorBirthdate(date);
            authorDao.updateAuthor(author, authors.get(1));
        } else {
            logger.error("No Author or update Author out of range....");
        }
    }
    /* Delete Author */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteAuthor() {

        List<Author> authors = authorDao.Authors();
        if (authors != null || authors.size() < 3) {
            authorDao.deleteAuthor(authors.get(1));
        } else {
            logger.error("Delete failed");
        }

    }
    /* Show Author List */

    @Test
    @Transactional
    @Rollback(true)
    public void authors() {
        List<Author> authors = authorDao.Authors();
        if (authors != null)
            logger.info(authors.toString());
        else
            logger.error("No Authors available !");
    }
}