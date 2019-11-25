package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.UserDao;
import org.mahxwell.openlib.consumer.impl.UserRowMapper;
import org.mahxwell.openlib.model.bean.openlib.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>User Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
@Transactional
public class UserDaoImpl extends AbstractDaoImpl implements UserDao {

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


        String query = "SELECT * FROM librarydb.user"
                + " WHERE mail = " + "'" + email + "'"
                + " AND password = " + "'" + password + "'";

        JdbcTemplate template = new JdbcTemplate(getDataSource());
        UserRowMapper userRowMapper = new UserRowMapper();

        List<User> users = template.query(query, userRowMapper.getUserRowMapper());
        return users.get(0);
    }

    /**
     * DAO
     * Add a New User Object in DataBase
     *
     * @param newUser New User Object
     */
    @Override
    public void addUser(final User newUser) {

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "INSERT INTO librarydb.user(name, surname, pseudo, mail, password, phone) VALUES"
                + " (:name, :surname, :pseudo, :mail, :password, :phone)";

        parameters.addValue("name", newUser.getUserName());
        parameters.addValue("surname", newUser.getUserSurname());
        parameters.addValue("pseudo", newUser.getUserPseudo());
        parameters.addValue("mail", newUser.getUserEmail());
        parameters.addValue("password", newUser.getUserPassword());
        parameters.addValue("phone", newUser.getUserPhone());
        template.update(query, parameters);

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

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "UPDATE librarydb.user SET"
                + " name = :name, surname = :surname, pseudo = :pseudo, mail = :mail, password = :password, phone =:phone"
                + " WHERE user_id = :user_id";

        parameters.addValue("user_id", userToFind.getUserId());
        parameters.addValue("name", userToUpdate.getUserName());
        parameters.addValue("surname", userToUpdate.getUserSurname());
        parameters.addValue("pseudo", userToUpdate.getUserPseudo());
        parameters.addValue("mail", userToUpdate.getUserEmail());
        parameters.addValue("password", userToUpdate.getUserPassword());
        parameters.addValue("phone", userToUpdate.getUserPhone());
        template.update(query, parameters);

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

        Integer userId = userToDelete.getUserId();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource parameters = new MapSqlParameterSource();

        String query = "DELETE FROM librarydb.user WHERE user_id = :user_id";
        parameters.addValue("user_id", userId);
        template.update(query, parameters);

        return;
    }

    /**
     * DAO
     * Get a User List Object
     *
     * @return Users -> List of User Object
     */
    @Override
    public List<User> Users() {

        UserRowMapper userRowMapper = new UserRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.user";

        List<User> users = template.query(query, userRowMapper.getUserRowMapper());

        return users;
    }

    /**
     * DAO
     * Get List User To Send Mail -> Late to give back book
     *
     * @return
     */
    @Override
    public List<User> usersToSendMail() {
        UserRowMapper userRowMapper = new UserRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT librarydb.user.* FROM librarydb.user"
                + " INNER JOIN librarydb.bookloaning ON librarydb.user.user_id = librarydb.bookloaning.user_id_user"
                + " WHERE librarydb.bookloaning.endind_date <= current_date";

        List<User> users = template.query(query, userRowMapper.getUserRowMapper());

        return users;
    }

    /**
     * DAO
     * Get a User Object with Unique Identification Number
     *
     * @param user_id User Unique Identification Number
     * @return A User Object
     */
    @Override
    public User getUser(final Integer user_id) {

        UserRowMapper userRowMapper = new UserRowMapper();
        JdbcTemplate template = new JdbcTemplate(getDataSource());

        String query = "SELECT * FROM librarydb.user WHERE user_id = " + user_id;

        List<User> users = template.query(query, userRowMapper.getUserRowMapper());

        return users.get(0);
    }
}