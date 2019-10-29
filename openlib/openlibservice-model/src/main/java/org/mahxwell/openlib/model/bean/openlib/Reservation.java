package org.mahxwell.openlib.model.bean.openlib;

import java.util.Date;

public class Reservation {

    private Integer reservationId, userIdUser, copyIdCopy, getBookId;
    private Date reservationDate;

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
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

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Integer getGetBookId() {
        return getBookId;
    }

    public void setGetBookId(Integer getBookId) {
        this.getBookId = getBookId;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", userIdUser=" + userIdUser +
                ", copyIdCopy=" + copyIdCopy +
                ", getBookId=" + getBookId +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
