<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>






<h1>Welcome</h1>

<%
if (session.getAttribute("thisSession") == null) {
	RequestDispatcher rd = request.getRequestDispatcher("DeleteSessionServlet");
	rd.forward(request, response);
}
else {
	String sessionContent = (String)session.getAttribute("thisSession");
	out.print(sessionContent);
}
%>

	
	
	
	<p><strong>Remove this session:</strong></p>
	<form action="<%=request.getContextPath()%>/DeleteSessionServlet" method="get">
		<input type="submit" value="remove this session" />
	</form>







</body>
</html>