<%@page import="java.util.Iterator"%>
<%@page import="com.project.model.Reimbursement"%>
<%@page import="java.util.List"%>
<%@page import="com.training.pms.dao.LoginDAOImpl"%>
<%@page import="com.training.pms.dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<% String username = (String)session.getAttribute("username"); 
   String searchname = request.getParameter("searchname");%>
<h2>You are logged in as : <%= username %> and the message is : <%= session.getAttribute("message") %></h2>
<body>
<%
	LoginDAO loginDAO = new LoginDAOImpl();
	int searchId = loginDAO.getEmployeeId(searchname);
	List<Reimbursement> users = loginDAO.getReimbursementByUserName(searchId);
	Iterator<Reimbursement> iterator = users.iterator();
%>
<h1>List of all the users</h1>
<table border="2" cellspacing="10" cellpadding="10" class="table table-dark">
	<th>Employee Id</th>
	<th>Amount</th>
	<th>Purpose</th>
	<th>Status</th>
	<th>Request Id</th>
<% 
	while(iterator.hasNext()){
		Reimbursement user = iterator.next();
%>
	<tr>
		<td><%= user.getEmployeeId() %></td>
		<td><%= user.getAmount() %></td>
		<td><%= user.getPurpose() %></td>
		<td><%= user.getStatus() %></td>
		<td><%= user.getRequestId() %></td>
	</tr>
<% 
	}
%>
</table>
</body>
</html>