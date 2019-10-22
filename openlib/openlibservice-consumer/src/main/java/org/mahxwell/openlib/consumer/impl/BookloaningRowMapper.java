package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.model.bean.openlib.Bookloaning;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookloaningRowMapper {
    public RowMapper<Bookloaning> getBookloaningRowMapper() {
        return getBookloaningRowMapper;
    }

    private RowMapper<Bookloaning> getBookloaningRowMapper = new RowMapper<Bookloaning>() {

        @Override
        public Bookloaning mapRow(ResultSet resultSet, int i) throws SQLException {
            Bookloaning bookloaning = new Bookloaning();
            bookloaning.setBookLoaningId(resultSet.getInt("bookloaning_id"));
            bookloaning.setExtended(resultSet.getBoolean("is_extended"));
            bookloaning.setBeginDate(resultSet.getDate("begin_date"));
            bookloaning.setEndDate(resultSet.getDate("endind_date"));
            bookloaning.setGetBookId(resultSet.getInt("get_book_id"));
            bookloaning.setUserIdUser(resultSet.getInt("user_id_user"));
            bookloaning.setCopyIdCopy(resultSet.getInt("copy_id_copy"));
            return bookloaning;
        }
    };
}
