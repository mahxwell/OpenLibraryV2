package org.mahxwell.openlib.consumer.impl;


import org.mahxwell.openlib.model.bean.openlib.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper {
    public RowMapper<Book> getBookRowMapper() {
        return getBookRowMapper;
    }

    private RowMapper<Book> getBookRowMapper = new RowMapper<Book>() {

        @Override
        public Book mapRow(ResultSet resultSet, int i) throws SQLException {
            Book book = new Book();
            book.setBookId(resultSet.getInt("book_id"));
            book.setBookTitle(resultSet.getString("title"));
            book.setBookYear(resultSet.getInt("year"));
            book.setEditorIdEditor(resultSet.getInt("editor_id_editor"));
            book.setAuthorIdAuthor(resultSet.getInt("author_id_author"));
            book.setGenreIdGenre(resultSet.getInt("genre_id_genre"));
            book.setLibraryIdLibrary(resultSet.getInt("library_id_library"));

            return book;
        }
    };
}
