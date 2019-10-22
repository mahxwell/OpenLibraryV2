package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.model.bean.openlib.Copy;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Copy Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface CopyDao {

    void addCopy(final Copy newCopy);

    void updateCopy(final Copy copyToUpdate, final Copy copyIdToFind);

    void deleteCopy(final Copy copyId);

    List<Copy> Copies();

    Copy getCopy(final Integer copy_id);

    List<Copy> CopiesByBook(final Integer book_id);
}
