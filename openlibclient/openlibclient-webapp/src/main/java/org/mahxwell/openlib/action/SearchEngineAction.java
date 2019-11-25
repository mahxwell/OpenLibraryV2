package org.mahxwell.openlib.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.BookManager;
import org.mahxwell.openlib.business.contract.manager.LibraryManager;
import org.mahxwell.openlib.service.book.Book;
import org.mahxwell.openlib.service.library.Library;

import java.util.List;
import java.util.Map;

public class SearchEngineAction extends ActionSupport implements SessionAware {

    private static final Logger logger = Logger.getLogger(SearchEngineAction.class);
    private Map<String, Object> session;

    BookManager bookManager = ContextLoader.INSTANCE.getBookManager();
    LibraryManager libraryManager = ContextLoader.INSTANCE.getLibraryManager();

    private List<Book> books;
    private String book_title;
    private List<Library> libraries;
    private String title, library_name, editor_name, genre_name, author_name;

    public String quickSearch() {
        logger.info("Launch quickSearch()");
        String vResult = ActionSupport.INPUT;

        try {
            libraries = libraryManager.libraries();
        } catch (Exception e) {
            logger.error("ERREUR");
        }


        if (book_title != null) {
            try {
                books = bookManager.SearchBookByTitle(book_title);
                if (books.size() > 0) {
                    logger.info("Spot found : " + books.toString());
                } else {
                    logger.info("No Book found with this name : " + book_title);
                }
                return ActionSupport.SUCCESS;
            } catch (Exception e) {
                logger.error("quickSearch error : " + e);
                return ActionSupport.ERROR;
            }
        }
        return vResult;
    }

    public String advancedSearch() {
        logger.info("Launch advancedSearch()");
        String vResult = ActionSupport.INPUT;

        if (title != null && library_name != null && editor_name != null
                && genre_name != null && author_name != null) {
            try {
                books = bookManager
                        .AdvancedSearchBook(title, library_name, editor_name, genre_name, author_name);
                if (books.size() > 0) {
                    logger.info("Book(s) found : " + books.toString());
                } else {
                    logger.info("No Book found");
                }
                return ActionSupport.SUCCESS;
            } catch (Exception e) {
                logger.error("advancedsearch error : " + e);
                return ActionSupport.ERROR;
            }
        }
        return vResult;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLibrary_name() {
        return library_name;
    }

    public void setLibrary_name(String library_name) {
        this.library_name = library_name;
    }

    public String getEditor_name() {
        return editor_name;
    }

    public void setEditor_name(String editor_name) {
        this.editor_name = editor_name;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }
}
