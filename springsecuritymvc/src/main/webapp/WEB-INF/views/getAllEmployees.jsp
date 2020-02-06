<%@page import="com.bcits.springsecuritymvc.beans.EmpInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% List<EmpInfoBean> empList = (List<EmpInfoBean> )request.getAttribute("employeeList"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% if(empList != null && !empList.isEmpty()) { %>


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
<% for(EmpInfoBean empInfo : empList) {%>
<tr>

<td><%=empInfo.getEmpId() %></td>
<td><%=empInfo.getName() %></td>
<td><%=empInfo.getPassword()%></td>
<td><%=empInfo.getRole() %></td>

</tr>

<% } %>
</tbody>
</table>
<%} else {%>
<h3 style="color: red;">No Records to Display </h3>

<%} %>

</body>
</html>