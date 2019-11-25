package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.LibraryManager;
import org.mahxwell.openlib.model.bean.openlib.Library;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h1>Library Manager Implementation Class</h1>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
@Transactional
public class LibraryManagerImpl extends AbstractManagerImpl implements LibraryManager {

    /**
     * Manager
     * Add a New Library Object in DataBase
     *
     * @param newLibrary New Library Object
     */
    @Override
    public void addLibrary(final Library newLibrary) {
        getDaoFactory().getLibraryDao().addLibrary(newLibrary);
        return;
    }

    /**
     * Manager
     * Update an Existing Library Object in DataBase
     *
     * @param libraryToUpdate Library Object Updated
     * @param libraryToFind   Library Object to update
     */
    @Override
    public void updateLibrary(final Library libraryToUpdate, final Library libraryToFind) {
        getDaoFactory().getLibraryDao().updateLibrary(libraryToUpdate, libraryToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing Library Object in DataBase
     *
     * @param libraryToDelete Library Object to delete
     */
    @Override
    public void deleteLibrary(final Library libraryToDelete) {
        getDaoFactory().getLibraryDao().deleteLibrary(libraryToDelete);
        return;
    }

    /**
     * Manager
     * Get a Library List Object
     *
     * @return Libraries -> List of Library Object
     */
    @Override
    public List<Library> Libraries() {
        return getDaoFactory().getLibraryDao().Libraries();
    }

    /**
     * Manager
     * Get a Precise Library Object by Identification Number
     *
     * @param library_id Library unique Identification number
     * @return Library Object Found
     */
    @Override
    public Library getLibrary(final Integer library_id) {
        return getDaoFactory().getLibraryDao().getLibrary(library_id);
    }
}
