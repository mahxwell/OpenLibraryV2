package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.BookDao;
import org.mahxwell.openlib.service.book.Book;
import org.mahxwell.openlib.service.book.BookService;
import org.mahxwell.openlib.service.book.Book_Service;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Book Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
public class BookDaoImpl implements BookDao {


    private Book_Service book_service = new Book_Service();
    private BookService bookService = book_service.getBookServicePort();

    /**
     * DAO
     * Add a New Book Object in DataBase
     *
     * @param newBook New Library Object
     */
    @Override
    public void addBook(final Book newBook) {
        bookService.addBook(newBook);
        return;
    }

    /**
     * DAO
     * Update an Existing Book Object in DataBase
     *
     * @param bookToUpdate Book Object Updated
     * @param bookToFind   Book Object to update
     */
    @Override
    public void updateBook(final Book bookToUpdate, final Book bookToFind) {
        bookService.updateBook(bookToUpdate, bookToFind);
        return;

    }

    /**
     * DAO
     * Delete an Existing Book Object in DataBase
     *
     * @param bookToDelete Book Object to delete
     */
    @Override
    public void deleteBook(final Book bookToDelete) {

        bookService.deleteBook(bookToDelete);
        return;
    }

    /**
     * DAO
     * Get a Book List Object
     *
     * @return Books -> List of Book Object
     */
    @Override
    public List<Book> books() {
        return bookService.listbook();
    }

    /**
     * DAO
     * Get a Precise Book Object by Identification Number
     *
     * @param book_id Book unique Identification number
     * @return Book Object Found
     */
    @Override
    public Book getBook(final Integer book_id) {
        return bookService.getBook(book_id);
    }

    /**
     * DAO
     * Search Engine Method
     * Quick Search Function by Book Title
     *
     * @param title Book Wanted Title
     * @return Book list
     */
    @Override
    public List<Book> SearchBookByTitle(final String title) {
        return bookService.quicksearch(title);
    }

    /**
     * DAO
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
    @Override
    public List<Book> AdvancedSearchBook(final String title, final String library_name, final String editor_name,
                                         final String genre_name, final String author_name) {
        return bookService.advancedsearch(title, library_name, editor_name, genre_name, author_name);
    }

    /**
     * DAO
     * Get List Book To Send Mail -> Late to give back book
     *
     * @return
     */
    @Override
    public List<Book> booksToSendMail() {
        return bookService.booksMail();
    }
}
