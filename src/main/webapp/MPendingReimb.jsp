<%@page import="java.util.Iterator"%>
<%@page import="com.project.model.Reimbursement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "com.training.pms.dao.LoginDAO" %>
<%@ page import = "com.training.pms.dao.LoginDAOImpl" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%
	LoginDAO loginDAO = new LoginDAOImpl();
	List<Reimbursement> reimb = loginDAO.getPendingReimbursment();
	Iterator<Reimbursement> iterator = reimb.iterator();
%>
<h1>Pending reimbursement</h1>
<table border="2" cellspacing="10" cellpadding="10" class="table table-dark">
	<thead>
		<tr>
			<th>Employee ID</th>
			<th>Amount</th>
			<th>Purpose</th>
			<th>Status</th>
			<th>Request ID</th>
		</tr>
	</thead>
<%
	while(iterator.hasNext()){
		Reimbursement reimbs = iterator.next();
%>
	<tbody>
		<tr>
			<th><%= reimbs.getEmployeeId()%></th>
			<th><%= reimbs.getAmount()%></th>
			<th><%= reimbs.getPurpose()%></th>
			<th><%= reimbs.getStatus()%></th>
			<th><%= reimbs.getRequestId()%></th>
		</tr>
	</tbody>
<%
	}
%>
</table>
</body>
</html>