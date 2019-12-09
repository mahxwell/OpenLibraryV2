package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.business.contract.manager.UserManager;
import org.mahxwell.openlib.model.bean.openlib.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ContextConfiguration(locations = "classpath:application-context-business-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserManagerImplTest {


    @Autowired
    private UserManager userManager;
    private static final Logger logger = Logger.getLogger(UserManagerImplTest.class);

    /**
     * Test
     * Initialize User Object for Unit Tests
     *
     * @param userName Set User Name
     * @param userSurname Set User Surname
     * @param userPseudo Set User Pseudo
     * @param userEmail Set User Email
     * @param userPassword Set User Password
     * @param userPhone Set User Phone
     * @return A User Object
     */
    private User InitializeUserObject(final String userName, final String userSurname, final String userPseudo,
                                      final String userEmail, final String userPassword, final String userPhone) {
        User user = new User();

        try {
            user.setUserName(userName);
            user.setUserSurname(userSurname);
            user.setUserPseudo(userPseudo);
            user.setUserEmail(userEmail);
            user.setUserPassword(userPassword);
            user.setUserPhone(userPhone);
        } catch (Exception e) {
            logger.error(e);
        }
        return user;
    }

    /* Add New User In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addUser() {

        try {
            User user = InitializeUserObject("Jack", "White", "Jojo",
                    "jojo@test", "toto", "875136523");
            userManager.addUser(user);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update User */

    @Test
    @Transactional
    @Rollback(true)
    public void updateUser() {

        try {
            List<User> users = userManager.Users();
            User user = InitializeUserObject("Jack", "White", "Jojo",
                    "jojo@test", "toto", "875136523");

            userManager.updateUser(user, users.get(0));
        } catch (Exception e) {
            logger.error(e);
        }

        List<User> users = userManager.Users();
    }

    /* Delete User */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteUser() {

        try {
            List<User> users = userManager.Users();

            if (users != null) {
                User user = users.get(0);
                userManager.deleteUser(user);
            } else {
                logger.error("no users available, delete failed...");
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show User List */

    @Test
    @Transactional
    @Rollback(true)
    public void users() {
        try {
            List<User> users = userManager.Users();

            if (users != null) {
                logger.info(users.toString());
            } else {
                logger.error("No users available");
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find User by email and password */

    @Test
    @Transactional
    @Rollback(true)
    public void loginUser() {
        try {
            List<User> users = userManager.Users();
            if (users != null) {
                String email = users.get(0).getUserEmail();
                String password = users.get(0).getUserPassword();
                User user = userManager.getLoginUser(email, password);
                logger.info(user.toString());
            } else {
                logger.error("login failed...");
            }
        } catch (Exception e) {
            logger.error(e);
        }

    }

    /* Show User List to Mail */

    @Test
    @Transactional
    @Rollback(true)
    public void usersToMail() {
        try {
            List<User> users = userManager.usersToSendMail();
            if (users != null) {
                logger.info(users.toString());
            } else {
                logger.error("No users available");
                return;
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Find One User By Identification Number */

    @Test
    @Transactional
    @Rollback(true)
    public void getUser() {
        try {
            User user = userManager.getUser(1);

            if (user != null) {
                logger.info(user.toString());
            } else {
                logger.error("No users available");
            }
        } catch (Exception e) {
            logger.error(e);
        }
    }
}