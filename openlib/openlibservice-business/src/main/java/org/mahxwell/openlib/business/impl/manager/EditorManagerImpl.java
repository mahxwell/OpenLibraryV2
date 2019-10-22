package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.EditorManager;
import org.mahxwell.openlib.model.bean.openlib.Editor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Editor Manager Implementation Class</h2>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
@Transactional
public class EditorManagerImpl extends AbstractManagerImpl implements EditorManager {

    /**
     * Manager
     * Add a New Editor Object in DataBase
     *
     * @param newEditor New Editor Object
     */
    @Override
    public void addEditor(final Editor newEditor) {
        getDaoFactory().getEditorDao().addEditor(newEditor);
        return;
    }

    /**
     * Manager
     * Update an Existing Editor Object in DataBase
     *
     * @param editorToUpdate Editor Object Updated
     * @param editorToFind   Editor Object to update
     */
    @Override
    public void updateEditor(final Editor editorToUpdate, final Editor editorToFind) {
        getDaoFactory().getEditorDao().updateEditor(editorToUpdate, editorToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing Editor Object in DataBase
     *
     * @param editorToDelete Editor Object to delete
     */
    @Override
    public void deleteEditor(final Editor editorToDelete) {
        getDaoFactory().getEditorDao().deleteEditor(editorToDelete);
        return;
    }

    /**
     * Manager
     * Get a Editor List Object
     *
     * @return Editors -> List of Editor Object
     */
    @Override
    public List<Editor> Editors() {
        return getDaoFactory().getEditorDao().Editors();
    }

    /**
     * Manager
     * Get a Precise Editor Object by Identification Number
     *
     * @param editor_id Editor unique Identification number
     * @return Editor Object Found
     */
    @Override
    public Editor getEditor(final Integer editor_id) {
        return getDaoFactory().getEditorDao().getEditor(editor_id);
    }
}
