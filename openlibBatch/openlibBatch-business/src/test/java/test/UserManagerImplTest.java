package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.mahxwell.openlib.business.contract.manager.UserManager;
import org.mahxwell.openlib.service.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@ContextConfiguration(locations = "classpath:business-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserManagerImplTest {

    @Autowired
    UserManager userManager;
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

    /**
     * Test
     * Get Last Author Object in Data Base
     * @return Last Object -> For Delete
     */
    private User getLastUser() {
        try {
            List<User> users = userManager.Users();
            return users.get(users.size() - 1);
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    /* Add New User In DataBase */

    @Test
    public void addUser() {

        try {
            User user = InitializeUserObject("Jack", "White", "Jojo",
                    "jojo@test", "toto", "875136523");
            userManager.addUser(user);
            userManager.deleteUser(getLastUser());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /*  Update User */

    @Test
    public void updateUser() {

        try {
            User user = InitializeUserObject("Jack", "White", "Jojo",
                    "jojo@test", "toto", "875136523");
            userManager.addUser(user);
            userManager.updateUser(user, getLastUser());
            userManager.deleteUser(getLastUser());
        } catch (Exception e) {
            logger.error(e);
        }

        List<User> users = userManager.Users();
    }

    /* Delete User */

    @Test
    public void deleteUser() {

        try {
            User user = InitializeUserObject("Jack", "White", "Jojo",
                    "jojo@test", "toto", "875136523");
            userManager.addUser(user);
            userManager.deleteUser(getLastUser());
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /* Show User List */

    @Test
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
}
