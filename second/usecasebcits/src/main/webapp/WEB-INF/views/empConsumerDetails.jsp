 <%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@page import="java.util.List"%>
<%@page import="com.bcits.usecase.beans.EmployeeMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%
	EmployeeMasterBean emMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
%>

<% List<ConsumerMasterBean> consumerList= (List<ConsumerMasterBean>) request.getAttribute("consumerInfo");
%>

 <% String errMsg = (String) request.getAttribute("errMsg"); %>
 <% String msg = (String) request.getAttribute("msg"); %>
 

<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Employee Details Page</title>
<link rel="stylesheet" href="${css}/consumerHome.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">
</head>
<body>
	<jsp:include page="empHeader.jsp"></jsp:include>
	
	<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: red;"><%=errMsg%>
	</h2>
	<%}%>
	
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: red;"><%=msg%>
	</h2>
	<%}%>

	<table class="table">
		<thead class="bg-primary">
			<tr>
      <th scope="col"><a href="./employeeHomePage"class="list-group-item list-group-item-action"> Regional Officer Details</a> </th>
      <th scope="col"><a href="./consumerDetails"class="list-group-item list-group-item-action  active  "> Consumer Details</a> </th>
      <th scope="col"><a href="./displayGenerateBill" class="list-group-item list-group-item-action">Generate Bill </a></th>
      <th scope="col"><a href="./showAllCurrentBills" class="list-group-item list-group-item-action">Show Bill Details</a> </th>
      <th scope="col"><a href="./seeQueryInfo" class="list-group-item list-group-item-action">Recieved Queries </a> </th>
     
		<!-- 		<th scope="col"><a href=" #"class="list-group-item list-group-item-action">Bill History</a></th>
				<th scope="col"><a href="#"class="list-group-item list-group-item-action">Month on Month Revenue</a></th> -->
			</tr>
		</thead>
	</table>
	<marquee style="color: navy;">
		<b> CONSUMER DETAILS</b>
	</marquee>

	<table class="table table-bordered">
		<thead>
			<tr>

				<th scope="col">Name</th>
				<th scope="col">Email Id</th>
				<th scope="col">Mobile Number</th>
				<th scope="col">RR Number</th>
				<th scope="col">Type Of Consumer</th>
				<th scope="col">House Number</th>
				<th scope="col">Area</th>
				<th scope="col">Region</th>
				<th scope="col">Pin Code</th>

			</tr>
		</thead>
		<tbody>
		
					<% for( ConsumerMasterBean consumedList  :  consumerList) {%>
			<tr>
				<td><%= consumedList.getFirstName() + " " + consumedList.getLastName()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= consumedList.getEmailId()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= consumedList.getPhoneNumber()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= consumedList.getRrNumber()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= consumedList.getTypeOfConsumer()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= consumedList.getHouseNumber()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= consumedList.getArea()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= consumedList.getRegion()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= consumedList.getPinCode()%>&nbsp;&nbsp;&nbsp;</td>
             </tr>
				<%} %>
			
		</tbody>
	</table>

</body>
</html>