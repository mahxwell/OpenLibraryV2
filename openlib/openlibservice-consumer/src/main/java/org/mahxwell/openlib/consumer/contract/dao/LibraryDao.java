package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.model.bean.openlib.Library;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Library Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface LibraryDao {

    void addLibrary(final Library newLibrary);

    void updateLibrary(final Library libraryToUpdate, final Library libraryToFind);

    void deleteLibrary(final Library libraryId);

    List<Library> Libraries();

    Library getLibrary(final Integer library_id);
}
