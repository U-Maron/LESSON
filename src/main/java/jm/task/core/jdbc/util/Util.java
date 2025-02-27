package jm.task.core.jdbc.util;

 import java.sql.DriverManager;
 import java.sql.SQLException;
 import java.sql.Connection;
 import java.sql.Driver;

public class Util {

    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootroot1991";

    public static Connection getConnection() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                System.out.println("Драйвер не зарегистрировался");
            }
        return connection;
    }
    // реализуйте настройку соеденения с БД
    }


