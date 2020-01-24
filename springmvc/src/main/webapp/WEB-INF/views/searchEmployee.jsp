<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String empId = (String) request.getParameter("empId");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 style="color: Red ">
		This is to show the details of EmpId
		<%=empId%>
	</h1>

	Name = Shwetha
	<br> Designation = SD
	<br> Mobile = 8901123456

</body>
</html>