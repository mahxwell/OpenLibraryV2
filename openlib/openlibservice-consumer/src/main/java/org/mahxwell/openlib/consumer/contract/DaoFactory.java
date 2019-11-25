package org.mahxwell.openlib.consumer.contract;

import org.mahxwell.openlib.consumer.contract.dao.*;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Dao Factory Class</h2>
 * <p>Contain all Getters and Setters for Dao</p>
 */
public interface DaoFactory {

    //User
    UserDao getUserDao();

    void setUserDao(UserDao userDao);

    // Author
    AuthorDao getAuthorDao();

    void setAuthorDao(AuthorDao authorDao);

    // Book
    BookDao getBookDao();

    void setBookDao(BookDao bookDao);

    //Bookloaning
    BookloaningDao getBookloaningDao();

    void setBookloaningDao(BookloaningDao bookloaningDao);

    // Copy
    CopyDao getCopyDao();

    void setCopyDao(CopyDao copyDao);

    // Editor
    EditorDao getEditorDao();

    void setEditorDao(EditorDao editorDao);

    //Genre
    GenreDao getGenreDao();

    void setGenreDao(GenreDao genreDao);

    //Library
    LibraryDao getLibraryDao();

    void setLibraryDao(LibraryDao libraryDao);

    //Reservation
    ReservationDao getReservationDao();

    void setReservationDao(ReservationDao reservationDao);

}
