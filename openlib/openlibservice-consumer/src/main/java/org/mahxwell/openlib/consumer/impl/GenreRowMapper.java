package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.model.bean.openlib.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreRowMapper {
    public RowMapper<Genre> getGenreRowMapper() {
        return getGenreRowMapper;
    }

    private RowMapper<Genre> getGenreRowMapper = new RowMapper<Genre>() {

        @Override
        public Genre mapRow(ResultSet resultSet, int i) throws SQLException {
            Genre genre = new Genre();
            genre.setGenreId(resultSet.getInt("genre_id"));
            genre.setGenreName(resultSet.getString("name"));
            return genre;
        }
    };
}
