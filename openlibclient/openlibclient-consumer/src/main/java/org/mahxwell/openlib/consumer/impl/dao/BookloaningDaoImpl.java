package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.BookloaningDao;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.mahxwell.openlib.service.bookloaning.BookloaningService;
import org.mahxwell.openlib.service.bookloaning.Bookloaning_Service;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Bookloaning Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
public class BookloaningDaoImpl implements BookloaningDao {

    private Bookloaning_Service bookloaning_service = new Bookloaning_Service();
    private BookloaningService bookloaningService = bookloaning_service.getBookloaningServicePort();

    /**
     * DAO
     * Add a New Bookloaning Object in DataBase
     *
     * @param newBookloaning New Bookloaning Object
     */
    @Override
    public void addBookloaning(final Bookloaning newBookloaning) {
        bookloaningService.addBookloaning(newBookloaning);
        return;
    }

    /**
     * DAO
     * Update an Existing Bookloaning Object in DataBase
     *
     * @param bookloaningToUpdate Bookloaning Object Updated
     * @param bookloaningToFind   Bookloaning Object to update
     */
    @Override
    public void updateBookloaning(final Bookloaning bookloaningToUpdate, final Bookloaning bookloaningToFind) {
        bookloaningService.updateBookloaning(bookloaningToUpdate, bookloaningToFind);
        return;
    }

    /**
     * DAO
     * Delete an Existing Bookloaning Object in DataBase
     *
     * @param bookloaningToDelete Bookloaning Object to delete
     */
    @Override
    public void deleteBookloaning(final Bookloaning bookloaningToDelete) {
        bookloaningService.deleteBookloaning(bookloaningToDelete);
        return;
    }

    /**
     * DAO
     * Get a Bookloaning List Object
     *
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloanings() {
        return bookloaningService.listbookloaning();
    }

    /**
     * DAO
     * Get a Precise Bookloaning Object by Identification Number
     *
     * @param bookloaning_id Bookloaning unique Identification number
     * @return Bookloaning Object Found
     */
    @Override
    public Bookloaning getBookloaning(final Integer bookloaning_id) {
        return bookloaningService.getBookloaning(bookloaning_id);
    }

    /**
     * DAO
     * Get a Bookloaning List by User Object
     *
     * @param user_id User Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByUser(final Integer user_id) {
        return bookloaningService.listbookloaningByUser(user_id);
    }

    /**
     * DAO
     * Get a Bookloaning List by Copy Object
     *
     * @param copy_id Copy Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByCopy(final Integer copy_id) {
        return bookloaningService.listbookloaningByCopy(copy_id);
    }

    /**
     * DAO
     * Get a Bookloaning List by Book Object
     *
     * @param book_id Book Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByBook(final Integer book_id) {
        return bookloaningService.listbookloaningByBook(book_id);
    }

    /**
     * DAO
     * Get a Bookloaning List by Book Object AND User Object
     *
     * @param book_id Book Unique Identification Number
     * @param user_id User Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByBookAndByUser(final Integer book_id, final Integer user_id) {
        return bookloaningService.listbookloaningByBookAndUser(book_id, user_id);
    }

    /**
     * DAO
     * Get a Bookloaning List by Book Object Order by ending_date
     *
     * @param book_id Book Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByBookOrderByDateAsc(final Integer book_id) {
        return bookloaningService.listbookloaningByBookOrderByDateAsc(book_id);
    }
}
