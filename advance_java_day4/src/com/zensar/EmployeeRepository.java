package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import javax.print.attribute.standard.PrinterIsAcceptingJobs;

import com.zensar.bean.Employee;
import com.zensar.utility.DBUtil;

public class EmployeeRepository 
{
	public void addEmployee(Employee employee)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into employee values (?, ?, ?, ?, ?, ?)";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, employee.getEmployeeId());
			pst.setString(2, employee.getEmployeeName());
			pst.setString(3, employee.getDesignation());
			pst.setInt(4, employee.getSalary());
			pst.setString(5, employee.getGender());
			pst.setString(6, employee.getCity());
			
			int result = pst.executeUpdate();
			if(result == 0)
			{
				System.out.println("Data Inserted failed");
			}
			else
			{
				System.out.println("Data insertion");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> listOfAllEmployees = new ArrayList<Employee>();
		// jdbc code to fetch all employees from db and add them to this list
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from employee";
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				int eid = rs.getInt("employee_id");
				String ename = rs.getString("employee_name");
				String designation = rs.getString("designation");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");
				String city = rs.getString("city");
				
				Employee employee = new Employee(eid, ename, designation, salary, gender, city);
				listOfAllEmployees.add(employee);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		//System.out.println("listOfAllEmployees " +listOfAllEmployees);
		return listOfAllEmployees;
	}
	
	
	public void deleteEmployee(int employeeId)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from employee where employee_id=?";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, employeeId);
			int result = pst.executeUpdate();
			if(result==0)
			{
				System.out.println("Deletion Failed");
			}
			else
			{
				System.out.println("Deletion Successful");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public Employee getEmployee(int employeeId)
	{
		Employee employee = null;
		//JDBC code connecting to db and fetching info
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from employee where employee_id=?";
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, employeeId);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				String employeeName = rs.getString("employee_name");
				String designation = rs.getString("designation");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");
				String city = rs.getString("city");
				
				employee = new Employee(employeeId, employeeName, designation, salary, gender, city);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return employee;
	}
	
	public void updateEmployeeDetails(Employee employee)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update employee set employee_name=?, designation=?, salary=?, gender=?, city=? where employee_id=?";
		
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, employee.getEmployeeName());
			pst.setString(2, employee.getDesignation());
			pst.setInt(3, employee.getSalary());
			pst.setString(4, employee.getGender());
			pst.setString(5, employee.getCity());
			pst.setInt(6, employee.getEmployeeId());
			
			
			
			int result = pst.executeUpdate();
			if(result==0)
			{
				System.out.println("Updation Failed");
			}
			else
			{
				System.out.println("Updation Successful");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public boolean checkLogin(String userName, String password)
	{
		boolean result = false;
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from login where userid=?";
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				String dbPassword = rs.getString("password");
				if(dbPassword.equals(password))
				{
					result = true;
				}
				else
				{
					result = false;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return result;
	}
}
