<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Software/LoginServlet"  method= "post">
<h2>SIGN-IN</h2>
<label>Username</label>
<br>
<input type= "text" name="username" required>
<br><br>
<label>Password</label>
<br>
<input type= "password" name="pswd"  required>
<br><br>
<input type= "submit" name="btn" value="SIGN-IN">
</form>
</body>
</html>