package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.mahxwell.openlib.action.BookLoaningAction;
import org.mahxwell.openlib.business.contract.manager.BookloaningManager;
import org.mahxwell.openlib.service.bookloaning.Bookloaning;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;


public class BookLoaningActionTest {


    private Integer EXTEND_DAY, INIT_DAY;

    private BookLoaningAction bookLoaningAction;

    private static final Logger logger = Logger.getLogger(BookLoaningActionTest.class);
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bootstrapContext.xml");
    private BookloaningManager bookloaningManager = context.getBean("bookloaningManager", BookloaningManager.class);

    @Test
    public void showBookloaningListByBookAndUser() {
        List<Bookloaning> list = bookloaningManager.bookloaningsByBookAndByUser(4, 1);
        if (list == null)
            logger.info("List is null");
        else
            logger.info("list = " + list.toString());
    }

    @Test
    public void showBookloanings() {
        List<Bookloaning> list = bookloaningManager.bookloanings();
        if (list == null)
            logger.info("List is null");
        else
            logger.info("list = " + list.toString());
    }
}