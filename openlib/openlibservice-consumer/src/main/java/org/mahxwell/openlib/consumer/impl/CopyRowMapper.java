package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.model.bean.openlib.Copy;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CopyRowMapper {
    public RowMapper<Copy> getCopyRowMapper() {
        return getCopyRowMapper;
    }

    private RowMapper<Copy> getCopyRowMapper = new RowMapper<Copy>() {

        @Override
        public Copy mapRow(ResultSet resultSet, int i) throws SQLException {
            Copy copy = new Copy();
            copy.setCopyId(resultSet.getInt("copy_id"));
            copy.setBookIdBook(resultSet.getInt("book_id_book"));
            return copy;
        }
    };
}
