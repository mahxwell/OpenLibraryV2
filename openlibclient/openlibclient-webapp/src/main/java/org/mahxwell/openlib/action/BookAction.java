package org.mahxwell.openlib.action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.*;
import org.mahxwell.openlib.service.author.Author;
import org.mahxwell.openlib.service.book.Book;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.mahxwell.openlib.service.copy.Copy;
import org.mahxwell.openlib.service.editor.Editor;
import org.mahxwell.openlib.service.genre.Genre;
import org.mahxwell.openlib.service.library.Library;
import org.mahxwell.openlib.service.reservation.Reservation;
import org.mahxwell.openlib.service.user.User;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Mahxwell
 * <h1>Book Action Class</h1>
 * <p>Contain All Struts2 Framework Book Actions</p>
 */
public class BookAction extends ActionSupport implements SessionAware {

    private static final Logger logger = Logger.getLogger(BookAction.class);
    private Map<String, Object> session;
    private HttpServletRequest servletRequest;

    BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();
    AuthorManager authorManager = ContextLoader.INSTANCE.getAuthorManager();
    BookManager bookManager = ContextLoader.INSTANCE.getBookManager();
    CopyManager copyManager = ContextLoader.INSTANCE.getCopyManager();
    EditorManager editorManager = ContextLoader.INSTANCE.getEditorManager();
    GenreManager genreManager = ContextLoader.INSTANCE.getGenreManager();
    LibraryManager libraryManager = ContextLoader.INSTANCE.getLibraryManager();
    ReservationManager reservationManager = ContextLoader.INSTANCE.getReservationManager();

    private Book book;
    private Integer bookId;
    private User user;
    private List<Book> books;
    private Library library;
    private Author author;
    private Genre genre;
    private Editor editor;
    private Copy copy;
    private Integer copyNbr;
    private List<Copy> copyListByBooks;
    private List<Bookloaning> bookloanings;
    private Boolean alreadyLoaned;
    private Date date;
    private boolean bookloaningExtend;
    private Reservation reservation;
    private boolean alreadyReserved;
    private XMLGregorianCalendar expectedReturnDate;
    private Date returnDate;
    private List<Book> reservedBooksByUser;

    /**
     * doListBook
     * Show All Book List
     *
     * @return SUCCESS in each cases
     */
    public String doListBook() {
        try {
            books = bookManager.books();
            return ActionSupport.SUCCESS;
        } catch (Exception e) {
            logger.error("Error in doListBook Method");
            return ActionSupport.ERROR;
        }
    }

    /**
     * doListLoanedBook
     * Show Loaned Book List by User
     *
     * @return SUCCESS in each cases
     */
    public String doListLoanedBook() {

        user = (User) this.session.get("user");

        if (user != null) {
            try {
                bookloanings = bookloaningManager.bookloaningsByUser(user.getUserId());
                if (bookloanings != null) {
                    List<Book> allBooks = bookManager.books();
                    List<Book> booksByUser = new ArrayList<>();
                    int i = 0;
                    int j;
                    while (i < allBooks.size()) {
                        j = 0;
                        while (j < bookloanings.size()) {
                            if (allBooks.get(i).getBookId() == bookloanings.get(j).getGetBookId()
                                    && !booksByUser.contains(allBooks.get(i)))
                                booksByUser.add(allBooks.get(i));
                            j++;
                        }
                        i++;
                    }
                    books = new ArrayList<>(booksByUser);
                }
            } catch (Exception e) {
                logger.error("Error DoListLoanedBook Method = " + e);
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * doListReservationBook
     * Show Reserved Book List by User
     *
     * @return SUCCESS in each cases
     */
    public String doListReservationBook() {

        user = (User) this.session.get("user");
        try {
            List<Reservation> reservationsByUser = reservationManager.reservationsByUser(user.getUserId());
            if (reservationsByUser.size() > 0) {
                List<Book> allBooks = bookManager.books();
                List<Book> booksByUser = new ArrayList<>();
                int i = 0;
                int j;
                while (i < allBooks.size()) {
                    j = 0;
                    while (j < reservationsByUser.size()) {
                        if (allBooks.get(i).getBookId() == reservationsByUser.get(j).getGetBookId()
                                && !booksByUser.contains(allBooks.get(i)))
                            booksByUser.add(allBooks.get(i));
                        j++;
                    }
                    i++;
                }

                // TO CHANGE BOOKS IS NOT NULL
                books = new ArrayList<>(booksByUser);
            }
        } catch (Exception e) {
        }


        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * doDetailBook
     * Show available information about current Book
     *
     * @return SUCCESS -> If Book information are available
     * ERROR   -> If Book information are not available
     */
    public String doDetailBook() {

        user = (User) this.session.get("user");

        if (bookId == null) {
            logger.error("bookId is null");
        } else {
            try {
                book = bookManager.getBook(bookId);
                editor = editorManager.getEditor(book.getEditorIdEditor());
                author = authorManager.getAuthor(book.getAuthorIdAuthor());
                genre = genreManager.getGenre(book.getGenreIdGenre());
                library = libraryManager.getLibrary(book.getLibraryIdLibrary());
                copyListByBooks = copyManager.copiesByBook(bookId);
                bookloanings = bookloaningManager.bookloaningsByBook(bookId);
                copyNbr = copyListByBooks.size() - bookloanings.size();
                reservation = reservationManager.reservationsByUserAndByBooks(user.getUserId(), bookId);

                List<Bookloaning> bookloanedDate = bookloaningManager.bookloaningsByBookOrderByDateAsc(bookId);
                expectedReturnDate = bookloanedDate.get(0).getEndDate();
                returnDate = expectedReturnDate.toGregorianCalendar().getTime();
                if (reservation != null) {
                    alreadyReserved = true;
                } else {
                    alreadyReserved = false;
                }
                List<Bookloaning> bookloaningsByBookAndUser =
                        bookloaningManager.bookloaningsByBookAndByUser(bookId, user.getUserId());
                if (bookloaningsByBookAndUser.size() > 0) {
                    alreadyLoaned = true;
                    XMLGregorianCalendar datexml = bookloaningsByBookAndUser.get(0).getEndDate();
                    date = datexml.toGregorianCalendar().getTime();
                    bookloaningExtend = bookloaningsByBookAndUser.get(0).isExtended();
                } else {
                    alreadyLoaned = false;
                }
                this.session.put("book", book);
            } catch (Exception e) {
                logger.error("book is null");
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /* GETTERS AND SETTERS */

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public boolean isAlreadyReserved() {
        return alreadyReserved;
    }

    public void setAlreadyReserved(boolean alreadyReserved) {
        this.alreadyReserved = alreadyReserved;
    }

    public XMLGregorianCalendar getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(XMLGregorianCalendar expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public Integer getCopyNbr() {
        return copyNbr;
    }

    public void setCopyNbr(Integer copyNbr) {
        this.copyNbr = copyNbr;
    }

    public List<Copy> getCopyListByBooks() {
        return copyListByBooks;
    }

    public void setCopyListByBooks(List<Copy> copyListByBooks) {
        this.copyListByBooks = copyListByBooks;
    }

    public Boolean getAlreadyLoaned() {
        return alreadyLoaned;
    }

    public void setAlreadyLoaned(Boolean alreadyLoaned) {
        this.alreadyLoaned = alreadyLoaned;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isBookloaningExtend() {
        return bookloaningExtend;
    }

    public void setBookloaningExtend(boolean bookloaningExtend) {
        this.bookloaningExtend = bookloaningExtend;
    }
}
