package org.mahxwell.openlib.batch;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mahxwell.openlib.business.contract.manager.BookManager;
import org.mahxwell.openlib.business.contract.manager.UserManager;
import org.mahxwell.openlib.mail.JavaMailSenderUser;
import org.mahxwell.openlib.service.book.Book;
import org.mahxwell.openlib.service.user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a Java Thread that send mail to Users who are late to give back their loaned books
 */
public class TaskLateMailSender {

    private static final Logger logger = LogManager.getLogger(TaskLateMailSender.class);

    /**
     * Here Java Thread by Using Runnable task
     */
    Runnable taskLateMail = () -> {
        try {
            UserManager userManager = ContextLoader.INSTANCE.getUserManager();
            BookManager bookManager = ContextLoader.INSTANCE.getBookManager();

            List<User> users = userManager.usersToSendMail();
            List<Book> books = bookManager.booksToSendMail();
            List<String> userEmails = new ArrayList<>();
            List<String> booksLate = new ArrayList<>();

            for (int j = 0; j < users.size(); j++) {
                userEmails.add(users.get(j).getUserEmail());
                booksLate.add(books.get(j).getBookTitle());
            }

            for (int j = 0; j < userEmails.size(); j++) {
                JavaMailSenderUser.sendMessageToUser(userEmails.get(j), booksLate.get(j));

            }
        } catch (RuntimeException e) {
            logger.error(e);
        } catch (Exception e) {
            logger.error(e);
        }
    };

}
