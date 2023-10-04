<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">MOM'S CAFE</h1>
	<hr>
	${welcomeMessage}
	<form action="processorder">
	<div align="center">
	<label>Item Name: </label>
	<input type="text" name="foodItem">
	<input type="submit">
	</div>
	</form>
</body>
</html>