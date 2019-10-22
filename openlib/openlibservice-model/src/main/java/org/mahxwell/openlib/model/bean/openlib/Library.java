package org.mahxwell.openlib.model.bean.openlib;


/**
 * @author Mahxwell
 * <h1>Library Class Object</h1>
 */
public class Library {

    private Integer libraryId;
    private String libraryName, libraryPostCode;

    public Integer getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Integer libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryPostCode() {
        return libraryPostCode;
    }

    public void setLibraryPostCode(String libraryPostCode) {
        this.libraryPostCode = libraryPostCode;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryId=" + libraryId +
                ", libraryName='" + libraryName + '\'' +
                ", libraryPostCode='" + libraryPostCode + '\'' +
                '}';
    }
}
