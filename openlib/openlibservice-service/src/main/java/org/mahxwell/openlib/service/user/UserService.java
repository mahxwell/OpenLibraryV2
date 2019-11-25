package org.mahxwell.openlib.service.user;

import org.apache.log4j.Logger;
import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.UserManager;
import org.mahxwell.openlib.model.bean.openlib.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>User Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "user")
public class UserService extends AbstractManagerService {

    private static final Logger logger = Logger.getLogger(UserService.class);

    /* Get UserManager bean from Enum Contextloader */

    UserManager userManager = ContextLoader.INSTANCE.getUserManager();

    /**
     * WebService
     * Get Login User
     * Take Email and Password to Find Existing User
     *
     * @param email    Email Name
     * @param password Password
     * @return User or NULL
     */
    @WebMethod(operationName = "loginuser")
    public User getLoginUserService(final String email, final String password) {
        try {
            User user = userManager.getLoginUser(email, password);
            if (user != null)
                return user;
        } catch (Exception e) {
            logger.error("Error login method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Get a User List Object
     *
     * @return Users -> List of User Object
     */
    @WebMethod(operationName = "listusers")
    public List<User> getUserListService() {
        try {
            List<User> users = userManager.Users();
            if (users != null) {
                return users;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listuser method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Add a New User Object in DataBase
     *
     * @param newUser New User Object
     */
    @WebMethod(operationName = "adduser")
    public void addUserService(final User newUser) {
        try {
            userManager.addUser(newUser);
        } catch (Exception e) {
            logger.error("Error adduser method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing User Object in DataBase
     *
     * @param userToUpdate User Object Updated
     * @param userToFind   User Object to update
     */
    @WebMethod(operationName = "updateuser")
    public void updateUserService(final User userToUpdate, final User userToFind) {
        try {
            userManager.updateUser(userToUpdate, userToFind);
        } catch (Exception e) {
            logger.error("Error updateuser method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing User Object in DataBase
     *
     * @param userToDelete User Object to delete
     */
    @WebMethod(operationName = "deleteuser")
    public void deleteUserService(final User userToDelete) {
        try {
            userManager.deleteUser(userToDelete);
        } catch (Exception e) {
            logger.error("Error deleteuser method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get List User To Send Mail -> Late to give back book
     *
     * @return
     */
    @WebMethod(operationName = "userstosendmail")
    public List<User> getUsersToSendMailService() {
        try {
            List<User> users = userManager.usersToSendMail();
            if (users != null) {
                return users;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listuser method = " + e);
        }
        return null;
    }

    @WebMethod(operationName = "getUser")
    public User getUserService(final Integer user_id) {
        try {
            User user = userManager.getUser(user_id);
            if (user != null) {
                return user;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error getUser method = " + e);
        }
        return null;
    }
}
