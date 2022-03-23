<%@page import="java.util.Iterator"%>
<%@page import="com.project.model.Reimbursement"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "com.training.pms.dao.LoginDAO" %>
<%@ page import = "com.training.pms.dao.LoginDAOImpl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="styles.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Approve/Deny Reimbursement Request</h1>
<h3><a href="Login.html">Home</a></h3>
<%
	LoginDAO loginDAO = new LoginDAOImpl();
	String req = request.getParameter("requestId");
	int requestId = Integer.parseInt(req);
	if(request.getParameter("Accept") != null){
		loginDAO.acceptRequest(requestId);
%>	
	<h3>Accepted</h3>
<% 
	}
	else if(request.getParameter("Deny") != null){
		loginDAO.denyRequest(requestId);
%>
	<h3>Denied</h3>
<%	
	}
%>	

</body>
</html>