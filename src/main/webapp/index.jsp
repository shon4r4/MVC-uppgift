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
if (session.getAttribute("thisSession") != null) {
	RequestDispatcher rd = request.getRequestDispatcher("MySessionServlet");
	rd.forward(request, response);
}
%>

<h1>Login Page</h1>

<form action="<%=request.getContextPath()%>/MySessionServlet" method="get">
	User name: <input type="text" name="username">
	<br>
	Password: <input type="password"  name="password">
	<br>
	<input type="submit" value="submit">
</form>



</body>
</html>