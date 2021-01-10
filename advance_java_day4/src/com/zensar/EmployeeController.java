package com.zensar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

import com.zensar.bean.Employee;

public class EmployeeController extends HttpServlet
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		String requestAction = request.getParameter("requestAction");
		
		  //String n=request.getParameter("userName");  
		   // out.print("Welcome "+n);  
		
		 
		
		if(requestAction.equalsIgnoreCase("viewAll"))
		{
			System.out.println("I am in doGet");
			
			EmployeeRepository employeeRepository = new EmployeeRepository();
			List<Employee> listOfAllEmployees = employeeRepository.getAllEmployees();
			System.out.println("listOfAllEmployees " +listOfAllEmployees);
		
			request.setAttribute("listOfAllEmployees", listOfAllEmployees);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllEmployees.jsp");
			try
			{
				
				Cookie ck[]=request.getCookies();
				System.out.println("cookie value " +ck[0].getValue());
				request.setAttribute("cookieValue", ck[0].getValue());
				response.addCookie(ck[0]);
				
				rd.forward(request, response);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(requestAction.equalsIgnoreCase("delete"))
		{
			//code for deletion
			System.out.println("We are going to delete");
			EmployeeRepository employeeRepository = new EmployeeRepository();
			int employeeId = Integer.parseInt(request.getParameter("employeeId"));
			employeeRepository.deleteEmployee(employeeId);
			
			//RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			try
			{
				//rd.forward(request, response);
				response.sendRedirect("index.jsp");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		else if(requestAction.equalsIgnoreCase("openUpdateForm"))
		{
			int employeeId = Integer.parseInt(request.getParameter("employeeId"));
			//connect to database using repository and fetch the details of emp
			EmployeeRepository employeeRepository = new EmployeeRepository();
			Employee employee = employeeRepository.getEmployee(employeeId);
			
			RequestDispatcher rd = request.getRequestDispatcher("updateEmployeeForm.jsp");
			request.setAttribute("employee", employee);
			
			try
			{
				rd.forward(request, response);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(requestAction.equalsIgnoreCase("updateEmployee"))
		{
			System.out.println("We are going to update");
			
			int employeeId = Integer.parseInt(request.getParameter("employeeId"));
			System.out.println("EmployeeId: " +employeeId);
			
			String employeeName = request.getParameter("employeeName");
			System.out.println("EmployeeName: " +employeeName);
			
			String designation = request.getParameter("designation");
			System.out.println("designation: " +designation);
			
			int salary = Integer.parseInt(request.getParameter("salary"));
			System.out.println("salary: " +salary);
			
			String gender = request.getParameter("gender");
			System.out.println("Gender: " +gender );
			
			String city = request.getParameter("city");
			System.out.println("Gender: " +city );
			
			EmployeeRepository employeeRepository = new EmployeeRepository();
			Employee employee = new Employee(employeeId, employeeName, designation, salary, gender, city);
			employeeRepository.updateEmployeeDetails(employee);
		
			//RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
			String userName = request.getParameter("userName");
			
			try
			{
				//rd.forward(request, response);
				
				response.sendRedirect("index.jsp");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		else if(requestAction.equalsIgnoreCase("add"))
		{
			int employeeId = Integer.parseInt(request.getParameter("employeeId"));
			System.out.println("EmployeeId: " +employeeId);
			
			String employeeName = request.getParameter("employeeName");
			System.out.println("EmployeeName: " +employeeName);
			
			String designation = request.getParameter("designation");
			System.out.println("designation: " +designation);
			
			int salary = Integer.parseInt(request.getParameter("salary"));
			System.out.println("salary: " +salary);
			
			String gender = request.getParameter("gender");
			System.out.println("Gender: " +gender );
			
			String city = request.getParameter("city");
			System.out.println("Gender: " +city );
			
			EmployeeRepository employeeRepository = new EmployeeRepository();
			Employee employee = new Employee(employeeId, employeeName, designation, salary, gender, city);
			employeeRepository.addEmployee(employee);
		
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			
			try
			{
			
				rd.forward(request, response);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		else if(requestAction.equalsIgnoreCase("loginEmployee"))
		{
			//System.out.println("Login ");
		
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			
			Cookie ck=new Cookie("uname",userName);//creating cookie object  
		    response.addCookie(ck);//adding cookie in the response 
		    
			
			
			EmployeeRepository employeeRepository = new EmployeeRepository();
			boolean loginResult = employeeRepository.checkLogin(userName, password);
			if(loginResult)
			{
				
				try
				{  
					response.sendRedirect("index.jsp");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else
			{
				try
				{
					response.sendRedirect("Login.jsp?status=fail");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		else if(requestAction.equalsIgnoreCase("logoutEmployee"))
		{
			try
			{
				response.sendRedirect("Login.jsp?status=yes");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		doGet(request, response);
	}
}
