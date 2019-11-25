package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.BookManager;
import org.mahxwell.openlib.model.bean.openlib.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ContextConfiguration(locations = "classpath:application-context-business-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookManagerImplTest {


    @Autowired
    private BookManager bookManager;
    private static final Logger logger = Logger.getLogger(BookManagerImplTest.class);


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
            book.setLibraryIdLibrary(4);
            bookManager.addBook(book);
        }
    }

    /*  Update Book */

    @Test
    @Transactional
    @Rollback(true)
    public void updateBook() {
        List<Book> books = bookManager.Books();
        if (books != null || books.size() < 3) {
            Book book = new Book();
            book.setBookTitle("updatedTitle");
            book.setBookYear(3000);
            book.setEditorIdEditor(4);
            book.setAuthorIdAuthor(4);
            book.setGenreIdGenre(4);
            book.setLibraryIdLibrary(4);
            bookManager.updateBook(book, books.get(1));
        } else {
            logger.error("No Book or update Book out of range....");
        }
    }

    /* Delete Book */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteBook() {
        List<Book> books = bookManager.Books();
        if (books != null || books.size() < 3) {
            bookManager.deleteBook(books.get(1));
        } else {
            logger.error("No Book or update Book out of range....");
        }
    }

    /* Show Book List */

    @Test
    @Transactional
    @Rollback(true)
    public void books() {

        List<Book> books = bookManager.Books();
        if (books != null)
            logger.info(books.toString());
        else
            logger.error("No book available !");
    }
}