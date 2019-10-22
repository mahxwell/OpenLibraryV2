package org.mahxwell.openlib.service.bookloaning;

import org.apache.log4j.Logger;
import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.BookloaningManager;
import org.mahxwell.openlib.model.bean.openlib.Bookloaning;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Bookloaning Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "bookloaning")
public class BookloaningService extends AbstractManagerService {

    private static final Logger logger = Logger.getLogger(BookloaningService.class);

    /* Get BookloaningManager bean from Enum Contextloader */

    BookloaningManager bookloaningManager = ContextLoader.INSTANCE.getBookloaningManager();

    /**
     * WebService
     * Get a Bookloaning List Object
     *
     * @return Bookloanings -> List of Bookloaning Object
     */
    @WebMethod(operationName = "listbookloaning")
    public List<Bookloaning> getBookloaningListService() {

        try {
            List<Bookloaning> bookloanings = bookloaningManager.Bookloanings();
            if (bookloanings != null) {
                return bookloanings;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbookloaning method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Add a New Bookloaning Object in DataBase
     *
     * @param newBookloaning New Bookloaning Object
     */
    @WebMethod(operationName = "addBookloaning")
    public void addBookloaningService(final Bookloaning newBookloaning) {
        try {
            bookloaningManager.addBookloaning(newBookloaning);
        } catch (Exception e) {
            logger.error("Error addBookloaningService method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing Bookloaning Object in DataBase
     *
     * @param bookloaningToUpdate Bookloaning Object Updated
     * @param bookloaningToFind   Bookloaning Object to update
     */
    @WebMethod(operationName = "updateBookloaning")
    public void updateBookloaningService(final Bookloaning bookloaningToUpdate, final Bookloaning bookloaningToFind) {
        try {
            bookloaningManager.updateBookloaning(bookloaningToUpdate, bookloaningToFind);
        } catch (Exception e) {
            logger.error("Error updateBookloaningService method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing Bookloaning Object in DataBase
     *
     * @param bookloaningToDelete Bookloaning Object to delete
     */
    @WebMethod(operationName = "deleteBookloaning")
    public void deleteBookloaningService(final Bookloaning bookloaningToDelete) {
        try {
            bookloaningManager.deleteBookloaning(bookloaningToDelete);
        } catch (Exception e) {
            logger.error("Error deleteBookloaningService method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get a Precise Bookloaning Object by Identification Number
     *
     * @param bookloaning_id Bookloaning unique Identification number
     * @return Bookloaning Object Found
     */
    @WebMethod(operationName = "getBookloaning")
    public Bookloaning getBook(final Integer bookloaning_id) {
        try {
            Bookloaning bookloaning = bookloaningManager.getBookloaning(bookloaning_id);
            if (bookloaning != null)
                return bookloaning;
            else
                return null;
        } catch (Exception e) {
            logger.error("Error getBookloaning method = " + e);
        }
        return null;
    }

    /**
     * /**
     * WebService
     * Get a Bookloaning List by User Object
     *
     * @param user_id User Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @WebMethod(operationName = "listbookloaningByUser")
    public List<Bookloaning> getBookloaningListByUserService(final Integer user_id) {

        try {
            List<Bookloaning> bookloanings = bookloaningManager.bookloaningsByUser(user_id);
            if (bookloanings != null) {
                return bookloanings;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbookloaning method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Get a Bookloaning List by Copy Object
     *
     * @param copy_id Copy Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @WebMethod(operationName = "listbookloaningByCopy")
    public List<Bookloaning> getBookloaningListByCopyService(final Integer copy_id) {

        try {
            List<Bookloaning> bookloanings = bookloaningManager.bookloaningsByCopy(copy_id);
            if (bookloanings != null) {
                return bookloanings;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbookloaning method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Get a Bookloaning List by Book Object
     *
     * @param book_id Book Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @WebMethod(operationName = "listbookloaningByBook")
    public List<Bookloaning> getBookloaningListByBookService(final Integer book_id) {

        try {
            List<Bookloaning> bookloanings = bookloaningManager.bookloaningsByBook(book_id);
            if (bookloanings != null) {
                return bookloanings;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbookloaning method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Get a Bookloaning List by Book Object AND User Object
     *
     * @param book_id Book Unique Identification Number
     * @param user_id User Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @WebMethod(operationName = "listbookloaningByBookAndUser")
    public List<Bookloaning> getBookloaningListByBookAndUserService(final Integer book_id, final Integer user_id) {

        try {
            List<Bookloaning> bookloanings = bookloaningManager.bookloaningsByBookAndByUser(book_id, user_id);
            if (bookloanings != null) {
                return bookloanings;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbookloaning method = " + e);
        }
        return null;
    }

    @WebMethod(operationName = "bookloaningslate")
    public List<Bookloaning> getBookloaningListLateService() {

        try {
            List<Bookloaning> bookloanings = bookloaningManager.getBookloaningLate();
            if (bookloanings != null) {
                return bookloanings;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listbookloaning method = " + e);
        }
        return null;
    }
}
