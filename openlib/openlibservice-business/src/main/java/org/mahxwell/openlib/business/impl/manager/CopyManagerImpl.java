package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.CopyManager;
import org.mahxwell.openlib.model.bean.openlib.Copy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Copy Manager Implementation Class</h2>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
@Transactional
public class CopyManagerImpl extends AbstractManagerImpl implements CopyManager {

    /**
     * Manager
     * Add a New Copy Object in DataBase
     *
     * @param newCopy New Copy Object
     */
    @Override
    public void addCopy(final Copy newCopy) {
        getDaoFactory().getCopyDao().addCopy(newCopy);
        return;
    }

    /**
     * Manager
     * Update an Existing Copy Object in DataBase
     *
     * @param copyToUpdate Copy Object Updated
     * @param copyToFind   Copy Object to update
     */
    @Override
    public void updateCopy(final Copy copyToUpdate, final Copy copyToFind) {
        getDaoFactory().getCopyDao().updateCopy(copyToUpdate, copyToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing Copy Object in DataBase
     *
     * @param copyToDelete Copy Object to delete
     */
    @Override
    public void deleteCopy(final Copy copyToDelete) {
        getDaoFactory().getCopyDao().deleteCopy(copyToDelete);
        return;
    }

    /**
     * Manager
     * Get a Copy List Object
     *
     * @return Copies -> List of Copy Object
     */
    @Override
    public List<Copy> Copies() {
        return getDaoFactory().getCopyDao().Copies();
    }

    /**
     * Manager
     * Get a Copy List by Book Object
     *
     * @param book_id Book unique Identification Number
     * @return Copies -> List of Copy Object
     */
    @Override
    public List<Copy> CopiesByBook(final Integer book_id) {
        return getDaoFactory().getCopyDao().CopiesByBook(book_id);
    }

    /**
     * Manager
     * Get a Precise Copy Object by Identification Number
     *
     * @param copy_id Copy unique Identification number
     * @return Copy Object Found
     */
    @Override
    public Copy getCopy(final Integer copy_id) {
        return getDaoFactory().getCopyDao().getCopy(copy_id);
    }

}
