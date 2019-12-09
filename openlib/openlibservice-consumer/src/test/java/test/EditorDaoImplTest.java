package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.EditorDao;
import org.mahxwell.openlib.model.bean.openlib.Editor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ContextConfiguration(locations = "classpath:application-context-test.xml")
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

    /* Add New Editor In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addEditor() {

        try {
            Editor editor = InitializeEditorObject("Flam", "Allemand");
            editorDao.addEditor(editor);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Editor */

    @Test
    @Transactional
    @Rollback(true)
    public void updateEditor() {
        try {
            List<Editor> editors = editorDao.Editors();
            Editor editor = InitializeEditorObject("Updated", "Updated");

            editorDao.updateEditor(editor, editors.get(0));
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Delete Library */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteEditor() {
        try {
            List<Editor> editors = editorDao.Editors();
            if (editors != null) {
                editorDao.deleteEditor(editors.get(1));
            } else {
                logger.error("No Editor or update Editor out of range....");
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Editor List */

    @Test
    @Transactional
    @Rollback(true)
    public void editors() {
        try {
            List<Editor> editors = editorDao.Editors();
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
    @Transactional
    @Rollback(true)
    public void getEditor() {
        try {
            List<Editor> editors = editorDao.Editors();
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