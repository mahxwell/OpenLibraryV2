package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.LibraryDao;
import org.mahxwell.openlib.service.library.Library;
import org.mahxwell.openlib.service.library.LibraryService;
import org.mahxwell.openlib.service.library.Library_Service;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Library Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
public class LibraryDaoImpl implements LibraryDao {

    private Library_Service library_service = new Library_Service();
    private LibraryService libraryService = library_service.getLibraryServicePort();

    /**
     * DAO
     * Add a New Library Object in DataBase
     *
     * @param newLibrary New Library Object
     */
    @Override
    public void addLibrary(final Library newLibrary) {
        libraryService.addLibrary(newLibrary);
        return;
    }

    /**
     * DAO
     * Update an Existing Library Object in DataBase
     *
     * @param libraryToUpdate Library Object Updated
     * @param libraryToFind   Library Object to update
     */
    @Override
    public void updateLibrary(final Library libraryToUpdate, final Library libraryToFind) {
        libraryService.updateLibrary(libraryToUpdate, libraryToFind);
        return;
    }

    /**
     * DAO
     * Delete an Existing Library Object in DataBase
     *
     * @param libraryToDelete Library Object to delete
     */
    @Override
    public void deleteLibrary(final Library libraryToDelete) {
        libraryService.deleteLibrary(libraryToDelete);
    }

    /**
     * DAO
     * Get a Library List Object
     *
     * @return Libraries -> List of Library Object
     */
    @Override
    public List<Library> libraries() {
        return libraryService.listlibrary();
    }

    /**
     * DAO
     * Get a Precise Library Object by Identification Number
     *
     * @param library_id Library unique Identification number
     * @return Library Object Found
     */
    @Override
    public Library getLibrary(final Integer library_id) {
        return libraryService.getLibrary(library_id);
    }
}
