package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.model.bean.openlib.Library;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryRowMapper {
    public RowMapper<Library> getLibraryRowMapper() {
        return getLibraryRowMapper;
    }

    private RowMapper<Library> getLibraryRowMapper = new RowMapper<Library>() {

        @Override
        public Library mapRow(ResultSet resultSet, int i) throws SQLException {
            Library library = new Library();
            library.setLibraryId(resultSet.getInt("library_id"));
            library.setLibraryName(resultSet.getString("name"));
            library.setLibraryPostCode(resultSet.getString("post_code"));

            return library;
        }
    };
}
