<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.bcits.usecase.beans.QueryMsgBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
  <% String errMsg = (String) request.getAttribute("errMsg"); %>
 <% String msg = (String) request.getAttribute("msg"); %>
 
 <% List<QueryMsgBean> queryRequests = (List<QueryMsgBean>) request.getAttribute("query"); %>
 
 <spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Query Info Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">

</head>

<body>
<jsp:include page="empHeader.jsp"/>

<table class="table">
  <thead class="bg-primary">
    <tr>
    
       <th scope="col"><a href="./employeeHomePage"class="list-group-item list-group-item-action"> Regional Officer Details</a> </th>
      <th scope="col"><a href="./consumerDetails"class="list-group-item list-group-item-action    "> Consumer Details</a> </th>
      <th scope="col"><a href="./displayGenerateBill" class="list-group-item list-group-item-action">Generate Bill </a></th>
      <th scope="col"><a href="./showAllCurrentBills" class="list-group-item list-group-item-action">Show Bill Details</a> </th>
       <th scope="col"><a href="./seeQueryInfo" class="list-group-item list-group-item-action  active">Recieved Queries </a> </th>
       	<th scope="col"><a href="./revenueBillDetails" class="list-group-item list-group-item-action">Revenue Details</a> </th>
    </tr>
  </thead>
  </table>
 <div class="col-8">
  <div class="consumerDetails"> <br>  
		<marquee style="">
		<h3><b> QUERY DETAILS</b></h3>
	</marquee>
      <table class="table-primary ;" style="margin-left: 100px; width: 1350px;"  > 
		<thead style="color: navy; ">
			<tr>
				<!-- <th scope="col">Query Details</th> -->
				<th scope="col">&nbsp;&nbsp;&nbsp;Date</th>
			<th scope="col">	&nbsp;&nbsp;&nbsp;RR Number </th>
				<th scope="col"> &nbsp;&nbsp;&nbsp;Request</th>
				<th scope="col">&nbsp;&nbsp;&nbsp;Response</th>
				<th scope="col">&nbsp;&nbsp;&nbsp;Enter the Response</th>
			</tr>
		</thead>
 <tbody>
<% if(queryRequests != null) { %>
    <%
  for( QueryMsgBean queries :queryRequests) { %><tr>
       <form action="./sendResponse" method="post">
    
  <input type="datetime" name="date" value=" <%=queries.getQueryMsgPk().getDate()%>" hidden="true" />
      <%SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); %>
      
      <td><strong><%= formatter.format(queries.getQueryMsgPk().getDate()) %></strong></td>
      
      <input type="text" name="rrNumber" value="<%= queries.getQueryMsgPk().getRrNumber() %>"  hidden="true"  />
      <td>&nbsp;&nbsp;&nbsp;<strong><%= queries.getQueryMsgPk().getRrNumber() %></strong></td>
      <td>&nbsp;&nbsp;&nbsp;<strong><%= queries.getQueryRequest()  %></strong></td>
      <td>&nbsp;&nbsp;&nbsp;<strong><%= queries.getQueryResponse() %></strong></td>
      <td>&nbsp;&nbsp;&nbsp;&nbsp;<textarea class="form-control"  rows="2" id="query" name ="query"></textarea></td>
      	  <td>&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-primary">Send</button></td>
    </tr>
     
    </form>

    <% } %>
    <%  
         } %>
         
         	<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
   </tbody>
      
</table>
 
</div>

 <% if(errMsg != null && !errMsg.isEmpty()) { %>
     <div style="color: red; font-size:35px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= errMsg %></strong>
	</div>

<%} %>
<% if(msg != null && !msg.isEmpty()) { %>
     <div style="color: green; font-size:25px; font: bold; margin-right: 50px" align="center">
  	<strong style="transition-duration: 60s;"><%= msg %></strong>
	</div>
<%} %>
</body>
</html>