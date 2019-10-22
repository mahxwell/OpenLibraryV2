package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.consumer.contract.DaoFactory;
import org.mahxwell.openlib.consumer.contract.dao.*;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Dao Factory Implementation Class</h2>
 * <p> Contain all Getters and Setters for Dao Implementation</p>
 */
public class DaoFactoryImpl implements DaoFactory {

    private UserDao userDao;
    private LibraryDao libraryDao;
    private AuthorDao authorDao;
    private BookDao bookDao;
    private BookloaningDao bookloaningDao;
    private CopyDao copyDao;
    private EditorDao editorDao;
    private GenreDao genreDao;

    @Override
    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public LibraryDao getLibraryDao() {
        return libraryDao;
    }

    @Override
    public void setLibraryDao(LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }

    @Override
    public AuthorDao getAuthorDao() {
        return authorDao;
    }

    @Override
    public void setAuthorDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public BookDao getBookDao() {
        return bookDao;
    }

    @Override
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public BookloaningDao getBookloaningDao() {
        return bookloaningDao;
    }

    @Override
    public void setBookloaningDao(BookloaningDao bookloaningDao) {
        this.bookloaningDao = bookloaningDao;
    }

    @Override
    public CopyDao getCopyDao() {
        return copyDao;
    }

    @Override
    public void setCopyDao(CopyDao copyDao) {
        this.copyDao = copyDao;
    }

    @Override
    public EditorDao getEditorDao() {
        return editorDao;
    }

    @Override
    public void setEditorDao(EditorDao editorDao) {
        this.editorDao = editorDao;
    }

    @Override
    public GenreDao getGenreDao() {
        return genreDao;
    }

    @Override
    public void setGenreDao(GenreDao genreDao) {
        this.genreDao = genreDao;
    }
}
