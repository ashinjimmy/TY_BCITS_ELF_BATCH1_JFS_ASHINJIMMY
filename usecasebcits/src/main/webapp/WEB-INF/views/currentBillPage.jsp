<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@page import="com.bcits.usecase.beans.CurrentBillBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%	ConsumerMasterBean masterBean = (ConsumerMasterBean) session.getAttribute("infoBean");
%> 
<% CurrentBillBean billBean = (CurrentBillBean) request.getAttribute("masterBill");
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

<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: red;"><%=errMsg%>
	</h2>
	<%}%>
	
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: red;"><%=msg%>
	</h2>
	<%}%>

<jsp:include page="header.jsp"></jsp:include>
<table class="table">
  <thead class="bg-primary">
    <tr>
      <th scope="col"><a href="./consumerHomePage"class="list-group-item list-group-item-action"> AccountDetails</a> </th>
      <th scope="col"><a href="./currentBill" class="list-group-item list-group-item-action active">CurrentBill</a></th>
      <th scope="col"><a href="./monthlyConsumption" class="list-group-item list-group-item-action">Monthly	Consumption</a> </th>
      <th scope="col"> <a href="./billHistoryPage"	class="list-group-item list-group-item-action">Bill History</a> </th>
     <th scope="col"> <a href="./onlinePayement" class="list-group-item list-group-item-action">Pay Online</a></th>
    </tr>
  </thead>
  </table>

	<marquee style="color: blue;" ><b>CONSUMER BILL DETAILS</b></marquee>
				<table class="table-success ;" style="margin-left: 285px; width: 60%"  > 
					<tbody style="text-align: center;">
					
						<tr>
							<td><strong style="color:black;">RR Number </strong></td>
							<td> :</td>
							<td><strong style="color: black;"><%= billBean.getRrNumber()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><Strong style="color: black;">Issue Date</Strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=billBean.getIssueDate()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><strong style="color: black;">Due Date</strong></td>
							<td>:</td>			
							<td><strong style="color: black;"><%=billBean.getDueDate()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><Strong style="color: black;">Current Reading </Strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=billBean.getCurrentReading()%></strong></td>
								<td> <br><br></td>
						</tr><br>
						<tr>
							<td><strong style="color: black;"> Previous Reading
									</strong></td>
							<td>:</td>
								<td><strong style="color: black;"><%=billBean.getPreviousReading()%></strong></td>
						</tr>
			
							<tr>
							<td><Strong style="color: black;"> Total Units </Strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=billBean.getTotalUnits()%></strong></td>
								<td> <br><br></td>
						</tr><br>
						
						<tr>
							<td><Strong style="color: black;">Bill Amount </Strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=billBean.getBillAmount()%></strong></td>
								<td> <br><br></td>
						</tr><br>
							
					</tbody>
				</table><br><br>
				
					<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
</body>
</html>