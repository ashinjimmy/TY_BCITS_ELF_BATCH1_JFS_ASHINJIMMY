<%@page import="com.bcits.empwebapp.beans.PrimaryEmployeeInfo1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<% PrimaryEmployeeInfo1 employeePrimaryInfo =(PrimaryEmployeeInfo1 ) request.getAttribute("info"); %>




<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<legend>Search Employee </legend>

		<form action="./getEmp"></form>

		<label> Employee ID : </label> <input type="text" name="empId" requied>
		&nbsp; &nbsp; &nbsp; &nbsp; <input type="submit" value="search">

		</form>

	</fieldset>

	<% if(employeePrimaryInfo != null) { %>

	Name =
	<%=employeePrimaryInfo.getEmpName() %><br> 
	Salary =<%= employeePrimaryInfo.getSalary() %><br> 
	Designation =<%= employeePrimaryInfo.getDesignation() %><br>

	<%} else { %>
	<h2 style="color: red";>Employeee ID Not Found!</h2>
	<% } %>
</body>
</html>