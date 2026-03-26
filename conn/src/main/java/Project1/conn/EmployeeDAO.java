package Project1.conn;

import java.sql.*;

public class EmployeeDAO {

    // INSERT
    public void insertEmploy(Employee emp) {
        try (Connection conn = DBCConnector.getConnection();
             CallableStatement stmt = conn.prepareCall("{call insert_employ(?, ?, ?)}")) {

            stmt.setInt(1, emp.getId());
            stmt.setString(2, emp.getName());
            stmt.setString(3, emp.getDept());

            stmt.execute();
            System.out.println("Inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DISPLAY ALL
    public void displayEmploy() {
        try (Connection conn = DBCConnector.getConnection();
             CallableStatement stmt = conn.prepareCall("{call get_all_employ()}")) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                		rs.getInt("E_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("dept"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteEmploy(int id) {
        try (Connection conn = DBCConnector.getConnection();
             CallableStatement stmt = conn.prepareCall("{call delete_employ(?)}")) {

            stmt.setInt(1, id);
            stmt.execute();

            System.out.println("Deleted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // GET BY ID
    public void getEmployeeById(int id) {
        try (Connection conn = DBCConnector.getConnection();
             CallableStatement cs = conn.prepareCall("{call get_employ_by_id(?, ?, ?)}")) {

            // IN parameter
            cs.setInt(1, id);

            //Register OUT parameters
            cs.registerOutParameter(2, java.sql.Types.VARCHAR);
            cs.registerOutParameter(3, java.sql.Types.VARCHAR);

            //Execute (NOT executeQuery)
            cs.execute();

            //Get values
            String name = cs.getString(2);
            String dept = cs.getString(3);

            if (name != null) {
                System.out.println(id + " | " + name + " | " + dept);
            } else {
                System.out.println("Employee not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // UPDATE
    public void updateDepartment(int id, String dept) {
        try (Connection conn = DBCConnector.getConnection();
             CallableStatement stmt = conn.prepareCall("{call  update_employ_dept(?, ?)}")) {

            stmt.setInt(1, id);
            stmt.setString(2, dept);

            stmt.execute();
            System.out.println("Updated successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}