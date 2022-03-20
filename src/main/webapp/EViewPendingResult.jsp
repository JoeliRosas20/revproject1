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
<%
	String username = (String)session.getAttribute("username");
	LoginDAO loginDAO = new LoginDAOImpl();
	List<Reimbursement> pending = new ArrayList<Reimbursement>();
	
%>
<h1>Here is the table</h1>
</body>
</html>