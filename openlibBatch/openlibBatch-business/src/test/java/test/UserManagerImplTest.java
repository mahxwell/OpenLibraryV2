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

    private static final Logger logger = Logger.getLogger(UserManagerImplTest.class);

    @Autowired
    UserManager userManager;

    /* Find User by email and password */

    @Test
    public void loginUser() {

        User user = userManager.getLoginUser("UserName3@test", "titi");
        if (user == null)
            logger.error("Could not find User");
        else
            logger.info(user.getUserName());
    }

    @Test
    public void listUserTest() {
        List<User> users = userManager.Users();

        if (users == null)
            logger.error("user List is null");
        else {
            for (int i = 0; i < users.size(); i++) {
                logger.info(users.get(i).getUserName());
            }
            logger.info("FINISHED");
        }
    }

    @Test
    public void addUserTest() {

        User user = new User();

        user.setUserName("UserNameClientManager");
        user.setUserSurname("UserSurnameClientManager");
        user.setUserPseudo("UserPseudoManager");
        user.setUserPassword("titi");
        user.setUserEmail("UserEmailClientManagert@test");
        user.setUserPhone("PhoneManager");

        if (user != null) {
            userManager.addUser(user);
        } else
            logger.error("User is null");
    }

    @Test
    public void updateUserTest() {
        List<User> users = userManager.Users();
        if (users.size() > 0) {
            User user = users.get(0);

            User updateUser = new User();
            updateUser.setUserName("UserNameClientUpdated");
            updateUser.setUserSurname("UserSurnameClientUpdated");
            updateUser.setUserPseudo("UserPseudoUpdated");
            updateUser.setUserPassword("toto");
            updateUser.setUserEmail("UserEmailClientUpdatedt@test");
            updateUser.setUserPhone("UpdatedPhone");
            if (user != null && updateUser != null)
                userManager.updateUser(updateUser, user);
            else
                logger.error("Could not update user");
        } else
            logger.error("No User available");
    }

    @Test
    public void deleteUserTest() {
        List<User> users = userManager.Users();

        if (users.size() > 0)
            userManager.deleteUser(users.get(0));
        else
            logger.error("Could not find User List");
    }

}
