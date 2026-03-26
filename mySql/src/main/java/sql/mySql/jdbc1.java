package sql.mySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc1 {

	public static void main(String[] args)
	{
		
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "Reshma@11";
		
		try ( Connection conn = DriverManager.getConnection(dbURL , user , password ))
		{
			String sql="SELECT*FROM student";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			int count=0;
			while(rs.next()) {
				int id=rs.getInt("ID");
				String name=rs.getString("Name");
				String course=rs.getString("Course");
				String email=rs.getString("email");
				
				
				System.out.println("Table created successfully using prepared statement");
			}
		}
			
			catch (SQLException ex) 
			{
				ex.printStackTrace();
			}
			
		}
	}