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
	Following are the employee details <br><br>
		Name: ${name }<br>
		DOB: ${dob }<br>
		Contact: ${contact }<br>
		Role: ${role }<br>
		Salary: ${salary }<br><br>
		
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>