<%@page import="com.bcits.springmvc.beans.EmployeeInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	List<EmployeeInfoBean> emploList = (List<EmployeeInfoBean>) request.getAttribute("employeeList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<br>
	<br>

	<%
		if (emploList != null) {
	%>
	<div align="center">
		<table border="1" ; style="width: 100%">
			<thead style="background: olive; color: white; width: 70%">
				<tr style="height: 50px">
					<th>Employee ID</th>
					<th>Employee Name</th>
					<th>Date Of Birth</th>
					<th>Date Of Join</th>
					<th>Designation</th>
					<th>Salary</th>
					<th>Mobile Number</th>
				</tr>
			</thead>
			<tb>
			<%for(EmployeeInfoBean emBean : emploList) { %>
			<tr  style="height: 40px">
	<td> <%= emBean.getEmpId() %> </td>
	<td> <%= emBean.getEmpName() %> </td>
	<td> <%= emBean.getDob() %> </td>
	<td> <%= emBean.getDoj() %> </td>
	<td> <%= emBean.getDesignation() %> </td>
	<td> <%= emBean.getSalary() %> </td>
	<td> <%= emBean.getEmpMobileno()%> </td>
	</tr>
	<% } %>	
			</tb>
		</table>
	</div>
	
 <% } else { %>
 <h2 style="color: Red; text-align: center;"> No Record Found To Display!!!</h2> 
<%} %>

</body>
</html>

<jsp:include page="footer.jsp"></jsp:include>