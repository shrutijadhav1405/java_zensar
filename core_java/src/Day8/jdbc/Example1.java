package Day8.jdbc;

import java.sql.*;

//import com.mysql.jdbc.Connection;

//Demo jdbc connection

public class Example1 
{
	public static void main(String[] args) {
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_db";
		String dbUserName = "root";
		String dbPassword = "shruti1405";
		
		try
		{
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection: " +con);
			
			String sql = "select * from Login";
			
			//Statement or prepared statement
			//Statement
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);	//For select queries, we executeQuery() method
			while(rs.next())
			{
				String userName = rs.getString("userid");
				String password = rs.getString("password");
				System.out.println("userName: "+userName);
				System.out.println("Password: "+password);
				System.out.println("*************************");
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Exception occured "+e);
		}
	}
}
