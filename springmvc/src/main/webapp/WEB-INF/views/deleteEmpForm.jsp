<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%  String msg = (String) request.getAttribute("msg");
    String errMsg = (String) request.getAttribute("errMsg");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management Portal</title>
</head>
<body>
	<fieldset>
		<legend>Delete Employee</legend>
		<form action="./delete" >
			Employee ID : <input type="text" name="empId" required>
			&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="submit"
				value="Delete">
		</form>
	</fieldset>
</body>
</html>

<% if (msg != null && !msg.isEmpty()) { %>
<h3 style="color: green"><%=msg %></h3>
<%} %>

<% if (errMsg != null && !errMsg.isEmpty()) { %>
<h3 style="color: red"><%=errMsg %></h3>
<%} %>