package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.model.bean.openlib.Book;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Book Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface BookDao {

    void addBook(final Book newBook);

    void updateBook(final Book bookToUpdate, final Book bookToFind);

    void deleteBook(final Book bookId);

    List<Book> Books();

    Book getBook(final Integer book_id);

    List<Book> SearchBookByTitle(final String title);

    List<Book> AdvancedSearchBook(final String title, final String library_name, final String editor_name,
                                  final String genre_name, final String author_name);

    List<Book> booksToSendMail();
}
