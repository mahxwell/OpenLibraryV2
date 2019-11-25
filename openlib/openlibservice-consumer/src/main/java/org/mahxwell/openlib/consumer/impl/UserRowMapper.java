package org.mahxwell.openlib.consumer.impl;

import org.mahxwell.openlib.model.bean.openlib.User;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper {
    public RowMapper<User> getUserRowMapper() {
        return getUserRowMapper;
    }

    private RowMapper<User> getUserRowMapper = new RowMapper<User>() {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setUserId(resultSet.getInt("user_id"));
            user.setUserName(resultSet.getString("name"));
            user.setUserSurname(resultSet.getString("surname"));
            user.setUserPseudo(resultSet.getString("pseudo"));
            user.setUserEmail(resultSet.getString("mail"));
            user.setUserPassword(resultSet.getString("password"));
            user.setUserPhone(resultSet.getString("phone"));
            return user;
        }
    };
}
