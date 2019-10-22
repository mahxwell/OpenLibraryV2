package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.UserDao;
import org.mahxwell.openlib.service.user.User;
import org.mahxwell.openlib.service.user.UserService;
import org.mahxwell.openlib.service.user.User_Service;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>User Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
public class UserDaoImpl implements UserDao {

    private User_Service user_service = new User_Service();
    private UserService userService = user_service.getUserServicePort();

    /**
     * DAO
     * Get Login User
     * Take Email and Password to Find Existing User
     *
     * @param email    Email Name
     * @param password Password
     * @return User or NULL
     */
    @Override
    public User getLoginUser(final String email, final String password) {
        return userService.loginuser(email, password);
    }

    /**
     * DAO
     * Get a User List Object
     *
     * @return Users -> List of User Object
     */
    @Override
    public List<User> Users() {
        return userService.listusers();
    }

    /**
     * DAO
     * Add a New User Object in DataBase
     *
     * @param newUser New User Object
     */
    @Override
    public void addUser(final User newUser) {
        userService.adduser(newUser);
        return;
    }

    /**
     * DAO
     * Update an Existing User Object in DataBase
     *
     * @param userToUpdate User Object Updated
     * @param userToFind   User Object to update
     */
    @Override
    public void updateUser(final User userToUpdate, final User userToFind) {
        userService.updateuser(userToUpdate, userToFind);
        return;
    }

    /**
     * DAO
     * Delete an Existing User Object in DataBase
     *
     * @param userToDelete User Object to delete
     */
    @Override
    public void deleteUser(final User userToDelete) {
        userService.deleteuser(userToDelete);
        return;
    }

    /**
     * DAO
     * Get List User To Send Mail -> Late to give back book
     *
     * @return
     */
    @Override
    public List<User> usersToSendMail() {
        return userService.userstosendmail();
    }
}
