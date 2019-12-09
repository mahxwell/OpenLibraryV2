package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.BookDao;
import org.mahxwell.openlib.service.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:consumer-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookDaoImplTest {

    @Autowired
    private BookDao bookDao;
    private static final Logger logger = Logger.getLogger(BookDaoImplTest.class);


    /**
     * Test
     * Initialize Book Object for Unit Tests
     *
     * @param bookTitle Set BookTitle
     * @param bookYear  Set BookYear
     * @param authorId  Set Author Identification Number
     * @param editorId  Set Editor Identification Number
     * @param genreId   Set Genre Identification Number
     * @param libraryId Set Library Identification Number
     * @return A Book Object
     */
    private Book InitializeBookObject(final String bookTitle, final Integer bookYear,
                                      final Integer authorId, final Integer editorId,
                                      final Integer genreId, final Integer libraryId) {
        Book book = new Book();
        try {
            book.setBookTitle(bookTitle);
            book.setBookYear(bookYear);
            book.setAuthorIdAuthor(authorId);
            book.setEditorIdEditor(editorId);
            book.setGenreIdGenre(genreId);
            book.setLibraryIdLibrary(libraryId);
        } catch (Exception e) {
            logger.error(e);
        }
        return book;
    }


    /**
     * Test
     * Get Last Book Object in Data Base
     * @return Last Object -> For Delete
     */
    private Book getLastBook() {
        try {
            List<Book> books = bookDao.books();
            return books.get(books.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }
    /* Add New Book In DataBase */

    @Test
    public void addBook() {
        try {
            Book book = InitializeBookObject("TheBestBook", 2010, 1, 1, 1, 1);
            bookDao.addBook(book);
            bookDao.deleteBook(getLastBook());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Book */

    @Test
    public void updateBook() {
        try {
            Book book = InitializeBookObject("TheBestBook", 2010, 1, 1, 1, 1);
            bookDao.addBook(book);
            Book bookToUpdate = InitializeBookObject("TheBestBookUpdated", 2010, 1, 1, 1, 1);
            List<Book> books = bookDao.books();
            bookDao.updateBook(bookToUpdate, getLastBook());
            bookDao.deleteBook(getLastBook());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Book */

    @Test
    public void deleteBook() {
        try {
            Book book = InitializeBookObject("TheBestBook", 2010, 1, 1, 1, 1);
            bookDao.addBook(book);
            bookDao.deleteBook(getLastBook());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Book List */

    @Test
    public void books() {
        try {
            List<Book> books = bookDao.books();
            if (books != null)
                logger.info(books.toString());
            else
                logger.error("No book available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Search Test */


    /* Search By Title */

    @Test
    public void SearchByTitletest() {

        try {
            List<Book> books = bookDao.SearchBookByTitle("BookTitle1");
            if (books != null)
                logger.info(books.toString());
            else
                logger.error("No book available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Advanced Search */

    @Test
    public void AdvancedSearch() {
        try {
            List<Book> books = bookDao.AdvancedSearchBook("BookTitle0",
                    "LibraryName0", "editorName0", "genreName0", "AuthorName0");
            if (books != null)
                logger.info(books.toString());
            else
                logger.error("No book available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* Find One Book By Identification Number */

    @Test
    public void getBook() {
        try {
            List<Book> books = bookDao.books();
            if (books != null) {
                logger.info(books.toString());
            } else {
                logger.error("No Books available !");
            }
            Book book = bookDao.getBook(1);
            Assert.assertEquals(book.getBookId(), books.get(0).getBookId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
