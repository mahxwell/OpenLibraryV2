package org.mahxwell.openlib.business.contract.manager;


import org.mahxwell.openlib.model.bean.openlib.Library;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Library Manager Interface</h2>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface LibraryManager {
    void addLibrary(final Library newLibrary);

    void updateLibrary(final Library libraryToUpdate, final Library libraryIdToFind);

    void deleteLibrary(final Library libraryId);

    List<Library> Libraries();

    Library getLibrary(final Integer library_id);
}
