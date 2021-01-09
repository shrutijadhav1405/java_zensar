package Day8.jdbc.shruti;

import java.sql.*;

public class Example3 {
	
	public static void main(String[] args) {
		
		Connection con = getMysqlDbConnection();
		String sql = "insert into student values (22, 'Riya', 'BE', 4, 19)";
		
		try
		{
			
			Statement st = con.createStatement();
			int result = st.executeUpdate(sql);
			
			if(result == 0)
			{
				System.out.println("Insertion Failed");
			}
			else
			{
				System.out.println("Insertion successful");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred: " +e);
		}
	}
	
	public static Connection getMysqlDbConnection() 
	{
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_db";
		String dbUserName = "root";
		String dbPassword = "shruti1405";
		Connection con = null;
		
		try
		{
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection successful");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred: " +e);
		}
		
		return con;
	}
}
