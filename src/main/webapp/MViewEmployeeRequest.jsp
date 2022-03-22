<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.training.pms.dao.LoginDAO"%>
<%@ page import="com.training.pms.dao.LoginDAOImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>View an Employee Request</h1>
	<form action="SearchUserResults.jsp">
		Enter Username to search : <input type="text" name="searchname">
		<input type="submit" value="Search">
	</form>
</body>
</html>