package org.mahxwell.openlib.business.contract.manager;

import org.mahxwell.openlib.service.copy.Copy;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Copy Manager Interface</h2>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface CopyManager {
    void addCopy(final Copy newCopy);

    void updateCopy(final Copy copyToUpdate, final Copy copyToFind);

    void deleteCopy(final Copy copyToDelete);

    List<Copy> copies();

    Copy getCopy(final Integer copy_id);

    List<Copy> copiesByBook(final Integer book_id);
}

