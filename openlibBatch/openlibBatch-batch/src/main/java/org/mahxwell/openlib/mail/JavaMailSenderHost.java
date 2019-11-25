package org.mahxwell.openlib.mail;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JavaMailSenderHost {
    private static String HOST, PORT, USERNAME, PASSWORD;

    private static final Logger logger = LogManager.getLogger(JavaMailSenderHost.class);

    public static JavaMailSender getJavaMailSender() {

        propertiesLoaderForHost();
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost(HOST);
        mailSender.setPort(Integer.parseInt(PORT));
        mailSender.setUsername(USERNAME);
        mailSender.setPassword(PASSWORD);

        Properties properties = mailSender.getJavaMailProperties();
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.debug", "true");

        return mailSender;
    }

    private static void propertiesLoaderForHost() {
        Properties properties = new Properties();
        InputStream input = null;
        try {
            input = JavaMailSenderHost.class.getClassLoader().getResourceAsStream("maiL-configuration.properties");
            properties.load(input);
            HOST = properties.getProperty("host");
            PORT = properties.getProperty("port");
            USERNAME = properties.getProperty("username");
            PASSWORD = properties.getProperty("password");

        } catch (IOException e) {
            logger.error("No config.properties file found");
        }
    }
}
