<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%
	ConsumerMasterBean consumerBean = (ConsumerMasterBean) session.getAttribute("infoBean");
%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consumer Home Page</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">
</head>

<jsp:include page="header.jsp"></jsp:include>
<body >
<table class="table">
  <thead class="bg-primary">
    <tr>
      <th scope="col"><a href="./consumerHomePage"class="list-group-item list-group-item-action active "> Consumer Details</a> </th>
      <th scope="col"><a href="./currentBill" class="list-group-item list-group-item-action">Month Bill Generation</a></th>
      <th scope="col"><a href="./monthlyConsumption" class="list-group-item list-group-item-action">Month Bill Collection</a> </th>
      <th scope="col"> <a href="./billHistoryPage"	class="list-group-item list-group-item-action">Bill History</a> </th>
     <th scope="col"> <a href= "./onlinePayement" class="list-group-item list-group-item-action">Month on Month Revenue</a></th>
    </tr>
  </thead>
  </table>
  	<marquee style="color: olive;" ><b> WELCOME TO EMPLOYEE HOME PAGE</b></marquee>
			
			
				<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>

<body>
</body>
</html>