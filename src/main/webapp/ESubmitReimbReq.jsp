<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "com.training.pms.dao.LoginDAO" %>
<%@ page import = "com.training.pms.dao.LoginDAOImpl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	LoginDAO loginDAO = new LoginDAOImpl();
	Boolean sumbitted; 
%>
<h1>Submit a Reimbursement Request</h1>
<h2>Please state the reason for this reimbursement</h2>
<h2>Please state the amount you want for this reimbursement</h2>
</body>
</html>