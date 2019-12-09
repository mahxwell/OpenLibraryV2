package org.mahxwell.openlib.business.contract.manager;

import org.mahxwell.openlib.model.bean.openlib.User;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>User Manager Interface</h2>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface UserManager {
    User getLoginUser(final String email, final String password);

    void addUser(final User newUser);

    void updateUser(final User userToUpdate, final User userIdToFind);

    void deleteUser(final User userId);

    List<User> Users();

    List<User> usersToSendMail();

    User getUser(final Integer user_id);
}
