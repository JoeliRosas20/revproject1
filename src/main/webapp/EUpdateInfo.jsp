<%@page import="com.training.pms.dao.LoginDAOImpl"%>
<%@page import="com.training.pms.dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%
String username = (String)session.getAttribute("username");
LoginDAO loginDAO = new LoginDAOImpl();
Boolean changed;
%>
<h1>Update Info</h1>
<form class="form-style" action="EmployeeController" method="get" name="updateInfo">
	<table border="2" cellspacing="10" cellpadding="10">
		<tbody>
			<tr>
				<td><label>Username</label></td>
				<td><input type="text" name="newUsername"></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="text" name="newPassword"></td>
			</tr>
			<tr>
				<td><label>Qualification</label></td>
				<td><input type="text" name="newQuals"></td>
			</tr>
		</tbody>
	</table>
</form>
</body>
</html>