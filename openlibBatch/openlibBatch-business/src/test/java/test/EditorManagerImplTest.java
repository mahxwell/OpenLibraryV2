package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.EditorManager;
import org.mahxwell.openlib.service.editor.Editor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:business-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EditorManagerImplTest {

    @Autowired
    private EditorManager editorManager;
    private static final Logger logger = Logger.getLogger(EditorManagerImplTest.class);

    /**
     * Test
     * Initialize Editor Object for Unit Tests
     *
     * @param editorName Set Editor Name
     * @param editorNationality Set Editor Nationality
     * @return An Editor Object
     */
    private Editor InitializeEditorObject(final String editorName, final String editorNationality) {
        Editor editor = new Editor();

        try {
            editor.setEditorName(editorName);
            editor.setEditorNationality(editorNationality);
        } catch (Exception e) {
            logger.error(e);
        }
        return editor;
    }

    /**
     * Test
     * Get Last Editor Object in Data Base
     * @return Last Object -> For Delete
     */
    private Editor getLastEditor() {
        try {
            List<Editor> editors = editorManager.editors();
            return editors.get(editors.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    /* Add New Editor In DataBase */

    @Test
    public void addEditor() {

        try {
            Editor editor = InitializeEditorObject("Flam", "Allemand");
            editorManager.addEditor(editor);
            editorManager.deleteEditor(getLastEditor());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Editor */

    @Test
    public void updateEditor() {
        try {
            Editor editor = InitializeEditorObject("Flam", "Allemand");
            editorManager.addEditor(editor);
            editorManager.updateEditor(editor, getLastEditor());
            editorManager.deleteEditor(getLastEditor());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Library */

    @Test
    public void deleteEditor() {
        try {
            Editor editor = InitializeEditorObject("Flam", "Allemand");
            editorManager.addEditor(editor);
            editorManager.deleteEditor(getLastEditor());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Editor List */

    @Test
    public void editors() {
        try {
            List<Editor> editors = editorManager.editors();
            if (editors != null)
                logger.info(editors.toString());
            else
                logger.error("No editors available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Editor By Identification Number */

    @Test
    public void getEditor() {
        try {
            List<Editor> editors = editorManager.editors();
            if (editors != null) {
                logger.info(editors.toString());
            } else {
                logger.error("No Editors available !");
            }
            Editor editor = editorManager.getEditor(1);
            Assert.assertEquals(editor.getEditorId(), editors.get(0).getEditorId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
