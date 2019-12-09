package org.mahxwell.openlib;

import org.mahxwell.openlib.business.contract.manager.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public enum ContextLoader {

    INSTANCE();

    private UserManager userManager;
    private LibraryManager libraryManager;
    private AuthorManager authorManager;
    private BookManager bookManager;
    private BookloaningManager bookloaningManager;
    private CopyManager copyManager;
    private EditorManager editorManager;
    private GenreManager genreManager;
    private ReservationManager reservationManager;

    ContextLoader() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bootstrapContext.xml");
        userManager = context.getBean("userManager", UserManager.class);
        libraryManager = context.getBean("libraryManager", LibraryManager.class);
        authorManager = context.getBean("authorManager", AuthorManager.class);
        bookManager = context.getBean("bookManager", BookManager.class);
        bookloaningManager = context.getBean("bookloaningManager", BookloaningManager.class);
        copyManager = context.getBean("copyManager", CopyManager.class);
        editorManager = context.getBean("editorManager", EditorManager.class);
        genreManager = context.getBean("genreManager", GenreManager.class);
        reservationManager = context.getBean("reservationManager", ReservationManager.class);
    }

    public ContextLoader getInstance() {
        return INSTANCE;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public LibraryManager getLibraryManager() {
        return libraryManager;
    }

    public AuthorManager getAuthorManager() {
        return authorManager;
    }

    public BookManager getBookManager() {
        return bookManager;
    }

    public BookloaningManager getBookloaningManager() {
        return bookloaningManager;
    }

    public CopyManager getCopyManager() {
        return copyManager;
    }

    public EditorManager getEditorManager() {
        return editorManager;
    }

    public GenreManager getGenreManager() {
        return genreManager;
    }

    public ReservationManager getReservationManager() {
        return reservationManager;
    }
}
