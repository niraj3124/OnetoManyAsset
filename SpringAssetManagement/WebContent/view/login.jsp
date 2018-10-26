<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<style>
table{
	background-color:grey;
	border: 2px solid black;
}
tr{
	color:white;
}
</style>
<body>
<form method="POST">
<img src="images/Asset-Management-System.png" alt="Image not found" width="1300" height="250">
<h1 align="center" color="white">Login Page</h1>
<table align="center" cellpadding="10px" cellspacing="15px">
<tr>
<td>Enter UserName:<br></td><td><input type="text" name="uname"/><br></td>
</tr>
<tr>
<td>Enter Password:<br></td><td><input type="password" name="pwd"/><br></td>
</tr>
<tr colspan="2">
<td></td>
<td><input type="submit" value="login"/></td>
</tr>
</table>
</form>
<footer align= "right">
<p>Copyright © 2018 Asset Management System  Inc. All Rights Reserved.</p>
</footer>
</body>
</html>
