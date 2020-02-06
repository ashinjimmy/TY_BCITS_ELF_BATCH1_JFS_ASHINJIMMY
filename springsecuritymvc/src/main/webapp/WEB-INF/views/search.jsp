<%@page import="com.bcits.springsecuritymvc.beans.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <% EmpInfoBean emBean  =(EmpInfoBean)  request.getAttribute("empInfo") ;%> 
   <jsp:include page="header.jsp"/>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<fieldset style="width: 60%">
<legend>Search employee</legend>
<form action="./getEmployee">
Employee ID  : <input type="text" name="empId" required="required">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="search">

</form>
</fieldset>
</div>

<% if (emBean != null) { %>
<table>
<thead>
<tr style="background: navy; color: white;">
<th>Employee ID </th>
<th> Employee Name </th>
<th> Password </th>
<th>Role </th>

</tr>
</thead>

<tbody>
<tr>

<td><%=emBean.getEmpId() %></td>
<td><%=emBean.getName() %></td>
<td><%=emBean.getPassword() %></td>
<td><%=emBean.getRole() %></td>
</tr>
</tbody>

</table>
<%} %>
</body>
</html>