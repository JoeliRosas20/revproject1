<%@page import="java.util.ArrayList"%>
<%@page import="com.project.model.Reimbursement"%>
<%@page import="java.util.List"%>
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
	<h1>View Pending Reimbursement</h1>
	<h2>Enter your employee Id</h2>
	<form action="EViewPendingResult.jsp">
		Enter your Employee Id:
		<input type="number" min="1" name="employeeId" id="employeeId" placeholder="please enter your Id">
		<input type="submit" value="Search">
	</form>
</body>
</html>