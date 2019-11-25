package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.CopyDao;
import org.mahxwell.openlib.service.copy.Copy;
import org.mahxwell.openlib.service.copy.CopyService;
import org.mahxwell.openlib.service.copy.Copy_Service;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Copy Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
public class CopyDaoImpl implements CopyDao {

    private Copy_Service copy_service = new Copy_Service();
    private CopyService copyService = copy_service.getCopyServicePort();

    /**
     * DAO
     * Add a New Library Object in DataBase
     *
     * @param newCopy New Library Object
     */
    @Override
    public void addCopy(final Copy newCopy) {
        copyService.addCopy(newCopy);
        return;
    }

    /**
     * DAO
     * Update an Existing Copy Object in DataBase
     *
     * @param copyToUpdate Copy Object Updated
     * @param copyToFind   Copy Object to update
     */
    @Override
    public void updateCopy(final Copy copyToUpdate, final Copy copyToFind) {
        copyService.updateCopy(copyToUpdate, copyToFind);
        return;
    }

    /**
     * DAO
     * Delete an Existing Copy Object in DataBase
     *
     * @param copyToDelete Copy Object to delete
     */
    @Override
    public void deleteCopy(final Copy copyToDelete) {

        copyService.deleteCopy(copyToDelete);
        return;
    }

    /**
     * DAO
     * Get a Copy List Object
     *
     * @return Copies -> List of Copy Object
     */
    @Override
    public List<Copy> copies() {
        return copyService.listcopy();
    }

    /**
     * DAO
     * Get a Copy List by Book Object
     *
     * @param book_id Book unique Identification Number
     * @return Copies -> List of Copy Object
     */
    @Override
    public List<Copy> copiesByBook(final Integer book_id) {
        return copyService.listcopybybook(book_id);
    }

    /**
     * DAO
     * Get a Precise Copy Object by Identification Number
     *
     * @param copy_id Copy unique Identification number
     * @return Copy Object Found
     */
    @Override
    public Copy getCopy(final Integer copy_id) {
        return copyService.getCopy(copy_id);
    }

}
