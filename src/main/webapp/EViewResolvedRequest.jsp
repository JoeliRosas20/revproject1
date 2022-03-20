<%@page import="java.util.Iterator"%>
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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%
	String username = (String)session.getAttribute("username");
	LoginDAO loginDAO = new LoginDAOImpl();
	int employeeId = loginDAO.getEmployeeId(username);
	List<Reimbursement> pending = loginDAO.getResolvedReimbursment(employeeId);
	Iterator<Reimbursement> iterator = pending.iterator();
%>
<h1>View Resolved Reimbursement</h1>
<table border="2" cellspacing="10" cellpadding="10" class="table table-dark">
		<thead>
			<tr>
				<th>Amount</th>
				<th>Purpose</th>
				<th>Status</th>
			</tr>
		</thead>
<% 
	while(iterator.hasNext()){
		Reimbursement reimbursement = iterator.next();
%>
		<tbody>
			<tr>
				<td><%= reimbursement.getAmount() %></td>
				<td><%= reimbursement.getPurpose() %></td>
				<td><%= reimbursement.getStatus() %></td>
			</tr>
		</tbody>
<% 
	}
%>
	</table>
</body>
</html>