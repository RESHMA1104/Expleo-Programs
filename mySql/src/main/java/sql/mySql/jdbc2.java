package sql.mySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc2{
    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Reshma@11";

        try (Connection conn = DriverManager.getConnection(dbURL, user, password)) {

            String sql = "UPDATE student SET Course = ?, Email = ? WHERE ID = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "Python");
            ps.setString(2, "reshma_new@gmail.com");
            ps.setInt(3, 1);

            ps.executeUpdate();

            System.out.println("Record updated successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}