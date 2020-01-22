<%@page import="com.bcits.empwebapp.beans.PrimaryEmployeeInfo1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%PrimaryEmployeeInfo1 empInfo = (PrimaryEmployeeInfo1) session.getAttribute("loggedInEmpInfo"); %>
    <jsp:include page="header.jsp"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome  <%=empInfo.getEmpName() %>....</h1>
</body>
</html>