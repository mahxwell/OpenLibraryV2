package org.mahxwell.openlib.service.editor;

import org.apache.log4j.Logger;
import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.EditorManager;
import org.mahxwell.openlib.model.bean.openlib.Editor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Editor Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "editor")
public class EditorService extends AbstractManagerService {

    private static final Logger logger = Logger.getLogger(EditorService.class);

    /* Get EditorManager bean from Enum Contextloader */

    EditorManager editorManager = ContextLoader.INSTANCE.getEditorManager();

    /**
     * WebService
     * Get a Editor List Object
     *
     * @return Editors -> List of Editor Object
     */
    @WebMethod(operationName = "listeditor")
    public List<Editor> getEditorListService() {

        try {
            List<Editor> editors = editorManager.Editors();
            if (editors != null) {
                return editors;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listeditor method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Add a New Editor Object in DataBase
     *
     * @param newEditor New Editor Object
     */
    @WebMethod(operationName = "addEditor")
    public void addEditorService(final Editor newEditor) {
        try {
            editorManager.addEditor(newEditor);
        } catch (Exception e) {
            logger.error("Error addEditor method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing Editor Object in DataBase
     *
     * @param editorToUpdate Editor Object Updated
     * @param editorToFind   Editor Object to update
     */
    @WebMethod(operationName = "updateEditor")
    public void updateEditorService(final Editor editorToUpdate, final Editor editorToFind) {
        try {
            editorManager.updateEditor(editorToUpdate, editorToFind);
        } catch (Exception e) {
            logger.error("Error updateEditor method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing Editor Object in DataBase
     *
     * @param editorToDelete Editor Object to delete
     */
    @WebMethod(operationName = "deleteEditor")
    public void deleteEditorService(final Editor editorToDelete) {
        try {
            editorManager.deleteEditor(editorToDelete);
        } catch (Exception e) {
            logger.error("Error deleteEditor method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get a Precise Editor Object by Identification Number
     *
     * @param editor_id Editor unique Identification number
     * @return Editor Object Found
     */
    @WebMethod(operationName = "getEditor")
    public Editor getEditor(final Integer editor_id) {
        try {
            Editor editor = editorManager.getEditor(editor_id);
            if (editor != null)
                return editor;
            else
                return null;
        } catch (Exception e) {
            logger.error("Error getEditor method = " + e);
        }
        return null;
    }
}
