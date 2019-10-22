package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.service.copy.Copy;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Copy Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface CopyDao {

    void addCopy(final Copy newCopy);

    void updateCopy(final Copy copyToUpdate, final Copy copyToFind);

    void deleteCopy(final Copy copyToDelete);

    List<Copy> copies();

    Copy getCopy(final Integer copy_id);

    List<Copy> copiesByBook(final Integer book_id);
}
