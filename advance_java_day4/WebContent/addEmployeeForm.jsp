<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add employee</title>
</head>
<body>
<h2>Add Employee</h2>

<p align="right" style="color:blue"><%="You are logged in as " %>
<%=request.getAttribute("cookieValue") %></p>

<a href="loginEmployee?requestAction=logoutEmployee"><h3 align="right">LOGOUT</h3></a>
<form action="addEmployee" method="post">
<input type="hidden" name="requestAction" value="add"/>
<table>
	<tr>
		<td> Employee Id: </td>
		<td> <input type="text" name="employeeId"/>
	</tr>
	<tr>
		<td> Employee Name: </td>
		<td> <input type="text" name="employeeName"/>
	</tr>
	<tr>
		<td> Employee Designation: </td>
		<td> <input type="text" name="designation"/>
	</tr>
	<tr>
		<td> Employee Salary: </td>
		<td> <input type="text" name="salary"/>
	</tr>
	<tr>
		<td> Employee Gender: </td>
		<td> Male: <input type="radio" name="gender" value="MALE"/>
		<td> Female: <input type ="radio" name="gender" value="FEMALE"/>
	</tr>
	<tr>
			<td>
				Select city:
				<select name="city" >
  				<option value="pune">pune</option>
  				<option value="mumbai">mumbai</option>
  				<option value="hyderabad">hyderabad</option>
  				<option value="bangalore">bangalore</option>
  				<option value="nagpur">nagpur</option>
				</select>
			</td>
	</tr>
	<tr>
		<td><input type="submit" value="ADD EMPLOYEE"/></td>
	</tr>
</table>
</form>
</body>
</html>