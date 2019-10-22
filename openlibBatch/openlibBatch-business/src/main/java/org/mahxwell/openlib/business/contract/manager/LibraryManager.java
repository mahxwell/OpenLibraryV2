package org.mahxwell.openlib.business.contract.manager;

import org.mahxwell.openlib.service.library.Library;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Library Manager Interface</h2>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface LibraryManager {

    void addLibrary(final Library newLibrary);

    void updateLibrary(final Library libraryToUpdate, final Library libraryToFind);

    void deleteLibrary(final Library libraryToDelete);

    List<Library> libraries();

    Library getLibrary(final Integer library_id);
}
