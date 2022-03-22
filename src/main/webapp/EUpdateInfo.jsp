<%@page import="com.training.pms.dao.LoginDAOImpl"%>
<%@page import="com.training.pms.dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
Boolean changed;
%>
<h1>Update Info</h1>
</body>
</html>