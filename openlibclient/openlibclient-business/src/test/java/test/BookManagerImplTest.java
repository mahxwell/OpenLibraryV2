package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.BookManager;
import org.mahxwell.openlib.service.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:business-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookManagerImplTest {


    @Autowired
    private BookManager bookManager;
    private static final Logger logger = Logger.getLogger(BookManagerImplTest.class);


    /* Add New Book In DataBase */

    @Test
    public void addBook() {
        /* Add 20 new Book */

        for (int i = 0; i < 20; i++) {
            Book book = new Book();
            book.setBookTitle("BookTitle" + i);
            book.setBookYear(1000 + i);
            book.setEditorIdEditor(22);
            book.setAuthorIdAuthor(22);
            book.setGenreIdGenre(22);
            book.setLibraryIdLibrary(22);
            bookManager.addBook(book);
        }
    }

    /*  Update Book */

    @Test
    public void updateBook() {
        List<Book> books = bookManager.books();
        if (books != null || books.size() < 3) {
            Book book = new Book();
            book.setBookTitle("updatedTitle");
            book.setBookYear(3000);
            book.setEditorIdEditor(22);
            book.setAuthorIdAuthor(22);
            book.setGenreIdGenre(22);
            book.setLibraryIdLibrary(22);
            bookManager.updateBook(book, books.get(1));
        } else {
            logger.error("No Book or update Book out of range....");
        }
    }

    /* Delete Book */

    @Test
    public void deleteBook() {
        List<Book> books = bookManager.books();
        if (books != null || books.size() < 3) {
            bookManager.deleteBook(books.get(1));
        } else {
            logger.error("No Book or update Book out of range....");
        }
    }

    /* Show Book List */

    @Test
    public void books() {

        List<Book> books = bookManager.books();
        if (books != null)
            logger.info(books.toString());
        else
            logger.error("No book available !");
    }
}
