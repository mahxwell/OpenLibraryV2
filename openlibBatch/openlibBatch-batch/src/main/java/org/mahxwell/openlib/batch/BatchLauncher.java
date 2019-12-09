package org.mahxwell.openlib.batch;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Main Class of OpenLibBatch
 * <p>
 * Create several threads to send different informations to OpenLibrary users
 */
public class BatchLauncher {

    /**
     * Launch This Method with your IDE to begin threads
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Use 2 as parameters -> 2 threads
         */
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);

        TaskLateMailSender taskLateMailSender = new TaskLateMailSender();

        TaskFreeBookReservationMail taskFreeBookReservationMail = new TaskFreeBookReservationMail();

        /**
         * Execute Java Thread as Batch -> V1 : Send mails to users who are late for giving back previously loaned books
         */
        ses.scheduleAtFixedRate(taskLateMailSender.taskLateMail, 0, 30, SECONDS);

        /**
         * Execute Java Thread as Batch -> V2 : Send a mail when a book they previously loaned is available to loan
         */
        ses.scheduleAtFixedRate(taskFreeBookReservationMail.taskFreeReservation, 0, 30, SECONDS);

    }
}
