<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("eid")==null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	Welcome ${eid}
	<a href="login.jsp">Videos here</a>
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>