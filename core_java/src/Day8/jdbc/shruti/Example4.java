package Day8.jdbc.shruti;

import java.sql.*;

public class Example4 {
	
	public static void main(String[] args) {
		
		Connection con = getMysqlDbConnection();
		String sql = "insert into student values (20, 'Uma', 'BBA', 3, 23)";
		
		try
		{
			
			PreparedStatement st = con.prepareStatement(sql);
			int result = st.executeUpdate();
			
			if(result == 0)
			{
				System.out.println("Insertion Failed");
				System.out.println(result + " Rows Affected");
			}
			else
			{
				System.out.println("Insertion successful");
				System.out.println(result + " Rows Affected");
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
