package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.CopyDao;
import org.mahxwell.openlib.service.copy.Copy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:consumer-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CopyDaoImplTest {
    @Autowired
    private CopyDao copyDao;
    private static final Logger logger = Logger.getLogger(CopyDaoImplTest.class);


    /* Add New Copy In DataBase */

    @Test
    public void addCopy() {
        /* Add 20 new library */
        for (int i = 0; i < 20; i++) {
            Copy copy = new Copy();
            copy.setBookIdBook(4);
            copyDao.addCopy(copy);
        }
    }

    /*  Update Copy */

    @Test
    public void updateCopy() {

        List<Copy> copies = copyDao.copies();
        if (copies != null || copies.size() < 3) {
            Copy copy = new Copy();
            copy.setBookIdBook(5);
            copyDao.updateCopy(copy, copies.get(1));
        } else {
            logger.error("No Copy or update Copy out of range....");
        }
    }

    /* Delete Copy */

    @Test
    public void deleteCopy() {
        List<Copy> copies = copyDao.copies();
        if (copies != null || copies.size() < 3) {
            copyDao.deleteCopy(copies.get(1));
        } else {
            logger.error("No Copy or update Copy out of range....");
        }
    }

    /* Show Copy List */

    @Test
    public void copies() {

        List<Copy> copies = copyDao.copies();
        if (copies != null)
            logger.info(copies.toString());
        else
            logger.error("No copy available !");
    }
}
