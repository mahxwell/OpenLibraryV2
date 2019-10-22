package org.mahxwell.openlib.model.bean.openlib;

import java.util.Date;

/**
 * @author Mahxwell
 * <h1>Bookloaning Class Object</h1>
 */
public class Bookloaning {

    private Integer bookLoaningId, userIdUser, copyIdCopy, getBookId;
    private Date beginDate, endDate;
    private boolean isExtended;

    public Integer getBookLoaningId() {
        return bookLoaningId;
    }

    public void setBookLoaningId(Integer bookLoaningId) {
        this.bookLoaningId = bookLoaningId;
    }

    public Integer getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(Integer userIdUser) {
        this.userIdUser = userIdUser;
    }

    public Integer getCopyIdCopy() {
        return copyIdCopy;
    }

    public void setCopyIdCopy(Integer copyIdCopy) {
        this.copyIdCopy = copyIdCopy;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isExtended() {
        return isExtended;
    }

    public void setExtended(boolean extended) {
        isExtended = extended;
    }

    public Integer getGetBookId() {
        return getBookId;
    }

    public void setGetBookId(Integer getBookId) {
        this.getBookId = getBookId;
    }

    @Override
    public String toString() {
        return "Bookloaning{" +
                "bookLoaningId=" + bookLoaningId +
                ", userIdUser=" + userIdUser +
                ", copyIdCopy=" + copyIdCopy +
                ", getBookId=" + getBookId +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", isExtended=" + isExtended +
                '}';
    }
}
