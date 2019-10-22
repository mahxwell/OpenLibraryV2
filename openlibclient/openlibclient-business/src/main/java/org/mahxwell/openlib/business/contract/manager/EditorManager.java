package org.mahxwell.openlib.business.contract.manager;

import org.mahxwell.openlib.service.editor.Editor;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Editor Manager Interface</h2>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface EditorManager {
    void addEditor(final Editor newEditor);

    void updateEditor(final Editor editorToUpdate, final Editor editorToFind);

    void deleteEditor(final Editor editorToDelete);

    List<Editor> editors();

    Editor getEditor(final Integer editor_id);

}
