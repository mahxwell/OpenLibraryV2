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

    private BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();
    private AuthorManager authorManager = ContextLoader.INSTANCE.getAuthorManager();
    private BookManager bookManager = ContextLoader.INSTANCE.getBookManager();
    private CopyManager copyManager = ContextLoader.INSTANCE.getCopyManager();
    private EditorManager editorManager = ContextLoader.INSTANCE.getEditorManager();
    private GenreManager genreManager = ContextLoader.INSTANCE.getGenreManager();
    private LibraryManager libraryManager = ContextLoader.INSTANCE.getLibraryManager();
    private ReservationManager reservationManager = ContextLoader.INSTANCE.getReservationManager();

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
    private boolean cannotExtend;

    private boolean alreadyReserved;
    private Date expectedReturnDate;
    private List<Reservation> reservationListByUser;

    private boolean reserveQueueLimit;

    private boolean reservationPrioritybol;

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
     * List of Reserved Book by User
     *
     * @return
     */
    public String doListReservedBook() {

        user = (User) this.session.get("user");

        if (user != null) {
            try {
                reservationListByUser = reservationManager.reservationsByUser(user.getUserId());
                logger.info("RESERVATION BY USER =" + reservationListByUser.get(0).getGetBookId());
                if (reservationListByUser != null) {
                    List<Book> allBooks = bookManager.books();
                    List<Book> booksByUser = new ArrayList<>();
                    int i = 0;
                    int j;
                    while (i < allBooks.size()) {
                        j = 0;
                        while (j < reservationListByUser.size()) {
                            if (allBooks.get(i).getBookId() == reservationListByUser.get(j).getGetBookId()
                                    && !booksByUser.contains(allBooks.get(i)))
                                booksByUser.add(allBooks.get(i));
                            j++;
                        }
                        i++;
                    }
                    books = new ArrayList<>(booksByUser);
                }
            } catch (Exception e) {
                books = new ArrayList<>();
                logger.error("Error in doListReservedBook Method");
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
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
                /**
                 * Get All Book Informations for JSP
                 */
                book = bookManager.getBook(bookId);
                editor = editorManager.getEditor(book.getEditorIdEditor());
                author = authorManager.getAuthor(book.getAuthorIdAuthor());
                genre = genreManager.getGenre(book.getGenreIdGenre());
                library = libraryManager.getLibrary(book.getLibraryIdLibrary());
                copyListByBooks = copyManager.copiesByBook(bookId);
                bookloanings = bookloaningManager.bookloaningsByBook(bookId);
                copyNbr = copyListByBooks.size() - bookloanings.size();

                /**
                 * Add for V2 -> Expected return date for JSP
                 */
                this.expectedReturnDate = expectedReturnDateForReservation(book.getBookId());

                /**
                 * Add for V2 -> Check if reservation list for a book is not too long
                 */
                this.checkMaxQueueReservation(book.getBookId());


                /**
                 * Add for V2 -> Check if a book is already reserved for JSP
                 */
                try {
                    Reservation reservationKeep = reservationManager.reservationsByUserAndByBooks(user.getUserId(), bookId);
                    if (reservationKeep == null) {
                        alreadyReserved = false;
                    } else {
                        alreadyReserved = true;
                    }
                } catch (Exception e) {
                    logger.info("reservationKeep is null");
                }
                /**
                 * Add V2 -> Check If a user has reserved a book or not
                 * to allow priority to users who have reserved to loan
                 */
                // CHECK IF LOANING BUG OCCUR AGAIN
                List<Reservation>  reservationPriority = reservationManager.reservationsByBooks(bookId);

                if (reservationPriority.size() <= 0) {
                    reservationPrioritybol = false;
                } else {
                    reservationPrioritybol = true;
                }


                /**
                 * Bookloaning Operation
                 */
                List<Bookloaning> bookloaningsByBookAndUser =
                        bookloaningManager.bookloaningsByBookAndByUser(bookId, user.getUserId());
                if (bookloaningsByBookAndUser.size() > 0) {
                    alreadyLoaned = true;
                    XMLGregorianCalendar datexml = bookloaningsByBookAndUser.get(0).getEndDate();
                    date = datexml.toGregorianCalendar().getTime();
                    bookloaningExtend = bookloaningsByBookAndUser.get(0).isExtended();

                    /**
                     * Add For V2 -> Fix add 1.0.1
                     * User cannot extend a loan when return date is passed
                     */
                    Date dateNow = new Date();
                    if (dateNow.compareTo(date) > 0) {
                        cannotExtend = true;
                    } else {
                        cannotExtend = false;
                    }
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

    /**
     * Add For V2 -> Get a expected return Date for reservation
     *
     * @param bookId
     * @return
     */
    private Date expectedReturnDateForReservation(final Integer bookId) {

        try {
            List<Bookloaning> bookloanedDate = bookloaningManager.bookloaningsByBookOrderByDateAsc(bookId);
            XMLGregorianCalendar expectedReturnDate = bookloanedDate.get(0).getEndDate();
            Date returnDate = expectedReturnDate.toGregorianCalendar().getTime();
            return returnDate;
        } catch (Exception e) {
            logger.error(e);
        }
        return null;
    }

    /**
     * Add for V2 -> Check if reservation list for a book is not too long
     *
     * @param bookId
     */
    private void checkMaxQueueReservation(final Integer bookId) {
        try {
            List<Reservation> reservations = reservationManager.reservationsByBooks(bookId);
            List<Copy> copiesByBooks = copyManager.copiesByBook(bookId);

            if (reservations.size() > 0 && copiesByBooks.size() > 0) {
                Integer actualReservation = reservations.size();
                Integer maxReservationByBook = copiesByBooks.size() + copiesByBooks.size();

                if (actualReservation < maxReservationByBook) {
                    reserveQueueLimit = false;
                } else {
                    reserveQueueLimit = true;
                }
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }


    /* GETTERS AND SETTERS */

    public boolean isReserveQueueLimit() {
        return reserveQueueLimit;
    }

    public void setReserveQueueLimit(boolean reserveQueueLimit) {
        this.reserveQueueLimit = reserveQueueLimit;
    }

    public List<Reservation> getReservationListByUser() {
        return reservationListByUser;
    }

    public void setReservationListByUser(List<Reservation> reservationListByUser) {
        this.reservationListByUser = reservationListByUser;
    }

    public static Logger getLogger() {
        return logger;
    }

    public boolean isAlreadyReserved() {
        return alreadyReserved;
    }

    public void setAlreadyReserved(boolean alreadyReserved) {
        this.alreadyReserved = alreadyReserved;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

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

    public boolean isCannotExtend() {
        return cannotExtend;
    }

    public void setCannotExtend(boolean cannotExtend) {
        this.cannotExtend = cannotExtend;
    }

    public boolean isReservationPrioritybol() {
        return reservationPrioritybol;
    }

    public void setReservationPrioritybol(boolean reservationPrioritybol) {
        this.reservationPrioritybol = reservationPrioritybol;
    }
}
