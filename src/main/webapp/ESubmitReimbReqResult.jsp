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
<h3><a href="Login.html">Home</a></h3>
<%
	String username = (String)session.getAttribute("username");
	String reason = request.getParameter("reason");
	String amount = request.getParameter("amount");
	LoginDAO loginDAO = new LoginDAOImpl();
	int money = Integer.parseInt(amount);
	int employeeId = loginDAO.getEmployeeId(username);
	boolean submitted = loginDAO.submitARequest(reason, money, employeeId);
%>
<h2>Result</h2>
<%
	if(submitted){
%>
	<h3>Congrats</h3>
<%} else{ %>
	<h3>Sorry</h3>
<%} %>
</body>
</html>