package Day8.jdbc;

//import utility;

import java.sql.*;

import utility.DBUtil;


public class Example5 {

	public static void main(String[] args) {
		String userName = "zensar";
		String passwords = "pune";
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from Login where userid = ?";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();	//For select queries, we executeQuery() method.
			
			while(rs.next())
			{
				String pass = rs.getString("password");
				if(passwords.equals(pass))
				{
					System.out.println("Got the value");
					System.out.println("Password: "+passwords);
					
				}
				else
				{
					System.out.println("password Not present");
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
			
		}
	}

	
}

