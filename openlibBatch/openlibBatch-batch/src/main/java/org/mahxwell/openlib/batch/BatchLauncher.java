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
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BatchLauncher {

    private static final Logger logger = LogManager.getLogger(BatchLauncher.class);

    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
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
        ses.scheduleAtFixedRate(task, 0, 30, SECONDS);
        //Uncommment for exemple
        //    ses.shutdown();
    }
}
