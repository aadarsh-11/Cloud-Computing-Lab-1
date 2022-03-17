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
		
		<h1>Get Employee Data</h1>
		<form action="Employee">
			Enter Employee Id: <input type = "text" name = "eid"><br>
			<input type="submit" value="Get Data">
		</form>
		
		<h1> Update Data </h1>
		<form action="Insert" method = "post">
			Employee Id: <input type = "text" name = "eid"><br>
			Role: <input type = "text" name = "role"><br>
			Monthly Salary: <input type = "text" name = "salary"><br>
			Bonus: <input type = "text" name = "bonus"><br>
			<input type="submit" value="Update"><br>
		</form>
		
	<form action="Logout">
		<br>
		<input type="submit" value="Logout">
	</form>
</body>
</html>