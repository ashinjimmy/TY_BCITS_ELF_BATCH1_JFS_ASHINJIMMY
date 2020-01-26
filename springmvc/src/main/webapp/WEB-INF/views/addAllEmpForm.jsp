<%@page import="org.springframework.ui.ModelMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String errMsg = (String) request.getAttribute("errMsg");
    String msg = (String) request.getAttribute("msg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<br><br>

<% if (errMsg != null && !errMsg.isEmpty()) { %>
<h3 style="color: red"><%=errMsg %></h3>
<%} %>

<% if (msg != null && !msg.isEmpty()) { %>
<h3 style="color: red"><%=msg %></h3>
<%} %>


<fieldset style="width: 500px">
		<legend>Add Employee Record</legend>
		<form action="./addEmp" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td><input type="number" name="empId" required></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="empName" required></td>
				</tr>

				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation" required></td>
				</tr>

				<tr>
					<td>Date Of Joining</td>
					<td><input type="date" name="doj" required></td>
				</tr>
				
				<tr>
					<td>Date Of Birth</td>
					<td><input type="date" name="dob" required></td>
				</tr>

				<tr>
					<td>Blood Group</td>
					<td><input type="text" name="bloodGrp" required></td>
				</tr>
				
				<tr>
					<td>Manager ID</td>
					<td><input type="number" name="managerId" required></td>
				</tr>
				
				
				<tr>
					<td>Department Id</td>
					<td><input type="number" name="deptId" required></td>
				</tr>
				
				<tr>
					<td>Salary</td>
					<td><input type="text" name="salary" required></td>
				</tr>
				
				<tr>
					<td>Mobile Number</td>
					<td><input type="tel" name="empMobileNo" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td><input type="submit" value="Add"
						style="margin-left: 98px; width: 100px"></td>
				</tr>
			</table>
		</form>
	</fieldset>
<br> <br>
</body>
</html>

<jsp:include page="footer.jsp"></jsp:include>