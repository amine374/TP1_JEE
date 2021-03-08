<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style = "width = 50%">
	<tr><td>
	<%  String username = request.getParameter("username");
		String poids = request.getParameter("poids");
		String sexe = request.getParameter("gender");
		String taille = request.getParameter("taille");
		double tailleConv = Double.parseDouble(taille);
		double poidsConv = Double.parseDouble(poids);
		String message  = "";
		double result;
		result = poidsConv/(tailleConv*tailleConv);
		
		if(result < 18.5)
			message = "Poids insuffisant, accru";
		else if(result < 24.9 && result >= 18.5)
			message = "Poids normale, moindre";
		else if(result < 29.9 && result >= 25)
			message = "Surpoids ou obésité, accru";
		else if(result < 34.9 && result >= 30)
			message = "Obésité, classe I (modérée) ";
		else if(result < 39.9 && result >= 35)
			message = "Obésité, classe II (sévère), élevé";
		else if(result >= 40)
			message = "Obésité, classe II (massive), très élevé.";
			
	%>
	<a>Welcome   <% out.println(username); %> User!!!! You have logged in.</a></td></tr>
	<a>Message:::   <% out.println(message); %></a></td></tr>
<tr></tr><tr><td></td><td></td><td><a href="Register_3.jsp"><b>Logout</b></a></td></tr>
	</table>
</body>
</html>