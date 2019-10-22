package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.model.bean.openlib.User;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h1>User Dao Interface</h1>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface UserDao {

    User getLoginUser(final String email, final String password);

    void addUser(final User newUser);

    void updateUser(final User userToUpdate, final User userIdToFind);

    void deleteUser(final User userId);

    List<User> Users();

    List<User> usersToSendMail();
}
