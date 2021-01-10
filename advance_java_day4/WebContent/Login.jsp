<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Login Page</h1>

<%
		if (request.getParameter("status")!=null)
		{	
			if(request.getParameter("status").equals("fail"))
			{
	%>
	
	<p style="color:red"><%="Invalid username or password!!" %></p>
	<%
			}
		}
	%>
</h2>



<form action="loginEmployee" method="post">
<input type="hidden" name="requestAction" value="loginEmployee"/>
<table>
	<tr>
		<td>Enter Username: </td>
		<td><input type="text" name="userName" /></td>
	</tr>
	<tr>
		<td>Enter Password: </td>
		<td><input type="password" name="password" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="LOGIN" /></td>
	</tr>
</table>
</form>


<%
		if (request.getParameter("status")!=null)
		{	
			if(request.getParameter("status").equals("yes"))
			{
	%>
	
	<p style="color:blue" align="center"><%="You are logged out successfully!!" %></p>
	<%
			}
		}
	%>


</body>
</html>