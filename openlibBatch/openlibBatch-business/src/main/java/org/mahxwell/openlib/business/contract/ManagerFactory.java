package org.mahxwell.openlib.business.contract;

import org.mahxwell.openlib.business.contract.manager.*;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Manager Factory Class</h2>
 * <p>Contain all Getters and Setters for Managers</p>
 */
public interface ManagerFactory {

    //USER
    UserManager getUserManager();

    void setUserManager(UserManager userManager);

    //LIBRARY
    LibraryManager getLibraryManager();

    void setLibraryManager(LibraryManager libraryManager);

    //AUTHOR

    AuthorManager getAuthorManager();

    void setAuthorManager(AuthorManager authorManager);

    // BOOKLOANING

    BookloaningManager getBookloaningManager();

    void setBookloaningManager(BookloaningManager bookloaningManager);

    //BOOK

    BookManager getBookManager();

    void setBookManager(BookManager bookManager);

    //COPY

    CopyManager getCopyManager();

    void setCopyManager(CopyManager copyManager);

    //EDITOR

    EditorManager getEditorManager();

    void setEditorManager(EditorManager editorManager);

    //GENRE

    GenreManager getGenreManager();

    void setGenreManager(GenreManager genreManager);

    //Reservation

    ReservationManager getReservationManager();

    void setReservationManager(ReservationManager reservationaManager);


}
