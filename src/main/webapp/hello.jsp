<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Guest</h1>
	<form action="demo.jsp">
	Username : <input type="text" name="gname">
	<input type="submit" value="Go">
	</form>
	
	<h1>Calculator</h1>
	<form action="calculate.jsp">
		Number 1 : <input type="text" name="number1"><br/>
		Number 2 : <input type="text" name="number2"><br/>
		Operation : <select name="operation" id="operation">
			<option>--select --</option>
			<option>Add</option>
			<option>Sub</option>
			<option>Mul</option>
			<option>Div</option></select>
<input type="submit" value="Go">
</form>

</body>
</html>