<%@page import="com.training.pms.dao.LoginDAOImpl"%>
<%@page import="com.training.pms.dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="styles.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Update Info</h1>
<form class="form-style" action="EUpdateInfoResult.jsp" name="updateInfo">
	<table border="2" cellspacing="10" cellpadding="10" >
		<tbody>
			<tr>
				<td><label>Qualification</label></td>
				<td><select name="qualification" id="qualification">
						<option>--select --</option>
						<option>Graduate</option>
						<option>PostGraduate</option>
						<option>Masters</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update" id="submit"></td>
			</tr>
		</tbody>
	</table>
</form>
</body>
</html>