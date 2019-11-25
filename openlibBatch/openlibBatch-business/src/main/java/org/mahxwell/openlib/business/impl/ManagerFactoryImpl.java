package org.mahxwell.openlib.business.impl;

import org.mahxwell.openlib.business.contract.ManagerFactory;
import org.mahxwell.openlib.business.contract.manager.*;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Manager Factory Implementation Class</h2>
 * <p>Contain all Getters and Setters for Managers Implementation</p>
 */
public class ManagerFactoryImpl implements ManagerFactory {

    private UserManager userManager;
    private LibraryManager libraryManager;
    private AuthorManager authorManager;
    private BookloaningManager bookloaningManager;
    private BookManager bookManager;
    private CopyManager copyManager;
    private EditorManager editorManager;
    private GenreManager genreManager;
    private ReservationManager reservationManager;

    @Override
    public UserManager getUserManager() {
        return userManager;
    }

    @Override
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public LibraryManager getLibraryManager() {
        return libraryManager;
    }

    @Override
    public void setLibraryManager(LibraryManager libraryManager) {
        this.libraryManager = libraryManager;
    }

    @Override
    public AuthorManager getAuthorManager() {
        return authorManager;
    }

    @Override
    public void setAuthorManager(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    @Override
    public BookloaningManager getBookloaningManager() {
        return bookloaningManager;
    }

    @Override
    public void setBookloaningManager(BookloaningManager bookloaningManager) {
        this.bookloaningManager = bookloaningManager;
    }

    @Override
    public BookManager getBookManager() {
        return bookManager;
    }

    @Override
    public void setBookManager(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    @Override
    public CopyManager getCopyManager() {
        return copyManager;
    }

    @Override
    public void setCopyManager(CopyManager copyManager) {
        this.copyManager = copyManager;
    }

    @Override
    public EditorManager getEditorManager() {
        return editorManager;
    }

    @Override
    public void setEditorManager(EditorManager editorManager) {
        this.editorManager = editorManager;
    }

    @Override
    public GenreManager getGenreManager() {
        return genreManager;
    }

    @Override
    public void setGenreManager(GenreManager genreManager) {
        this.genreManager = genreManager;
    }

    @Override
    public ReservationManager getReservationManager() {
        return reservationManager;
    }

    @Override
    public void setReservationManager(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
    }
}
