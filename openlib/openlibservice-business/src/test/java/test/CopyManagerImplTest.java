package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.CopyManager;
import org.mahxwell.openlib.model.bean.openlib.Copy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@ContextConfiguration(locations = "classpath:application-context-business-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CopyManagerImplTest {

    @Autowired
    private CopyManager copyManager;
    private static final Logger logger = Logger.getLogger(CopyManagerImplTest.class);



    /**
     * Test
     * Initialize Copy Object for Unit Tests
     *
     * @param bookId Set Book Identification Number
     * @return A Copy Object
     */
    private Copy InitializeCopyObject(final Integer bookId) {
        Copy copy = new Copy();
        try {
            copy.setBookIdBook(bookId);
        } catch (Exception e) {
            logger.error(e);
        }
        return copy;
    }


    /* Add New Copy In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addCopy() {

        try {
            Copy copy = InitializeCopyObject(1);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Copy */

    @Test
    @Transactional
    @Rollback(true)
    public void updateCopy() {
        try {
            Copy copy = InitializeCopyObject(3);
            List<Copy> copies = copyManager.Copies();

            copyManager.updateCopy(copy, copies.get(0));
        } catch (Exception e) {
            logger.error(e);
        }

    }

    /* Delete Copy */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteCopy() {
        try {
            List<Copy> copies = copyManager.Copies();
            if (copies != null) {
                copyManager.deleteCopy(copies.get(1));
            } else {
                logger.error("No Copy or update Copy out of range....");
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Copy List */

    @Test
    @Transactional
    @Rollback(true)
    public void copies() {
        try {
            List<Copy> copies = copyManager.Copies();
            if (copies != null)
                logger.info(copies.toString());
            else
                logger.error("No copy available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Copy List By Book */

    @Test
    @Transactional
    @Rollback(true)
    public void copiesByBook() {
        try {
            List<Copy> copies = copyManager.CopiesByBook(1);
            if (copies != null)
                logger.info(copies.toString());
            else
                logger.error("No copy available !");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One Copy By Identification Number */

    @Test
    @Transactional
    @Rollback(true)
    public void getCopy() {
        try {
            List<Copy> copies = copyManager.Copies();
            if (copies != null) {
                logger.info(copies.toString());
            } else {
                logger.error("No Copies available !");
            }
            Copy copy = copyManager.getCopy(1);
            Assert.assertEquals(copy.getCopyId(), copies.get(0).getCopyId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}