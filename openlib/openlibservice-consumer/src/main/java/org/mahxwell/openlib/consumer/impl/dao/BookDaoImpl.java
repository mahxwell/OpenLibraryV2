package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.BookDao;
import org.mahxwell.openlib.consumer.impl.BookRowMapper;
import org.mahxwell.openlib.model.bean.openlib.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Book Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class BookDaoImpl extends AbstractDaoImpl implements BookDao {

    /**
     * DAO
     * Add a New Book Object in DataBase
     *
     * @param newBook New Library Object
     */
    @Override
    public void addBook(final Book newBook) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.book(title, year, library_id_library, editor_id_editor, author_id_author, genre_id_genre) VALUES"
                + " (:title, :year, :library_id_library, :editor_id_editor, :author_id_author, :genre_id_genre)";

        parameters.addValue("title", newBook.getBookTitle());
        parameters.addValue("year", newBook.getBookYear());
        parameters.addValue("library_id_library", newBook.getLibraryIdLibrary());
        parameters.addValue("editor_id_editor", newBook.getEditorIdEditor());
        parameters.addValue("author_id_author", newBook.getAuthorIdAuthor());
        parameters.addValue("genre_id_genre", newBook.getGenreIdGenre());
        template.update(query, parameters);

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

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.book SET"
                + " title = :title, year = :year, editor_id_editor = :editor_id_editor, author_id_author = :author_id_author, genre_id_genre = :genre_id_genre, library_id_library = :library_id_library  "
                + " WHERE book_id = :book_id";

        parameters.addValue("book_id", bookToFind.getBookId());
        parameters.addValue("title", bookToUpdate.getBookTitle());
        parameters.addValue("year", bookToUpdate.getBookYear());
        parameters.addValue("editor_id_editor", bookToUpdate.getEditorIdEditor());
        parameters.addValue("author_id_author", bookToUpdate.getAuthorIdAuthor());
        parameters.addValue("genre_id_genre", bookToUpdate.getGenreIdGenre());
        parameters.addValue("library_id_library", bookToUpdate.getLibraryIdLibrary());

        template.update(query, parameters);

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

        Integer book_id = bookToDelete.getBookId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.book WHERE book_id = :book_id";
        parameters.addValue("book_id", book_id);
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Get a Book List Object
     *
     * @return Books -> List of Book Object
     */
    @Override
    public List<Book> Books() {

        BookRowMapper bookRowMapper = new BookRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.book";

        List<Book> books = template.query(query, bookRowMapper.getBookRowMapper());

        return books;
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
        String query
                = "SELECT * FROM librarydb.book"
                + " WHERE book_id = " + book_id;

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        BookRowMapper bookRowMapper = new BookRowMapper();

        List<Book> books = template.query(query, bookRowMapper.getBookRowMapper());
        return books.get(0);
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
        BookRowMapper bookRowMapper = new BookRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.book WHERE title =  " + "'" + title + "'";

        List<Book> books = template.query(query, bookRowMapper.getBookRowMapper());

        return books;
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
        BookRowMapper bookRowMapper = new BookRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT DISTINCT librarydb.book.* FROM librarydb.book"
                + " INNER JOIN librarydb.library ON librarydb.book.library_id_library = librarydb.library.library_id"
                + " INNER JOIN librarydb.editor ON librarydb.book.editor_id_editor = librarydb.editor.editor_id"
                + " INNER JOIN librarydb.genre ON librarydb.book.genre_id_genre = librarydb.genre.genre_id"
                + " INNER JOIN librarydb.author ON librarydb.book.author_id_author = librarydb.author.author_id"
                + " WHERE book.title = " + "'" + title + "'"
                + " AND library.name = " + "'" + library_name + "'"
                + " AND editor.name = " + "'" + editor_name + "'"
                + " AND genre.name = " + "'" + genre_name + "'"
                + " AND author.name = " + "'" + author_name + "'";

        List<Book> books = template.query(query, bookRowMapper.getBookRowMapper());

        return books;
    }

    /**
     * DAO
     * Get List Book To Send Mail -> Late to give back book
     *
     * @return
     */
    @Override
    public List<Book> booksToSendMail() {
        BookRowMapper bookRowMapper = new BookRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT librarydb.book.* FROM librarydb.book"
                + " INNER JOIN librarydb.bookloaning ON librarydb.book.book_id = librarydb.bookloaning.get_book_id"
                + " WHERE librarydb.bookloaning.endind_date <= current_date";

        List<Book> books = template.query(query, bookRowMapper.getBookRowMapper());

        return books;
    }
}
