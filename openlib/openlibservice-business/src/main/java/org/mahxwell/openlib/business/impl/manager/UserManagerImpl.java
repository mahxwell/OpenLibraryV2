package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.UserManager;
import org.mahxwell.openlib.model.bean.openlib.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h1>User Manager Implementation Class</h1>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
@Transactional
public class UserManagerImpl extends AbstractManagerImpl implements UserManager {

    /**
     * Manager
     * Get Login User
     * Take Email and Password to Find Existing User
     *
     * @param email    Email Name
     * @param password Password
     * @return User or NULL
     */
    @Override
    public User getLoginUser(final String email, final String password) {
        User user = getDaoFactory().getUserDao().getLoginUser(email, password);
        return user;
    }

    /**
     * Manager
     * Add a New User Object in DataBase
     *
     * @param newUser New User Object
     */
    @Override
    public void addUser(final User newUser) {
        getDaoFactory().getUserDao().addUser(newUser);
        return;
    }

    /**
     * Manager
     * Update an Existing User Object in DataBase
     *
     * @param userToUpdate User Object Updated
     * @param userToFind   User Object to update
     */
    @Override
    public void updateUser(final User userToUpdate, final User userToFind) {
        getDaoFactory().getUserDao().updateUser(userToUpdate, userToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing User Object in DataBase
     *
     * @param userToDelete User Object to delete
     */
    @Override
    public void deleteUser(final User userToDelete) {
        getDaoFactory().getUserDao().deleteUser(userToDelete);
        return;
    }

    /**
     * Manager
     * Get a User List Object
     *
     * @return Users -> List of User Object
     */
    @Override
    public List<User> Users() {
        return getDaoFactory().getUserDao().Users();
    }

    /**
     * Manager
     * Get List User To Send Mail -> Late to give back book
     *
     * @return
     */
    @Override
    public List<User> usersToSendMail() {
        return getDaoFactory().getUserDao().usersToSendMail();
    }
}
