package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.EditorManager;
import org.mahxwell.openlib.model.bean.openlib.Editor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@ContextConfiguration(locations = "classpath:application-context-business-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EditorManagerImplTest {

    @Autowired
    private EditorManager editorManager;
    private static final Logger logger = Logger.getLogger(EditorManagerImplTest.class);



    /* Add New Editor In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addEditor() {

        /* Add 20 new editor */
        for (int i = 0; i < 20; i++) {
            Editor editor = new Editor();
            editor.setEditorName("editorName" + i);
            editor.setEditorNationality("editorNationality" + i);
            editorManager.addEditor(editor);
        }
    }

    /*  Update Editor */

    @Test
    @Transactional
    @Rollback(true)
    public void updateEditor() {
        List<Editor> editors = editorManager.Editors();
        if (editors != null || editors.size() < 3) {
            Editor editor = new Editor();
            editor.setEditorName("updateEditor");
            editor.setEditorNationality("updatedNationality");
            editorManager.updateEditor(editor, editors.get(1));
        } else {
            logger.error("No Editor or update Editor out of range....");
        }
    }

    /* Delete Library */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteEditor() {
        List<Editor> editors = editorManager.Editors();
        if (editors != null || editors.size() < 3) {
            editorManager.deleteEditor(editors.get(1));
        } else {
            logger.error("No Editor or update Editor out of range....");
        }
    }

    /* Show Editor List */

    @Test
    @Transactional
    @Rollback(true)
    public void editors() {

        List<Editor> editors = editorManager.Editors();
        if (editors != null)
            logger.info(editors.toString());
        else
            logger.error("No editors available !");
    }
}