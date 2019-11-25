package org.mahxwell.openlib.service.library;

import org.apache.log4j.Logger;
import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.LibraryManager;
import org.mahxwell.openlib.model.bean.openlib.Library;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Library Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "library")
public class LibraryService extends AbstractManagerService {


    private static final Logger logger = Logger.getLogger(LibraryService.class);

    /* Get LibraryManager bean from Enum Contextloader */

    LibraryManager libraryManager = ContextLoader.INSTANCE.getLibraryManager();

    /**
     * WebService
     * Get a Library List Object
     *
     * @return Libraries -> List of Library Object
     */
    @WebMethod(operationName = "listlibrary")
    public List<Library> getLibraryListService() {
        try {
            List<Library> libraries = libraryManager.Libraries();
            if (libraries != null) {
                return libraries;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listlibraries method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Add a New Library Object in DataBase
     *
     * @param newLibrary New Library Object
     */
    @WebMethod(operationName = "addLibrary")
    public void addLibraryService(final Library newLibrary) {
        try {
            libraryManager.addLibrary(newLibrary);
        } catch (Exception e) {
            logger.error("Error addLibraries method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing Library Object in DataBase
     *
     * @param libraryToUpdate Library Object Updated
     * @param libraryToFind   Library Object to update
     */
    @WebMethod(operationName = "updateLibrary")
    public void updateLibraryService(final Library libraryToUpdate, final Library libraryToFind) {
        try {
            libraryManager.updateLibrary(libraryToUpdate, libraryToFind);
        } catch (Exception e) {
            logger.error("Error updateLibraries method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing Library Object in DataBase
     *
     * @param libraryToDelete Library Object to delete
     */
    @WebMethod(operationName = "deleteLibrary")
    public void deleteLibraryService(final Library libraryToDelete) {
        try {
            libraryManager.deleteLibrary(libraryToDelete);
        } catch (Exception e) {
            logger.error("Error deleteLibraries method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get a Precise Library Object by Identification Number
     *
     * @param library_id Library unique Identification number
     * @return Library Object Found
     */
    @WebMethod(operationName = "getLibrary")
    public Library getLibrary(final Integer library_id) {
        try {
            Library library = libraryManager.getLibrary(library_id);
            if (library != null)
                return library;
            else
                return null;
        } catch (Exception e) {
            logger.error("Error getLibrary method = " + e);
        }
        return null;
    }
}
