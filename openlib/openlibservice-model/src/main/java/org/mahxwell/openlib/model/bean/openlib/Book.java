package org.mahxwell.openlib.model.bean.openlib;


/**
 * @author Mahxwell
 * <h1>Book Class Object</h1>
 */
public class Book {

    private Integer bookId, bookYear, editorIdEditor, authorIdAuthor, genreIdGenre, libraryIdLibrary;
    private String bookTitle;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookYear() {
        return bookYear;
    }

    public void setBookYear(Integer bookYear) {
        this.bookYear = bookYear;
    }

    public Integer getEditorIdEditor() {
        return editorIdEditor;
    }

    public void setEditorIdEditor(Integer editorIdEditor) {
        this.editorIdEditor = editorIdEditor;
    }

    public Integer getAuthorIdAuthor() {
        return authorIdAuthor;
    }

    public void setAuthorIdAuthor(Integer authorIdAuthor) {
        this.authorIdAuthor = authorIdAuthor;
    }

    public Integer getGenreIdGenre() {
        return genreIdGenre;
    }

    public void setGenreIdGenre(Integer genreIdGenre) {
        this.genreIdGenre = genreIdGenre;
    }

    public Integer getLibraryIdLibrary() {
        return libraryIdLibrary;
    }

    public void setLibraryIdLibrary(Integer libraryIdLibrary) {
        this.libraryIdLibrary = libraryIdLibrary;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookYear=" + bookYear +
                ", editorIdEditor=" + editorIdEditor +
                ", authorIdAuthor=" + authorIdAuthor +
                ", genreIdGenre=" + genreIdGenre +
                ", libraryIdLibrary=" + libraryIdLibrary +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
