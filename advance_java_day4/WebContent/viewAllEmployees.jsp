<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.zensar.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<p align="right" style="color:blue"><%="You are logged in as " %>
<%=request.getAttribute("cookieValue") %></p>


<a href="loginEmployee?requestAction=logoutEmployee"><h3 align="right">LOGOUT</h3></a>

<h2>List of all Employees</h2>
<%List<Employee> listOfAllEmployees = (List<Employee>) request.getAttribute("listOfAllEmployees"); %>
<table border="1">
	
		<th> Employee Id </th>
		<th> Name </th>
		<th> Designation </th>
		<th> Salary </th>
		<th> Gender </th>
		<th> City </th>


		<% for(Employee employee:listOfAllEmployees)
		{ %>
			<tr>
				<td> <%=employee.getEmployeeId() %> </td>
				<td> <%=employee.getEmployeeName() %> </td>
				<td> <%=employee.getDesignation() %> </td>
				<td> <%=employee.getSalary() %> </td>
				<td> <%=employee.getGender() %> </td>
				<td> <%=employee.getCity() %> </td>
				<td> <a href = "deleteEmployees?requestAction=delete&employeeId=<%=employee.getEmployeeId() %>">Delete</a> </td>
				<td> <a href="updateEmployeeForm?requestAction=openUpdateForm&employeeId=<%=employee.getEmployeeId() %>">Update</a> </td>
			</tr>
		<% } 
		%>
</table>
</body>
</html>