package org.mahxwell.openlib.business.contract.manager;


import org.mahxwell.openlib.model.bean.openlib.Editor;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Editor Manager Interface</h2>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface EditorManager {

    void addEditor(final Editor newEditor);

    void updateEditor(final Editor editorToUpdate, final Editor editorIdToFind);

    void deleteEditor(final Editor editorId);

    List<Editor> Editors();

    Editor getEditor(final Integer editor_id);
}
