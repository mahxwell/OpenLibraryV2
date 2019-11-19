package org.mahxwell.openlib.batch;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Create a Java Thread that send mail when a book previously reserved by a user is available
 */
public class TaskFreeBookReservationMail {

    private static final Logger logger = LogManager.getLogger(TaskFreeBookReservationMail.class);

    /**
     * Here Java Thread by Using Runnable task
     */
    Runnable taskFreeReservation = () -> {
        try {
          //TEST//
        } catch (RuntimeException e) {
            logger.error(e);
        } catch (Exception e) {
            logger.error(e);
        }
    };
}
