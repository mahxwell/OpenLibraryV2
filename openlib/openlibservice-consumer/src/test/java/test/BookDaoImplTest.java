package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.BookDao;
import org.mahxwell.openlib.model.bean.openlib.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookDaoImplTest {

    @Autowired
    private BookDao bookDao;
    private static final Logger logger = Logger.getLogger(BookDaoImplTest.class);


    /* Add New Book In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addBook() {
        /* Add 20 new Book */

        for (int i = 0; i < 20; i++) {
            Book book = new Book();
            book.setBookTitle("BookTitle" + i);
            book.setBookYear(1000 + i);
            book.setEditorIdEditor(4);
            book.setAuthorIdAuthor(4);
            book.setGenreIdGenre(4);
            book.setLibraryIdLibrary(1);
            bookDao.addBook(book);
        }
    }

    /*  Update Book */

    @Test
    @Transactional
    @Rollback(true)
    public void updateBook() {
        List<Book> books = bookDao.Books();
        if (books != null || books.size() < 3) {
            Book book = new Book();
            book.setBookTitle("updatedTitle");
            book.setBookYear(3000);
            book.setEditorIdEditor(4);
            book.setAuthorIdAuthor(4);
            book.setGenreIdGenre(4);
            book.setLibraryIdLibrary(4);
            bookDao.updateBook(book, books.get(1));
        } else {
            logger.error("No Book or update Book out of range....");
        }
    }

    /* Delete Book */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteBook() {
        List<Book> books = bookDao.Books();
        if (books != null || books.size() < 3) {
            bookDao.deleteBook(books.get(1));
        } else {
            logger.error("No Book or update Book out of range....");
        }
    }

    /* Show Book List */

    @Test
    @Transactional
    @Rollback(true)
    public void books() {

        List<Book> books = bookDao.Books();
        if (books != null)
            logger.info(books.toString());
        else
            logger.error("No book available !");
    }

    /* Search Test */


    /* Search By Title */

    @Test
    @Transactional
    @Rollback(true)
    public void SearchByTitletest() {

        List<Book> books = bookDao.SearchBookByTitle("BookTitle7");
        if (books != null)
            logger.info(books.toString());
        else
            logger.error("No book available !");
    }

    /* Advanced Search */

    @Test
    @Transactional
    @Rollback(true)
    public void AdvancedSearch() {
        List<Book> books = bookDao.AdvancedSearchBook("BookTitle7",
                "LibraryName0", "editorName3", "genreName3", "AuthorName0");
        if (books != null)
            logger.info(books.toString());
        else
            logger.error("No book available !");
    }

    /* Show Book Mail List */

    @Test
    @Transactional
    @Rollback(true)
    public void booksMail() {

        List<Book> books = bookDao.booksToSendMail();
        if (books != null)
            logger.info(books.toString());
        else
            logger.error("No book available !");
    }
}