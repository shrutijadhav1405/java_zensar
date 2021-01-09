package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Student;
import utility.DBUtil;

public class StudentDao 
{
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
	
	public void getAllStudent() 
	{
		String sql = "select * from student";
		Connection con = DBUtil.getMySqlDbConnection();
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				int sroll = rs.getInt("roll_number");
				String sname = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				
				System.out.println("Roll no: " +sroll);
				System.out.println("Student name: " +sname);
				System.out.println("Course: " +course);
				System.out.println("Duration: " +duration);
				System.out.println("Age: " +age);
				System.out.println("********************************");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
	}
	
	public void getStudent(int roll)
	{
		String sql = "select * from student where roll_number = ?";
		Connection con = DBUtil.getMySqlDbConnection();
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, roll);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next())
			{

				int sroll = rs.getInt("roll_number");
				String sname = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				
				System.out.println("Roll no: " +sroll);
				System.out.println("Student name: " +sname);
				System.out.println("Course: " +course);
				System.out.println("Duration: " +duration);
				System.out.println("Age: " +age);
				System.out.println("********************************");
			}
			else
			{
				System.out.println("Student does not exist");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}

	}
	
	public void getStudent(String name)
	{
		String sql = "select * from student where student_name = ?";
		Connection con = DBUtil.getMySqlDbConnection();
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next())
			{

				int sroll = rs.getInt("roll_number");
				String sname = rs.getString("student_name");
				String course = rs.getString("course");
				int duration = rs.getInt("duration");
				int age = rs.getInt("age");
				
				System.out.println("Roll no: " +sroll);
				System.out.println("Student name: " +sname);
				System.out.println("Course: " +course);
				System.out.println("Duration: " +duration);
				System.out.println("Age: " +age);
				System.out.println("********************************");
			}
			else
			{
				System.out.println("Student does not exist");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}

	}

	public void deleteStudent(int roll)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from student where roll_number = ?";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, roll);
			
			int result = pst.executeUpdate();
			
			if(result == 0)
			{
				System.out.println("Student does not exist");
			}
			else
			{
				System.out.println("Student record deleted successfully ");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
	}
	
	public void updateStudent(Student stud)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update student set student_name=?, course=?, duration=?, age=? where roll_number=?";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, stud.getStudentName());
			pst.setString(2, stud.getCourse());
			pst.setInt(3, stud.getDuration());
			pst.setInt(4, stud.getAge());
			pst.setInt(5, stud.getRollNumber());
			
			int result = pst.executeUpdate();
			
			if(result == 0)
			{
				System.out.println("Student record does not exist");
			}
			else
			{
				System.out.println("Student record updated");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
		
	}
}