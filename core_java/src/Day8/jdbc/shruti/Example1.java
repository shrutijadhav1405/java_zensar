package Day8.jdbc.shruti;
import java.sql.*;

public class Example1 
{
	public static void main(String[] args) 
	{
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_db";
		String dbUserName = "root";
		String dbPassword = "shruti1405";
		
		try
		{
			Class.forName(driverClassName);
			
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection Successful: " +con);
			
			String sql = "select * from student";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				int rollNumber = rs.getInt("roll_number");
				String studentName = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				
				System.out.println("Roll NUmber: " +rollNumber);
				System.out.println("Student Name: " +studentName);
				System.out.println("Course: " +course);
				System.out.println("Duration: " +duration);
				System.out.println("Age: " +age);
				System.out.println("**********************\n");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
	}
}
