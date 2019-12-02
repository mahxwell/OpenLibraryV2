package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.EditorDao;
import org.mahxwell.openlib.service.editor.Editor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:consumer-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EditorDaoImplTest {

    @Autowired
    private EditorDao editorDao;
    private static final Logger logger = Logger.getLogger(EditorDaoImplTest.class);


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
            List<Editor> editors = editorDao.editors();
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
            editorDao.addEditor(editor);
            editorDao.deleteEditor(getLastEditor());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Editor */

    @Test
    public void updateEditor() {
        try {
            Editor editor = InitializeEditorObject("Flam", "Allemand");
            editorDao.addEditor(editor);
            editorDao.updateEditor(editor, getLastEditor());
            editorDao.deleteEditor(getLastEditor());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Library */

    @Test
    public void deleteEditor() {
        try {
            Editor editor = InitializeEditorObject("Flam", "Allemand");
            editorDao.addEditor(editor);
            editorDao.deleteEditor(getLastEditor());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Editor List */

    @Test
    public void editors() {
        try {
            List<Editor> editors = editorDao.editors();
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
            List<Editor> editors = editorDao.editors();
            if (editors != null) {
                logger.info(editors.toString());
            } else {
                logger.error("No Editors available !");
            }
            Editor editor = editorDao.getEditor(1);
            Assert.assertEquals(editor.getEditorId(), editors.get(0).getEditorId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
