<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.bcits.usecase.beans.BillHistoryBean"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
         
          <% List<Object[]> revenueDetails = (List<Object[]>) request.getAttribute("paidBillDetails");%>
           <% String errMsg = (String) request.getAttribute("errMsg"); %>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Revenue Page</title>
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
        <th scope="col"><a href="./employeeHomePage"class="list-group-item list-group-item-action  "> Regional Officer Details</a> </th>
      <th scope="col"><a href="./consumerDetails"class="list-group-item list-group-item-action  "> Consumer Details</a> </th>
      <th scope="col"><a href="./displayGenerateBill" class="list-group-item list-group-item-action">Generate Bill </a></th>
      <th scope="col"><a href="./showAllCurrentBills" class="list-group-item list-group-item-action">Show Bill Details</a> </th>
      	<th scope="col"><a href="./seeQueryInfo" class="list-group-item list-group-item-action">Recieved Queries </a> </th>
      	<th scope="col"><a href="./revenueBillDetails" class="list-group-item list-group-item-action " >Revenue Details</a> </th>
      	<th scope="col"><a href="./monthlyRevenue" class="list-group-item list-group-item-action active" >Monthly Revenue</a> </th>
        <th scope="col"><a href="./customBillPay" class="list-group-item list-group-item-action  " >Offline Payment</a> </th>
    </tr>
  </thead>
  </table>
  
  
  <marquee style="color: blue;" ><b>MONTHLY REVENUE  DETAILS</b></marquee>
	
		<table class="table table-bordered">
  <thead>
    <tr>
 
      <th scope="col">Date </th>
      <th scope="col">Revenue</th>
  
    </tr>
  </thead>
  <tbody>
  
      <% for( int i = 0; i < revenueDetails.size(); i++) {
    	 Object[] collectedDetails = revenueDetails.get(i);
      %>
          <td> <%=collectedDetails[1] %>&nbsp;&nbsp;&nbsp;</td>
      <td> <%=collectedDetails[0]%>&nbsp;&nbsp;&nbsp;</td>
   
       <%} %>
      </tr>
  </tbody>	
</table>

<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: red;"><%=errMsg%>
	</h2>
	<%}%>

	<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
</body>
</html>

