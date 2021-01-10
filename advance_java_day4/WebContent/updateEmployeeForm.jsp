<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.zensar.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% Employee employee = (Employee)request.getAttribute("employee"); %>
<body>

<p align="right" style="color:blue"><%="You are logged in as " %>
<%=request.getAttribute("cookieValue") %></p>

<a href="loginEmployee?requestAction=logoutEmployee"><h3 align="right">LOGOUT</h3></a>
<h2>Update employee form</h2>

<form action="updateEmployee" method="get">
<input type="hidden" name="requestAction" value="updateEmployee"/>
<table>
	<tr>
		<td> Employee Id: </td>
		<td> <input type="text" name="employeeId" value="<%=employee.getEmployeeId() %>"/> </td>
	</tr>
	<tr>
		<td> Employee Name: </td>
		<td> <input type="text" name="employeeName" value="<%=employee.getEmployeeName() %>"/> </td>
	</tr>
	<tr>
		<td> Employee Designation: </td>
		<td> <input type="text" name="designation" value="<%=employee.getDesignation() %>"/> </td>
	</tr>
	<tr>
		<td> Employee Salary: </td>
		<td> <input type="text" name="salary" value="<%=employee.getSalary() %>"/> </td>
	</tr>
	<tr>
		<td> Employee Gender: </td>
		<td> Male: <input type="radio" name="gender" value="MALE" <%if(employee.getGender().equalsIgnoreCase("MALE")){ %>checked<%} %> />
		<td> Female: <input type ="radio" name="gender" value="FEMALE" <%if(employee.getGender().equalsIgnoreCase("FEMALE")){ %>checked<%} %> />
	</tr>
	
	<tr>
			<td>
				Select city:
				<select name="city" >
  				<option value="Pune" label="Pune" <%if(employee.getCity().equalsIgnoreCase("Pune")){ %>selected<%} %> />
  				<option value="nagpur" label="nagpur" <%if(employee.getCity().equalsIgnoreCase("nagpur")){ %>selected<%} %> />
  				<option value="mumbai" label="mumbai" <%if(employee.getCity().equalsIgnoreCase("mumbai")){ %>selected<%} %> />
  				<option value="bangalore" label="bangalore" <%if(employee.getCity().equalsIgnoreCase("bangalore")){ %>selected<%} %> />
  				<option value="hyderabad" label="hyderabad" <%if(employee.getCity().equalsIgnoreCase("hyderabad")){ %>selected<%} %> />
  				</select>
			</td>
	</tr>
	<tr>
		<td><input type="submit" value="UPDATE EMPLOYEE"/></td>
	</tr>
</table>
</form>
</body>
</html>