package sql.mySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Reshma@11";

        try (Connection conn = DriverManager.getConnection(dbURL, user, password)) {

            String sql = "CREATE TABLE IF NOT EXISTS Student (" +
                         "ID INT NOT NULL, " +
                         "Name VARCHAR(255), " +
                         "Course VARCHAR(255), " +
                         "Email VARCHAR(255), " +
                         "PRIMARY KEY (ID))";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();

            System.out.println("Table created successfully using prepared statement");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}