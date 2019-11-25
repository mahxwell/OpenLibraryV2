package org.mahxwell.openlib.consumer.impl.dao;


import org.mahxwell.openlib.consumer.contract.dao.EditorDao;
import org.mahxwell.openlib.consumer.impl.EditorRowMapper;
import org.mahxwell.openlib.model.bean.openlib.Editor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Editor Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class EditorDaoImpl extends AbstractDaoImpl implements EditorDao {

    /**
     * DAO
     * Add a New Editor Object in DataBase
     *
     * @param newEditor New Editor Object
     */
    @Override
    public void addEditor(final Editor newEditor) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.editor(name, nationality) VALUES"
                + " (:name, :nationality)";

        parameters.addValue("name", newEditor.getEditorName());
        parameters.addValue("nationality", newEditor.getEditorNationality());
        template.update(query, parameters);

        return;

    }

    /**
     * DAO
     * Update an Existing Editor Object in DataBase
     *
     * @param editorToUpdate Editor Object Updated
     * @param editorToFind   Editor Object to update
     */
    @Override
    public void updateEditor(final Editor editorToUpdate, final Editor editorToFind) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.editor SET"
                + " name = :name, nationality = :nationality"
                + " WHERE editor_id = :editor_id";

        parameters.addValue("editor_id", editorToFind.getEditorId());
        parameters.addValue("name", editorToUpdate.getEditorName());
        parameters.addValue("nationality", editorToUpdate.getEditorNationality());
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Delete an Existing Editor Object in DataBase
     *
     * @param editorToDelete Editor Object to delete
     */
    @Override
    public void deleteEditor(final Editor editorToDelete) {

        Integer editor_id = editorToDelete.getEditorId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.editor WHERE editor_id = :editor_id";
        parameters.addValue("editor_id", editor_id);
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Get a Editor List Object
     *
     * @return Editors -> List of Editor Object
     */
    @Override
    public List<Editor> Editors() {

        EditorRowMapper editorRowMapper = new EditorRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.editor";

        List<Editor> editors = template.query(query, editorRowMapper.getEditorRowMapper());

        return editors;
    }

    /**
     * DAO
     * Get a Precise Editor Object by Identification Number
     *
     * @param editor_id Editor unique Identification number
     * @return Editor Object Found
     */
    @Override
    public Editor getEditor(final Integer editor_id) {
        String query
                = "SELECT * FROM librarydb.editor"
                + " WHERE editor_id = " + editor_id;

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        EditorRowMapper editorRowMapper = new EditorRowMapper();

        List<Editor> editors = template.query(query, editorRowMapper.getEditorRowMapper());
        return editors.get(0);
    }

}