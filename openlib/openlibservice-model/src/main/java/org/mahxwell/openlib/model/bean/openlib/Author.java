package org.mahxwell.openlib.model.bean.openlib;

import java.util.Date;

/**
 * @author Mahxwell
 * <h1>Author Class Object</h1>
 */
public class Author {

    private Integer authorId;
    private String authorName, authorSurname, authorNationality;
    private Date authorBirthdate;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorNationality() {
        return authorNationality;
    }

    public void setAuthorNationality(String authorNationality) {
        this.authorNationality = authorNationality;
    }

    public Date getAuthorBirthdate() {
        return authorBirthdate;
    }

    public void setAuthorBirthdate(Date authorBirthdate) {
        this.authorBirthdate = authorBirthdate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorNationality='" + authorNationality + '\'' +
                ", authorBirthdate=" + authorBirthdate +
                '}';
    }
}
