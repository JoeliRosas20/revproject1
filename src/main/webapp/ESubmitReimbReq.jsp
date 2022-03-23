<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.training.pms.dao.LoginDAO"%>
<%@ page import="com.training.pms.dao.LoginDAOImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="styles.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<h1>Submit a Reimbursement Request</h1>
	<form class="form-style"
	action="ESubmitReimbReqResult.jsp"
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