package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.BookManager;
import org.mahxwell.openlib.service.book.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Book Manager Implementation Class</h2>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
public class BookManagerImpl extends AbstractManagerImpl implements BookManager {

    /**
     * Manager
     * Add a New Book Object in DataBase
     *
     * @param newBook New Book Object
     */
    @Override
    public void addBook(final Book newBook) {
        getDaoFactory().getBookDao().addBook(newBook);
        return;
    }

    /**
     * Manager
     * Update an Existing Book Object in DataBase
     *
     * @param bookToUpdate Book Object Updated
     * @param bookToFind   Book Object to update
     */
    @Override
    public void updateBook(final Book bookToUpdate, final Book bookToFind) {
        getDaoFactory().getBookDao().updateBook(bookToUpdate, bookToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing Book Object in DataBase
     *
     * @param bookToDelete Book Object to delete
     */
    @Override
    public void deleteBook(final Book bookToDelete) {
        getDaoFactory().getBookDao().deleteBook(bookToDelete);
        return;
    }

    /**
     * Manager
     * Get a Book List Object
     *
     * @return Books -> List of Book Object
     */
    @Override
    public List<Book> books() {
        return getDaoFactory().getBookDao().books();
    }

    /**
     * Manager
     * Get a Precise Book Object by Identification Number
     *
     * @param book_id Book unique Identification number
     * @return Book Object Found
     */
    @Override
    public Book getBook(final Integer book_id) {
        return getDaoFactory().getBookDao().getBook(book_id);
    }

    /**
     * Manager
     * Search Engine Method
     * Quick Search Function by Book Title
     *
     * @param title Book Wanted Title
     * @return Book list
     */
    @Override
    public List<Book> SearchBookByTitle(final String title) {
        return getDaoFactory().getBookDao().SearchBookByTitle(title);
    }

    /**
     * Manager
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
        return getDaoFactory().getBookDao().AdvancedSearchBook(title, library_name,
                editor_name, genre_name, author_name);
    }
}
