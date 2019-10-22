package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.EditorDao;
import org.mahxwell.openlib.service.editor.Editor;
import org.mahxwell.openlib.service.editor.EditorService;
import org.mahxwell.openlib.service.editor.Editor_Service;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Editor Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
public class EditorDaoImpl implements EditorDao {
    private Editor_Service editor_service = new Editor_Service();
    private EditorService editorService = editor_service.getEditorServicePort();

    /**
     * DAO
     * Add a New Editor Object in DataBase
     *
     * @param newEditor New Editor Object
     */
    @Override
    public void addEditor(final Editor newEditor) {
        editorService.addEditor(newEditor);
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

        editorService.updateEditor(editorToUpdate, editorToFind);
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

        editorService.deleteEditor(editorToDelete);
        return;
    }

    /**
     * DAO
     * Get a Editor List Object
     *
     * @return Editors -> List of Editor Object
     */
    @Override
    public List<Editor> editors() {
        return editorService.listeditor();
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
        return editorService.getEditor(editor_id);
    }
}
