package sql.mySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args)
	{
		
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "Reshma@11";
		
		try ( Connection conn = DriverManager.getConnection(dbURL , user , password ))
		{
			String sql = "INSERT INTO Student (ID , Name , Course , Email) VALUES (? , ? , ? , ?)";
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, 101);
			ps.setString(2, "John");
			ps.setString(3, "Computer Science");
			ps.setString(4, "titooram123@gmail.com");
			
			int rowsInserted = ps.executeUpdate();
			
			if (rowsInserted > 0) 
			{
				System.out.println("A new user was inserted successfully!");
			}
		}
		
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}

	}

}