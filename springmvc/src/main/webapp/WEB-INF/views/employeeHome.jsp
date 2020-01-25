<%@page import="com.bcits.springmvc.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("loggedInEmpInfo"); %>>
    <jsp:include page="header.jsp"/>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empoyee Management Portal</title>
</head>
<body>
<h1 style ="color:purple;">Welcome <%=employeeInfoBean.getEmpName()%></h1>
</body>
</html>
<br><br>
<jsp:include page="footer.jsp"/>