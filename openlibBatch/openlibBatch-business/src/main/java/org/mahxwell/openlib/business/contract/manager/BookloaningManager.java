package org.mahxwell.openlib.business.contract.manager;

import org.mahxwell.openlib.service.bookloaning.Bookloaning;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Bookloaning Manager Interface</h2>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface BookloaningManager {

    void addBookloaning(final Bookloaning newBookloaning);

    void updateBookloaning(final Bookloaning bookloaningToUpdate, final Bookloaning bookloaningToFind);

    void deleteBookloaning(final Bookloaning bookloaningToDelete);

    List<Bookloaning> bookloanings();

    Bookloaning getBookloaning(final Integer bookloaning_id);

    List<Bookloaning> bookloaningsByUser(final Integer user_id);

    List<Bookloaning> bookloaningsByCopy(final Integer copy_id);

    List<Bookloaning> bookloaningsByBook(final Integer book_id);

    List<Bookloaning> bookloaningsByBookAndByUser(final Integer book_id, final Integer user_id);

    List<Bookloaning> getBookloaningLate();
}
