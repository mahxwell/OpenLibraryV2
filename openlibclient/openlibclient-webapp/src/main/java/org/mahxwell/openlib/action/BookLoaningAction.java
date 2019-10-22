package org.mahxwell.openlib.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.collections4.ListUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.BookloaningManager;
import org.mahxwell.openlib.business.contract.manager.CopyManager;
import org.mahxwell.openlib.service.book.Book;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.mahxwell.openlib.service.copy.Copy;
import org.mahxwell.openlib.service.user.User;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookLoaningAction extends ActionSupport implements SessionAware {

    private static final Logger logger = Logger.getLogger(BookLoaningAction.class);
    private Map<String, Object> session;
    private HttpServletRequest servletRequest;

    BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();
    CopyManager copyManager = ContextLoader.INSTANCE.getCopyManager();

    /*    private ManagerFactory managerFactory;*/

    private User user;
    private Bookloaning bookloaning;
    private List<Bookloaning> bookloaningList;
    private Copy copy;
    private List<Copy> copies;
    private Book book;
    private List<Book> books;

    public String doCreateBookloaning() {

        user = (User) this.session.get("user");
        book = (Book) this.session.get("book");
        if (user != null && book != null) {
            try {
                copies = copyManager.copiesByBook(book.getBookId());
                bookloaningList = bookloaningManager.bookloanings();

                List<Copy> copies1 = new ArrayList<>(copies);
                List<Copy> copies2 = new ArrayList<>();

                /* Create a Copy List To SHOW FREE COPIES*/

                if (bookloaningList.size() > 0) {
                    int i = 0;
                    int j;
                    while (i < copies.size()) {
                        j = 0;
                        while (j < bookloaningList.size()) {
                            if (copies.get(i).getCopyId() == bookloaningList.get(j).getCopyIdCopy()
                                    && copies2.contains(copies.get(i)) == false)
                                copies2.add(copies.get(i));
                            j++;
                        }
                        i++;
                    }
                    copies1 = ListUtils.subtract(copies, copies2);

                    /* Set Bookloaning  */
                }

                if (copies1 != null) {
                    String formater = "yyyy-MM-dd'T'HH:mm:ss";
                    DateFormat format = new SimpleDateFormat(formater);
                    Date date = new Date();
                    Date dateEnd = new Date();
                    Calendar c = Calendar.getInstance();
                    c.setTime(dateEnd);
                    c.add(Calendar.DATE, 30);
                    dateEnd = c.getTime();

                    XMLGregorianCalendar gDateFormatted1 =
                            DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));

                    XMLGregorianCalendar gDateFormattedEnd =
                            DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(dateEnd));

                    Bookloaning bookloaning2 = new Bookloaning();
                    bookloaning2.setExtended(false);
                    bookloaning2.setBeginDate(gDateFormatted1);
                    bookloaning2.setEndDate(gDateFormattedEnd);
                    bookloaning2.setGetBookId(book.getBookId());
                    bookloaning2.setCopyIdCopy(copies1.get(0).getCopyId());
                    bookloaning2.setUserIdUser(user.getUserId());
                    bookloaningManager.addBookloaning(bookloaning2);
                }
            } catch (Exception e) {
                logger.error("Error doCreateBookloaning Method = " + e);
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String doUpdateBookloaning() {

        user = (User) this.session.get("user");
        book = (Book) this.session.get("book");

        try {
            bookloaningList = bookloaningManager.bookloaningsByBookAndByUser(book.getBookId(), user.getUserId());
            if (bookloaningList.size() == 1) {
                try {

                    Bookloaning bookloaning1 = new Bookloaning();
                    String formater = "yyyy-MM-dd'T'HH:mm:ss";
                    DateFormat format = new SimpleDateFormat(formater);
                    Date date = new Date();
                    Date dateEnd = new Date();
                    Calendar c = Calendar.getInstance();
                    c.setTime(dateEnd);
                    c.add(Calendar.DATE, 35);
                    dateEnd = c.getTime();

                    XMLGregorianCalendar gDateFormatted1 =
                            DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));

                    XMLGregorianCalendar gDateFormattedEnd =
                            DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(dateEnd));
                    bookloaning1.setExtended(true);
                    bookloaning1.setBeginDate(gDateFormatted1);
                    bookloaning1.setEndDate(gDateFormattedEnd);
                    bookloaning1.setGetBookId(bookloaningList.get(0).getGetBookId());
                    bookloaning1.setCopyIdCopy(bookloaningList.get(0).getCopyIdCopy());
                    bookloaning1.setUserIdUser(bookloaningList.get(0).getUserIdUser());
                    bookloaningManager.updateBookloaning(bookloaning1, bookloaningList.get(0));
                } catch (Exception e) {
                    logger.error(e);
                }
            }
        } catch (Exception e) {
            logger.error("Error doUpdateBookloaning = " + e);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String doDeleteBookloaning() {

        user = (User) this.session.get("user");
        book = (Book) this.session.get("book");
        try {
            bookloaningList = bookloaningManager.bookloaningsByBookAndByUser(book.getBookId(), user.getUserId());
            if (bookloaningList.size() > 0) {
                try {
                    bookloaningManager.deleteBookloaning(bookloaningList.get(0));
                } catch (Exception e) {
                    logger.error("Error bookloaning list is null");
                }
            }
        } catch (Exception e) {
            logger.error("Error doDeleteBookloaning method = " + e);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }


    /* GETTERS AND SETTERS */

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bookloaning getBookloaning() {
        return bookloaning;
    }

    public void setBookloaning(Bookloaning bookloaning) {
        this.bookloaning = bookloaning;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public List<Bookloaning> getBookloaningList() {
        return bookloaningList;
    }

    public void setBookloaningList(List<Bookloaning> bookloaningList) {
        this.bookloaningList = bookloaningList;
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
}
