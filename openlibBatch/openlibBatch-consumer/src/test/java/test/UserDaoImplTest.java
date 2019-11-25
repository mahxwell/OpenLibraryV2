package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.UserDao;
import org.mahxwell.openlib.service.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:consumer-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoImplTest {


    private static final Logger logger = Logger.getLogger(UserDaoImplTest.class);

    @Autowired
    UserDao userDao;

    /* Find User by email and password */

    @Test
    public void loginUser() {

        User user = userDao.getLoginUser("UserName3@test", "titi");
        if (user == null)
            logger.error("User is null for login");
        else {
            logger.info(user.getUserName());
        }
    }


    @Test
    public void listTest() {
        List<User> users = userDao.Users();

        if (users == null)
            logger.error("User List is null");
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

        user.setUserName("UserNameClient");
        user.setUserSurname("UserSurnameClient");
        user.setUserPseudo("UserPseudo");
        user.setUserPassword("titi");
        user.setUserEmail("UserEmailClientt@test");
        user.setUserPhone("Phone");
        if (user != null)
            userDao.addUser(user);
        else
            logger.error("Could not add user");
    }

    @Test
    public void updateUserTest() {

        List<User> users = userDao.Users();
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
                userDao.updateUser(updateUser, user);
            else
                logger.error("Could not update user");
        } else
            logger.error("No User available");

    }

    @Test
    public void deleteUserTest() {

        List<User> users = userDao.Users();

        if (users.size() > 0)
            userDao.deleteUser(users.get(0));
        else
            logger.error("Could not find User List");
    }

    @Test
    public void getUser() {

        User user = userDao.getUser(1);
        System.out.println(user.getUserName().toString());

    }
}