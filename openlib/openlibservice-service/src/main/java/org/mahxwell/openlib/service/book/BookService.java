package org.mahxwell.openlib.service.book;

import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.BookManager;
import org.apache.log4j.Logger;
import org.mahxwell.openlib.model.bean.openlib.Book;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Book Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "book")
public class BookService extends AbstractManagerService {

    private static final Logger logger = Logger.getLogger(BookService.class);


    /* Get BookManager bean from Enum Contextloader */

    BookManager bookManager = ContextLoader.INSTANCE.getBookManager();

    /**
     * WebService
     * Get a Book List Object
     *
     * @return Books -> List of Book Object
     */
    @WebMethod(operationName = "listbook")
    public List<Book> getBookListService() {

        try {
            List<Book> books = bookManager.Books();
            if (books != null) {
                return books;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbook method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Add a New Book Object in DataBase
     *
     * @param newBook New Book Object
     */
    @WebMethod(operationName = "addBook")
    public void addBookService(final Book newBook) {
        try {
            bookManager.addBook(newBook);
        } catch (Exception e) {
            logger.error("Error addBook method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing Book Object in DataBase
     *
     * @param bookToUpdate Book Object Updated
     * @param bookToFind   Book Object to update
     */
    @WebMethod(operationName = "updateBook")
    public void updateBookService(final Book bookToUpdate, final Book bookToFind) {
        try {
            bookManager.updateBook(bookToUpdate, bookToFind);
        } catch (Exception e) {
            logger.error("Error updateBook method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing Book Object in DataBase
     *
     * @param bookToDelete Book Object to delete
     */
    @WebMethod(operationName = "deleteBook")
    public void deleteBookService(final Book bookToDelete) {
        try {
            bookManager.deleteBook(bookToDelete);
        } catch (Exception e) {
            logger.error("Error deleteBook method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get a Precise Book Object by Identification Number
     *
     * @param book_id Book unique Identification number
     * @return Book Object Found
     */
    @WebMethod(operationName = "getBook")
    public Book getBook(final Integer book_id) {
        try {
            Book book = bookManager.getBook(book_id);
            if (book != null)
                return book;
            else
                return null;
        } catch (Exception e) {
            logger.error("Error getBook method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Search Engine Method
     * Quick Search Function by Book Title
     *
     * @param title Book Wanted Title
     * @return Book list
     */
    @WebMethod(operationName = "quicksearch")
    public List<Book> searchEngineByTitle(final String title) {
        try {
            List<Book> books = bookManager.SearchBookByTitle(title);
            if (books != null) {
                return books;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbook method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Search Engine Method
     * Advanced Search Function With Several Criteria
     *
     * @param title        Book Title Wanted
     * @param library_name Library Name Wanted
     * @param editor_name  Editor Name Wanted
     * @param genre_name   Genre Name Wanted
     * @param author_name  Author Name Wanted
     * @return Book List Found if search matches
     */
    @WebMethod(operationName = "advancedsearch")
    public List<Book> advancedSearchEngine(final String title, final String library_name, final String editor_name,
                                           final String genre_name, final String author_name) {
        try {
            List<Book> books = bookManager.AdvancedSearchBook(title, library_name, editor_name, genre_name, author_name);
            if (books != null) {
                return books;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbook method = " + e);
        }
        return null;
    }

    /**
     * Webservice
     * Get List Book To Send Mail -> Late to give back book
     *
     * @return
     */
    @WebMethod(operationName = "booksMail")
    public List<Book> getBooksMailService() {

        try {
            List<Book> books = bookManager.booksToSendMail();
            if (books != null) {
                return books;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbook method = " + e);
        }
        return null;
    }
}
