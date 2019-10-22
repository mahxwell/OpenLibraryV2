package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.service.editor.Editor;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Editor Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface EditorDao {

    void addEditor(final Editor newEditor);

    void updateEditor(final Editor editorToUpdate, final Editor editorToFind);

    void deleteEditor(final Editor editorToDelete);

    List<Editor> editors();

    Editor getEditor(final Integer editor_id);
}