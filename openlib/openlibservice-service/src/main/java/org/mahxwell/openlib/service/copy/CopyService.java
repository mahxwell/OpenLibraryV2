package org.mahxwell.openlib.service.copy;

import org.apache.log4j.Logger;
import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.CopyManager;
import org.mahxwell.openlib.model.bean.openlib.Copy;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Copy Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "copy")
public class CopyService extends AbstractManagerService {

    private static final Logger logger = Logger.getLogger(CopyService.class);

    /* Get CopyManager bean from Enum Contextloader */

    CopyManager copyManager = ContextLoader.INSTANCE.getCopyManager();

    /**
     * WebService
     * Get a Copy List Object
     *
     * @return Copies -> List of Copy Object
     */
    @WebMethod(operationName = "listcopy")
    public List<Copy> getCopyListService() {

        try {
            List<Copy> copies = copyManager.Copies();
            if (copies != null) {
                return copies;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listcopy method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Get a Copy List by Book Object
     *
     * @param book_id Book unique Identification Number
     * @return Copies -> List of Copy Object
     */
    @WebMethod(operationName = "listcopybybook")
    public List<Copy> getCopyListByBookService(final Integer book_id) {

        try {
            List<Copy> copies = copyManager.CopiesByBook(book_id);
            if (copies != null) {
                return copies;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listcopy method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Add a New Copy Object in DataBase
     *
     * @param newCopy New Copy Object
     */
    @WebMethod(operationName = "addCopy")
    public void addCopyService(final Copy newCopy) {
        try {
            copyManager.addCopy(newCopy);
        } catch (Exception e) {
            logger.error("Error addCopy method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing Copy Object in DataBase
     *
     * @param copyToUpdate Copy Object Updated
     * @param copyToFind   Copy Object to update
     */
    @WebMethod(operationName = "updateCopy")
    public void updateCopyService(final Copy copyToUpdate, final Copy copyToFind) {
        try {
            copyManager.updateCopy(copyToUpdate, copyToFind);
        } catch (Exception e) {
            logger.error("Error updateCopy method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing Copy Object in DataBase
     *
     * @param copyToDelete Copy Object to delete
     */
    @WebMethod(operationName = "deleteCopy")
    public void deleteCopyService(final Copy copyToDelete) {
        try {
            copyManager.deleteCopy(copyToDelete);
        } catch (Exception e) {
            logger.error("Error deleteCopy method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get a Precise Copy Object by Identification Number
     *
     * @param copy_id Copy unique Identification number
     * @return Copy Object Found
     */
    @WebMethod(operationName = "getCopy")
    public Copy getCopy(final Integer copy_id) {
        try {
            Copy copy = copyManager.getCopy(copy_id);
            if (copy != null)
                return copy;
            else
                return null;
        } catch (Exception e) {
            logger.error("Error getCopy method = " + e);
        }
        return null;
    }

}
