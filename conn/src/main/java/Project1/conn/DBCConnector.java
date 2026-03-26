package Project1.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCConnector {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/university";
        String user = "root";
        String password = "Reshma@11";

        return DriverManager.getConnection(url, user, password);
    }
}