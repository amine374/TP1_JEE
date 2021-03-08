<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Login" method="post">
		<table style="with: 50%">
 
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Poids</td>
				<td><input type="text" name="poids" /></td>
			</tr>
			
			<tr>
				<td>Taille</td>
				<td><input type="text" name="taille" /></td>
			</tr>
			
		</table>
		<input type="submit" value="Login" /></form>
</body>
</html>