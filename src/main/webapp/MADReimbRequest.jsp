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
List<Reimbursement> reimb = loginDAO.getPendingReimbursment();
Iterator<Reimbursement> iterator = reimb.iterator();
%>
	<table border="2" cellspacing="10" cellpadding="10" class="table table-dark">
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>Amount</th>
				<th>Purpose</th>
				<th>Status</th>
				<th>Request Id</th>
			</tr>
		</thead>
<% 
	while(iterator.hasNext()){
		Reimbursement reimbursement = iterator.next();
%>
		<tbody>
			<tr>
				<td><%= reimbursement.getEmployeeId() %></td>
				<td><%= reimbursement.getAmount() %></td>
				<td><%= reimbursement.getPurpose() %></td>
				<td><%= reimbursement.getStatus() %></td>
				<td><%= reimbursement.getRequestId() %></td>
			</tr>
		</tbody>
<% 
	}
%>
	</table>
	<h2>Select a request to accept or deny</h2>
	<form class="form-style"
	action="MADReimbRequestResult.jsp"
	name="requestChoiceForm">
		<input type="number" name="requestId" id="requestId">
	<input type="submit" name="Accept" value="Accept"><input type="submit" name="Deny" value="Deny">
	</form>
	
</body>
</html>