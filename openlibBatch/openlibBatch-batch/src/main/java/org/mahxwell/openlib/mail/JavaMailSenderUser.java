package org.mahxwell.openlib.mail;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.mail.SimpleMailMessage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public  class JavaMailSenderUser extends JavaMailSenderHost {

    public static final Logger logger = LogManager.getLogger(JavaMailSenderUser.class);

    private static String SUJET, MESSAGE, SUJETFORRESERVATION, MESSAGEFORRESERVATION, SUJETRFORESERVATIONRETARD,
    MESSAGEFORRESERVATIONRETARD;

    public static void sendMessageToUser(String userMail, String book) {

        propertiesLoaderForUser();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userMail);
        message.setSubject(SUJET);
        message.setText(MESSAGE + book);
        getJavaMailSender().send(message);

        logger.info("Email sent to : " + userMail);
    }

    public static void sendMessageToUserReservation(String userMail, String book, String userName) {
        propertiesLoaderForUser();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userMail);
        message.setSubject(SUJETFORRESERVATION + book + " Disponible");
        message.setText(getPresentation(userName) +book + " " + MESSAGEFORRESERVATION);
        getJavaMailSender().send(message);
    }

    public static void sendMessageToUserReservationWhenTooLate(String userMail, String book, String userName) {
        propertiesLoaderForUser();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userMail);
        message.setSubject(SUJETRFORESERVATIONRETARD + book);
        message.setText(getPresentation(userName) + MESSAGEFORRESERVATIONRETARD + book);
        getJavaMailSender().send(message);
    }

    private static String getPresentation(String userName) {
        return "Bonjour " + userName + ", \n";
    }

    private static void propertiesLoaderForUser() {
        Properties properties = new Properties();
        InputStream input = null;
        try {
            input = JavaMailSenderUser.class.getClassLoader().getResourceAsStream("mail-configuration.properties");
            properties.load(input);
            SUJET = properties.getProperty("sujet");
            MESSAGE = properties.getProperty("message");
            SUJETFORRESERVATION = properties.getProperty("sujetforreservation");
            MESSAGEFORRESERVATION =  properties.getProperty("messageforreservation");
            SUJETRFORESERVATIONRETARD = properties.getProperty("sujetforreservationretard");
            MESSAGEFORRESERVATIONRETARD = properties.getProperty("messageforreservationretard");

        } catch (IOException e) {
            System.err.println("No config.properties file found");
        }
    }
}
