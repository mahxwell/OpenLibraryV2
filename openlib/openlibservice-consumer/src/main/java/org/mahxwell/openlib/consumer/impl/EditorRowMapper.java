package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.model.bean.openlib.Editor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EditorRowMapper {

    public RowMapper<Editor> getEditorRowMapper() {
        return getEditorRowMapper;
    }

    private RowMapper<Editor> getEditorRowMapper = new RowMapper<Editor>() {

        @Override
        public Editor mapRow(ResultSet resultSet, int i) throws SQLException {
            Editor editor = new Editor();
            editor.setEditorId(resultSet.getInt("editor_id"));
            editor.setEditorName(resultSet.getString("name"));
            editor.setEditorNationality(resultSet.getString("nationality"));

            return editor;
        }
    };
}
