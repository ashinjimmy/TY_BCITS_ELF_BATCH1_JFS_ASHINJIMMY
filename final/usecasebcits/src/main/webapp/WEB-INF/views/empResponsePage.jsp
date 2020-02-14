<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.bcits.usecase.beans.QueryMsgBean"%>
<%@page import="java.util.List"%>
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% String errMsg = (String) request.getAttribute("errMsg"); %>
  <%String msg = (String) request.getAttribute("msg"); %>
<% List<QueryMsgBean> queryResponse = (List<QueryMsgBean>) request.getAttribute("response"); %>


<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>response</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/monthlyConsumption.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>
 <jsp:include page="header.jsp"></jsp:include>
<body>
 <% if(errMsg != null && !errMsg.isEmpty()){ %>
     <div style="color: red; font-size:35px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>

<%} %>
<% if(msg != null && !msg.isEmpty()) { %>
   <div style="color: green; font-size:25px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= msg %></strong>
	</div>
<%} %>


<table class="table">
  <thead class="bg-primary" >
    <tr>
      <th scope="col"><a href="./consumerHomePage"class="list-group-item list-group-item-action"> AccountDetails</a> </th>
      <th scope="col"><a href="./currentBill" class="list-group-item list-group-item-action">CurrentBill</a></th>
      <th scope="col"><a href="./monthlyConsumption" class="list-group-item list-group-item-action">Monthly	Consumption</a> </th>
      <th scope="col"> <a href="./billHistoryPage"	class="list-group-item list-group-item-action">Bill History</a> </th>
      <th scope="col"> <a href= "./onlinePayement" class="list-group-item list-group-item-action">Pay Online</a></th>
      <th scope="col"> <a href= "./queryRaised" class="list-group-item list-group-item-action">Comment for Help</a></th>
      <th scope="col"> <a href= "./seeResponse" class="list-group-item list-group-item-action  active ">Recieved Response</a></th>
    </tr>
  </thead>
  </table>
         <table class="table-secondary ;" style="margin-left: 285px; width: 70%; height: 70px; "  > 
            	<thead style="color: navy;  padding-top: 25px;">
			<tr>
				<!-- <th scope="col">Query Details</th> -->
				<th scope="col"><h5>&nbsp;Date</h5></th>
				<th scope="col"> <h5>	&nbsp;Request</h5></th>
				<th scope="col"> <h5>Response</h5></th>
			</tr>
		</thead><br> 
      
 <tbody>
<% if(queryResponse != null) { %>
    <% for( QueryMsgBean queries :queryResponse) { %>
    <tr> <br><br>
      <%SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); %> 
    <td>&nbsp;<strong><%= formatter.format(queries.getQueryMsgPk().getDate()) %></strong></td>
          <td>&nbsp;<strong><%= queries.getQueryRequest() %></strong></td>
              <td>&nbsp;<strong><%= queries.getQueryResponse() %></strong></td>
    </tr>
    <% } %>
    <% } %>
 
   </tbody>   
</table>
</body>
</html>
