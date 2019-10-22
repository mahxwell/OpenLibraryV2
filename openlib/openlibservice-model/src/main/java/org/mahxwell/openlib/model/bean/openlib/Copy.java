package org.mahxwell.openlib.model.bean.openlib;

/**
 * @author Mahxwell
 * <h1>Copy Class Object</h1>
 */
public class Copy {

    private Integer copyId, bookIdBook;

    public Integer getCopyId() {
        return copyId;
    }

    public void setCopyId(Integer copyId) {
        this.copyId = copyId;
    }

    public Integer getBookIdBook() {
        return bookIdBook;
    }

    public void setBookIdBook(Integer bookIdBook) {
        this.bookIdBook = bookIdBook;
    }

    @Override
    public String toString() {
        return "Copy{" +
                "copyId=" + copyId +
                ", bookIdBook=" + bookIdBook +
                '}';
    }
}
