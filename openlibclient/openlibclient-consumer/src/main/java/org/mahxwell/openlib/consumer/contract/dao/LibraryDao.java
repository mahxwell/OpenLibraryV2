package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.service.library.Library;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Library Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface LibraryDao {

    void addLibrary(final Library newLibrary);

    void updateLibrary(final Library libraryToUpdate, final Library libraryToFind);

    void deleteLibrary(final Library libraryToDelete);

    List<Library> libraries();

    Library getLibrary(final Integer library_id);
}
