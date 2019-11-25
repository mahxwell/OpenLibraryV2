package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.model.bean.openlib.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRowMapper {

    public RowMapper<Author> getAuthorRowMapper() {
        return getAuthorRowMapper;
    }

    private RowMapper<Author> getAuthorRowMapper = new RowMapper<Author>() {

        @Override
        public Author mapRow(ResultSet resultSet, int i) throws SQLException {
            Author author = new Author();
            author.setAuthorId(resultSet.getInt("author_id"));
            author.setAuthorName(resultSet.getString("name"));
            author.setAuthorSurname(resultSet.getString("surname"));
            author.setAuthorNationality(resultSet.getString("nationality"));
            author.setAuthorBirthdate(resultSet.getDate("birthdate"));

            return author;
        }
    };
}
