<%@page import="com.project.model.User"%>
<%@page import="com.training.pms.dao.LoginDAOImpl"%>
<%@page import="com.training.pms.dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="styles.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%
String username = (String)session.getAttribute("username");
LoginDAO loginDAO = new LoginDAOImpl();
User user = new User();
user = loginDAO.getInfo(username);
%>
<h1>View Info</h1>
<h3><a href="Login.html">Home</a></h3>
<table border="2" cellspacing="10" cellpadding="10" class="table table-dark">
	<thead>
		<tr>
			<th>Employee ID</th>
			<th>Username</th>
			<th>Password</th>
			<th>Gender</th>
			<th>Status</th>
			<th>Qualification</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%=user.getUserId() %></td>
			<td><%=user.getUsername() %></td>
			<td><%=user.getPassword() %></td>
			<td><%=user.getGender() %></td>
			<td><%=user.getStatus() %></td>
			<td><%=user.getQualification() %></td>
		</tr>
	</tbody>
</table>
</body>
</html>