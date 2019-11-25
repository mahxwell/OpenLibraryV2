package test;

import org.apache.log4j.Logger;
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


    /* Add New Editor In DataBase */

    @Test
    public void addEditor() {

        /* Add 20 new editor */
        for (int i = 0; i < 20; i++) {
            Editor editor = new Editor();
            editor.setEditorName("editorName" + i);
            editor.setEditorNationality("editorNationality" + i);
            editorDao.addEditor(editor);
        }
    }

    /*  Update Editor */

    @Test
    public void updateEditor() {
        List<Editor> editors = editorDao.editors();
        if (editors != null || editors.size() < 3) {
            Editor editor = new Editor();
            editor.setEditorName("updateEditor");
            editor.setEditorNationality("updatedNationality");
            editorDao.updateEditor(editor, editors.get(1));
        } else {
            logger.error("No Editor or update Editor out of range....");
        }
    }

    /* Delete Library */

    @Test
    public void deleteEditor() {
        List<Editor> editors = editorDao.editors();
        if (editors != null || editors.size() < 3) {
            editorDao.deleteEditor(editors.get(1));
        } else {
            logger.error("No Editor or update Editor out of range....");
        }
    }

    /* Show Editor List */

    @Test
    public void editors() {

        List<Editor> editors = editorDao.editors();
        if (editors != null)
            logger.info(editors.toString());
        else
            logger.error("No editors available !");
    }
}
