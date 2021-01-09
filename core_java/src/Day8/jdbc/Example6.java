package Day8.jdbc;

//import utility;

import java.sql.*;

import utility.DBUtil;


public class Example6 {

	public static void main(String[] args) {
		String userName = "zensars";
		String passwords = "pune";
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from Login where userid = ?";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();	//For select queries, we executeQuery() method.
			
			if(rs.next())
			{
					
						String pass = rs.getString("password");
						if(passwords.equals(pass))
						{
							System.out.println("Got the value");
							System.out.println("Password: "+passwords);
					
						}
						else
						{
							System.out.println("Password Not present");
						}
					
				}
				else 
				{
					System.out.println("Name not valid.........");
				}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
			
		}
	}
}
	


