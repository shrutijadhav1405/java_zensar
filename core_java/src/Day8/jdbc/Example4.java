package Day8.jdbc;
import java.sql.*;

//insert data into Login table using Preparedstatement
public class Example4 
{
	public static void main(String[] args) {
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into Login values (?, ?)";
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, "user");
			pst.setString(2, "456");
			int result = pst.executeUpdate();			//insert/update/delete
			if(result==0)
			{
				System.out.println("Insertion faliled");
			}
			else
			{
				System.out.println("Data inserted successfully");
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
			
		}
		
	}
	
	public static Connection getMySqlDbConnection()
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
			//System.out.println("Connection: " +con);
		}
		catch(Exception e)
		{
			System.out.println("Exception while creating db connection: " +e);
		}
		
		return con;
	}
}
