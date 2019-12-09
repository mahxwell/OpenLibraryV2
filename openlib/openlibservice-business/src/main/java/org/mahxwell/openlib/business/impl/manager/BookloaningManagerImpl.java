package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.BookloaningManager;
import org.mahxwell.openlib.model.bean.openlib.Bookloaning;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Bookloaning Manager Implementation Class</h2>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
@Transactional
public class BookloaningManagerImpl extends AbstractManagerImpl implements BookloaningManager {

    /**
     * Manager
     * Add a New Bookloaning Object in DataBase
     *
     * @param newBookloaning New Bookloaning Object
     */
    @Override
    public void addBookloaning(final Bookloaning newBookloaning) {
        getDaoFactory().getBookloaningDao().addBookloaning(newBookloaning);
        return;
    }

    /**
     * Manager
     * Update an Existing Bookloaning Object in DataBase
     *
     * @param bookloaningToUpdate Bookloaning Object Updated
     * @param bookloaningToFind   Bookloaning Object to update
     */
    @Override
    public void updateBookloaning(final Bookloaning bookloaningToUpdate, final Bookloaning bookloaningToFind) {
        getDaoFactory().getBookloaningDao().updateBookloaning(bookloaningToUpdate, bookloaningToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing Bookloaning Object in DataBase
     *
     * @param bookloaningToDelete Bookloaning Object to delete
     */
    @Override
    public void deleteBookloaning(final Bookloaning bookloaningToDelete) {
        getDaoFactory().getBookloaningDao().deleteBookloaning(bookloaningToDelete);
        return;
    }

    /**
     * Manager
     * Get a Bookloaning List Object
     *
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> Bookloanings() {
        return getDaoFactory().getBookloaningDao().Bookloanings();
    }

    /**
     * Manager
     * Get a Precise Bookloaning Object by Identification Number
     *
     * @param bookloaning_id Bookloaning unique Identification number
     * @return Bookloaning Object Found
     */
    @Override
    public Bookloaning getBookloaning(final Integer bookloaning_id) {
        return getDaoFactory().getBookloaningDao().getBookloaning(bookloaning_id);
    }

    /**
     * Manager
     * Get a Bookloaning List by User Object
     *
     * @param user_id User Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByUser(final Integer user_id) {
        return getDaoFactory().getBookloaningDao().bookloaningsByUser(user_id);
    }

    /**
     * Manager
     * Get a Bookloaning List by Copy Object
     *
     * @param copy_id Copy Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByCopy(final Integer copy_id) {
        return getDaoFactory().getBookloaningDao().bookloaningsByCopy(copy_id);
    }

    /**
     * Manager
     * Get a Bookloaning List by Book Object
     *
     * @param book_id Book Unique Identification Number
     * @return Bookloanins -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByBook(final Integer book_id) {
        return getDaoFactory().getBookloaningDao().bookloaningsByBook(book_id);
    }

    /**
     * Manager
     * Get a Bookloaning List by Book Object AND User Object
     *
     * @param book_id Book Unique Identification Number
     * @param user_id User Unique Identification Number
     * @return Bookloanings -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByBookAndByUser(final Integer book_id, final Integer user_id) {
        return getDaoFactory().getBookloaningDao().bookloaningsByBookAndByUser(book_id, user_id);
    }

    /**
     * Manager
     * Get all Bookloaning Object where deadline is passed
     *
     * @return
     */
    @Override
    public List<Bookloaning> getBookloaningLate() {
        return getDaoFactory().getBookloaningDao().getBookloaningLate();
    }

    /**
     * Manager
     * Get a Bookloaning List by Book Object Order by Date
     *
     * @param book_id Book Unique Identification Number
     * @return Bookloanins -> List of Bookloaning Object
     */
    @Override
    public List<Bookloaning> bookloaningsByBookOrderByDateAsc(final Integer book_id) {
        return getDaoFactory().getBookloaningDao().bookloaningsByBookOrderByDateAsc(book_id);
    }
}
