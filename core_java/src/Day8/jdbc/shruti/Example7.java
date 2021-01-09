package Day8.jdbc.shruti;

import java.sql.*;

import beans.Student;
import utility.DBUtil;

public class Example7 {

	public static void main(String[] args) 
	{
		Student s1 = new Student(34, "Hema", "BCA", 3, 26 );
		
		Example7 example = new Example7();
		example.addStudent(s1);

	}
	
	public void addStudent(Student student)
	{
		System.out.println("Inserting: " +student);
		
		Connection con = DBUtil.getMySqlDbConnection();
		
		String sql = "insert into student values (?, ?, ?, ?, ?)";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, student.getRollNumber());
			pst.setString(2, student.getStudentName());
			pst.setString(3, student.getCourse());
			pst.setInt(4, student.getDuration());
			pst.setInt(5, student.getAge());
			
			int result = pst.executeUpdate();
			
			if(result == 0)
			{
				System.out.println("Insertion Failed");
			}
			else
			{
				System.out.println("Insertion Successful");
				System.out.println(result +"Rows affected");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
		
	}

}
