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
<input type="text" size="31" name="reason" id="reason" placeholder="please enter reason">
<h2>Please state the amount you want for this reimbursement</h2>
<input type="number" size="31" name="amount" id="amount" placeholder="please enter amount">
</body>
</html>