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
	<h1>Submit a Reimbursement Request</h1>
	<form class="form-style"
	action="ESubmitReimbReqResult.jsp"
	method="get"
	name="requestForm">
		<h2>Please state the reason for this reimbursement</h2>
		<input type="text" size="31" name="reason" id="reason"
			placeholder="please enter reason">
		<h2>Please state the amount you want for this reimbursement</h2>
		<input type="number" min="1" size="31" name="amount" id="amount"
			placeholder="please enter amount">
		<input type="submit" value="Submit" id="submit">
	</form>
</body>
</html>