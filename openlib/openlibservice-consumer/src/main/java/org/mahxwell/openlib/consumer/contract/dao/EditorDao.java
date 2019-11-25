package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.model.bean.openlib.Editor;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Editor Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface EditorDao {
    void addEditor(final Editor newEditor);

    void updateEditor(final Editor editorToUpdate, final Editor editorToFind);

    void deleteEditor(final Editor editorId);

    List<Editor> Editors();

    Editor getEditor(final Integer editor_id);
}
