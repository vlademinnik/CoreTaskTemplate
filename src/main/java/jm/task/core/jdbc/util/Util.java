package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/tablitsa";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    public static Connection getConnection() throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }
    // реализуйте настройку соеденения с БД
}
