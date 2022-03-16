<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "com.training.pms.dao.LoginDAO" %>
<%@ page import = "com.training.pms.dao.LoginDAOImpl" %>
<%@ page import = "com.project.model.Reimbursement"%>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	LoginDAO loginDAO = new LoginDAOImpl();
%>
<h1>Resolved Reimbursement Requests</h1>
</body>
</html>