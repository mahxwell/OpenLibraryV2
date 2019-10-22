package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahxwell.openlib.consumer.contract.dao.UserDao;
import org.mahxwell.openlib.model.bean.openlib.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoImplTest {

    @Autowired
    private UserDao userDao;
    private static final Logger logger = Logger.getLogger(UserDaoImplTest.class);

    /* Add New User In DataBase */

    @Test
    @Transactional
    @Rollback(true)
    public void addUser() {
        /* Add 20 new User */
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setUserName("UserName" + i);
            user.setUserSurname("UserSurname" + i);
            user.setUserPseudo("UserPseudo" + i);
            user.setUserEmail("UserName" + i + "@test");
            user.setUserPassword("titi");
            user.setUserPhone("OOO");
            userDao.addUser(user);
        }
    }

    /*  Update User */

    @Test
    @Transactional
    @Rollback(true)
    public void updateUser() {
        List<User> users = userDao.Users();
        if (users != null) {

            User userToFind = users.get(0);
            User userToUpdate = new User();
            userToUpdate.setUserName("userNameUpdated");
            userToUpdate.setUserPhone("userPhone Updated");
            userToUpdate.setUserEmail("userMail@updated");
            userToUpdate.setUserSurname("UPDATEDsurname");
            userToUpdate.setUserPseudo("UPDATEDPSEUDO");
            userToUpdate.setUserPassword("UPDATEDPW");
            userDao.updateUser(userToUpdate, userToFind);
        } else {
            logger.error("No users available, update failed...");
            return;
        }
    }

    /* Delete User */

    @Test
    @Transactional
    @Rollback(true)
    public void deleteUser() {
        List<User> users = userDao.Users();

        if (users != null) {
            User user = users.get(0);
            userDao.deleteUser(user);
        } else {
            logger.error("no users available, delete failed...");
            return;
        }
    }

  /* Show User List */

    @Test
    @Transactional
    @Rollback(true)
    public void users() {

        List<User> users = userDao.Users();

        if (users != null) {
            logger.info(users.toString());
        } else {
            logger.error("No users available");
            return;
        }
    }

    /* Find User by email and password */

    @Test
    @Transactional
    @Rollback(true)
    public void loginUser() {

        List<User> users = userDao.Users();

        if (users != null) {
            String email = users.get(0).getUserEmail();
            String password = users.get(0).getUserPassword();
            User user = userDao.getLoginUser(email, password);
            logger.info(user.toString());
        } else {
            logger.error("login failed...");
            return;
        }
    }

    /* Show User List to Mail */

    @Test
    @Transactional
    @Rollback(true)
    public void usersToMail() {

        List<User> users = userDao.usersToSendMail();

        if (users != null) {
            logger.info(users.toString());
        } else {
            logger.error("No users available");
            return;
        }
    }
}