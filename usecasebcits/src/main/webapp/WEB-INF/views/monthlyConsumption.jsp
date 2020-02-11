
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.bcits.usecase.beans.MonthlyConsumption"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
     <%	ConsumerMasterBean  masterBean =(ConsumerMasterBean) session.getAttribute("infoBean");
%> 
<% List< MonthlyConsumption> consumptionBean = (List< MonthlyConsumption>) request.getAttribute("materConsumption");
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
      <th scope="col"><a href="./consumerHomePage"class="list-group-item list-group-item-action"> AccountDetails</a> </th>
      <th scope="col"><a href="./currentBill" class="list-group-item list-group-item-action ">CurrentBill</a></th>
      <th scope="col"><a href="./monthlyConsumption" class="list-group-item list-group-item-action active">Monthly	Consumption</a> </th>
      <th scope="col"> <a href="./billHistoryPage"	class="list-group-item list-group-item-action">Bill History</a> </th>
     <th scope="col"> <a href= "./onlinePayement" class="list-group-item list-group-item-action">Pay Online</a></th>
     <th scope="col"> <a href= "./queryRaised" class="list-group-item list-group-item-action">Comment for Help</a></th>
     <th scope="col"> <a href= "./seeResponse" class="list-group-item list-group-item-action   ">Recieved Response</a></th>
    </tr>
  </thead>
  </table>
  
  
	<marquee style="color: blue;" ><b>MONTHLY CONSUMPTION  DETAILS</b></marquee>
	
		<table class="table table-bordered">
  <thead>
    <tr>
 
      <th scope="col">Date Of Payment</th>
      <th scope="col">Total Units</th>
      <th scope="col">Bill Amount</th>
      
    </tr>
  </thead>
  <tbody>
  
   <% for( MonthlyConsumption consumedList  :  consumptionBean) {%>
    <tr>
      <% SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); %>
      <td><%=  formatter.format (consumedList.getMonthlyConsumptionPk().getDate()) %>&nbsp;&nbsp;&nbsp;</td>
      <td> <%= consumedList.getTotalUnits() %>&nbsp;&nbsp;&nbsp;</td>
       <td> <%= consumedList.getBillAmount()%>&nbsp;&nbsp;&nbsp;</td>
   </tr>
       <%} %>

  </tbody>	
</table>

	<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
</body>
</html>