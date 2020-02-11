<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@page import="com.bcits.usecase.beans.EmployeeMasterBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.bcits.usecase.beans.MonthlyConsumption"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<%-- <%
	EmployeeMasterBean emMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
%> --%>
<% List< MonthlyConsumption> billListBean = (List< MonthlyConsumption>) request.getAttribute("billDetails");
%>
 <% String errMsg = (String) request.getAttribute("errMsg"); %>
 <% String msg = (String) request.getAttribute("msg"); %>
 
 
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Current Bill Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">

</head>

<body>
<jsp:include page="header.jsp"></jsp:include>




<table class="table">
  <thead class="bg-primary">
    <tr>
      <th scope="col"><a href="./employeeHomePage"class="list-group-item list-group-item-action"> Regional Officer Details</a> </th>
      <th scope="col"><a href="./consumerDetails"class="list-group-item list-group-item-action    "> Consumer Details</a> </th>
      <th scope="col"><a href="./displayGenerateBill" class="list-group-item list-group-item-action">Generate Bill </a></th>
      <th scope="col"><a href="./showAllCurrentBills" class="list-group-item list-group-item-action active">Show Bill Details</a> </th>
       <th scope="col"><a href="./seeQueryInfo" class="list-group-item list-group-item-action">Recieved Queries </a> </th>
      
    </tr>
  </thead>
  </table>
  
  
		<marquee style="color: navy;">
		<b> CONSUMER DETAILS</b>
	</marquee>

	<table class="table table-bordered">
		<thead>
			<tr>
			   
			   		<th scope="col">RR Number</th>
				<th scope="col">Region</th>
				<th scope="col">Current Reading</th>
				<th scope="col">Previous Reading</th>
				<th scope="col">Total Units Consumed</th>
				<th scope="col">Bill Amount</th>
				<th scope="col">Status of Payment</th>

			</tr>
		</thead>
		<%  if(billListBean != null) {%>
		<tbody>
		
					<% for( MonthlyConsumption billList  :   billListBean ) {%>
					<form action action="./showAllCurrentBills" method="get">
					<input  type="text" name="rrNumber" value="<%=billList.getMonthlyConsumptionPk().getRrNumber() %>" hidden="true" />
			<tr>
		        <td><%= billList.getMonthlyConsumptionPk().getRrNumber()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= billList.getRegion()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= billList.getCurrentReading()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= billList.getPrevReading()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= billList.getTotalUnits()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= billList.getBillAmount()%>&nbsp;&nbsp;&nbsp;</td>
				<td><%= billList.getStatus()%>&nbsp;&nbsp;&nbsp;</td>
             </tr>
             </form>
				<%} %>
				</tbody>
							<%} %>
				</table>


<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: red;"><%=errMsg%>
	</h2>
	<%}%>
	
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: red;"><%=msg%>
	</h2>
	<%}%>

	<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
</body>
</html>