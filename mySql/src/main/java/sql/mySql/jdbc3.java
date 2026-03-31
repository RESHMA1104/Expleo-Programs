package sql.mySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class jdbc3{
    public static void delete(String dname) {

        String dbURL = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Reshma@11";

        try (Connection conn = DriverManager.getConnection(dbURL, user, password)) {

            String sql = "DELETE FROM student WHERE ID = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, 1);

            ps.executeUpdate();

            System.out.println("Record deleted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}