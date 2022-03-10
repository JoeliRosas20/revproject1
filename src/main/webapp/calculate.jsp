<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<%!String choice; %>
<%!String num1; %>
<%!String num2; %>
<%
	choice = request.getParameter("operation");
	num1 = request.getParameter("number1");
	num2 = request.getParameter("number2");
	int one = Integer.parseInt(num1);
	int two = Integer.parseInt(num2);
	int result = 0;
	if(choice.equals("Add")){
		result = one + two;
	}
	else if(choice.equals("Sub")){
		result = one - two;
	}
	else if(choice.equals("Mul")){
		result = one * two;
	}
	else if(choice.equals("Div")){
		result = one / two;
	}
%>
<h1>Result is:</h1>
<h1><%= result %></h1>
</body>
</html>