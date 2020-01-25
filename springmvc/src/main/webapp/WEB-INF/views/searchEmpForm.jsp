<%@page import="com.bcits.springmvc.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<% EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) request.getAttribute("employeeInfoBean");
     String errMsg = (String) request.getAttribute("errMsg");    
    %>

<jsp:include page="header.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<legend>Search</legend>
		<form action="./search" method="get">
			Employee ID : <input type="text" name="empId" required>
			&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="submit"
				value="search">
		</form>
	</fieldset>

	<% if(errMsg != null && !errMsg.isEmpty())  {%>
	<h3 style="color: red;"><%=errMsg%></h3>
	<%}%>

	<%if(employeeInfoBean != null) {%>
	<div align="center">
		<table border="1" style="width: 70%">
			<tr style="bbackground: navy;" color :white;">
				<th>Employee ID</th>
				<th>Name</th>
				<th>Designation</th>
				<th>Salary</th>
				<th>DOB</th>
				<th>DOJ</th>

			</tr>

			<tr>

				<td><%=employeeInfoBean.getEmpId()%></td>
				<td><%=employeeInfoBean.getEmpName() %></td>
				<td><%=employeeInfoBean.getDesignation() %> </td> 
     <td><%=employeeInfoBean.getSalary()%></td> 
      <td><%=employeeInfoBean.getDob()%></td> 
       <td><%=employeeInfoBean.getDoj()%></td> 
     <%} %>   
  </tr>
  </table>
  </div>
</body>
</html>
<jsp:include page="footer.jsp"/>