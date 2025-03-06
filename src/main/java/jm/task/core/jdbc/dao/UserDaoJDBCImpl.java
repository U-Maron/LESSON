package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    // private static final Connection connection = Util.getConnection();

    public void createUsersTable() {
        /*try {
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users " + "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), lastName VARCHAR(255), age INT)");
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }*/
    }

    public void dropUsersTable() {
        /*try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP TABLE IF EXISTS users");
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }*/
    }

    public void saveUser(String name, String lastName, byte age) {
       /* try {
            connection.setAutoCommit(false);
            PreparedStatement prs = connection.prepareStatement("INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)");
            prs.setString(1, name);
            prs.setString(2, lastName);
            prs.setByte(3, age);
            prs.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }*/
    }

    public void removeUserById(long id) {
       /* try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            String sqlCommand4 = "DELETE FROM Users WHERE id = 4";
            statement.executeUpdate(sqlCommand4);
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } */
    }

    public List<User> getAllUsers() {
        /*List<User> users = new ArrayList<>();
        try {
            connection.setAutoCommit(false);
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                User user = new User();
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastName"));
                user.setAge(resultSet.getByte("age"));
                user.setId(resultSet.getLong("id"));
                users.add(user);
            }
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }*/
        return null;
    }

    public void cleanUsersTable() {
        /*try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            String sqlCommand5 = "TRUNCATE TABLE Users";
            statement.executeUpdate(sqlCommand5);
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    } */
    }
}

