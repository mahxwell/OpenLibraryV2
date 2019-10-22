package org.mahxwell.openlib.mail;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.mail.SimpleMailMessage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JavaMailSenderUser extends JavaMailSenderHost {

    public static final Logger logger = LogManager.getLogger(JavaMailSenderUser.class);

    private static String SUJET, MESSAGE;

    public static void sendMessageToUser(String userMail, String book) {

        propertiesLoaderForUser();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userMail);
        message.setSubject(SUJET);
        message.setText(MESSAGE + book);
        getJavaMailSender().send(message);

        logger.info("Email sent to : " + userMail);
    }

    private static void propertiesLoaderForUser() {
        Properties properties = new Properties();
        InputStream input = null;
        try {
            input = JavaMailSenderUser.class.getClassLoader().getResourceAsStream("maiL-configuration.properties");
            properties.load(input);
            SUJET = properties.getProperty("sujet");
            MESSAGE = properties.getProperty("message");

        } catch (IOException e) {
            System.err.println("No config.properties file found");
        }
    }
}
