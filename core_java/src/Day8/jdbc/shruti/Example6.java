package Day8.jdbc.shruti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utility.DBUtil;

public class Example6 
{
	public static void main(String[] args) {
		
		String sname = "James";
		int sroll = 14;
		
		Connection con = DBUtil.getMySqlDbConnection();
		
		String sql = "select * from student where roll_number = ?";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, sroll);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				String name = rs.getString("student_name");
				
				if(name.equals(sname))
				{
					System.out.println("Got the student name:");
					System.out.println(name);
				}
				else
				{
					System.out.println("Student name not found");
				}
			}
			else
			{
				System.out.println("Roll no dont exist");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured: "+e);
		}
		
	}
}
