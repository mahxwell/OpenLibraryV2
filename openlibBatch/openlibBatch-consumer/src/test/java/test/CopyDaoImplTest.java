package test;

import org.apache.log4j.Logger;
import org.junit.Assert;
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

    /**
     * Test
     * Get Last Copy Object in Data Base
     * @return Last Object -> For Delete
     */
    private Copy getLastCopy() {
        try {
            List<Copy> copies = copyDao.copies();
            return copies.get(copies.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    /* Add New Copy In DataBase */

    @Test
    public void addCopy() {

        try {
            Copy copy = InitializeCopyObject(1);
            copyDao.addCopy(copy);
            copyDao.deleteCopy(getLastCopy());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update Copy */

    @Test
    public void updateCopy() {
        try {
            Copy copy = InitializeCopyObject(2);
            copyDao.addCopy(copy);
            copyDao.updateCopy(copy, getLastCopy());
            copyDao.deleteCopy(getLastCopy());
        } catch (Exception e) {
            logger.error(e);
        }

    }

    /* Delete Copy */

    @Test
    public void deleteCopy() {
        try {
            Copy copy = InitializeCopyObject(1);
            copyDao.addCopy(copy);
            copyDao.deleteCopy(getLastCopy());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show Copy List */

    @Test
    public void copies() {
        try {
            List<Copy> copies = copyDao.copies();
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
    public void copiesByBook() {
        try {
            List<Copy> copies = copyDao.copiesByBook(1);
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
    public void getCopy() {
        try {
            List<Copy> copies = copyDao.copies();
            if (copies != null) {
                logger.info(copies.toString());
            } else {
                logger.error("No Copies available !");
            }
            Copy copy = copyDao.getCopy(1);
            Assert.assertEquals(copy.getCopyId(), copies.get(0).getCopyId());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
