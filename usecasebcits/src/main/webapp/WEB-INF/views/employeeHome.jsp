<%@page import="com.bcits.usecase.beans.EmployeeMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <%
	EmployeeMasterBean emMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
%>
<% long count = (long)request.getAttribute("count"); %>
<% String errMsg= (String)request.getAttribute("errMsg"); %>
<% String msg = (String)request.getAttribute("msg"); %>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Home Page</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">
</head>

<jsp:include page="header.jsp"></jsp:include>
<body >


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
        <th scope="col"><a href="./employeeHomePage"class="list-group-item list-group-item-action active "> Regional Officer Details</a> </th>
      <th scope="col"><a href="./consumerDetails"class="list-group-item list-group-item-action  "> Consumer Details</a> </th>
      <th scope="col"><a href="./displayGenerateBill" class="list-group-item list-group-item-action">Generate Bill </a></th>
      <th scope="col"><a href="./showAllCurrentBills" class="list-group-item list-group-item-action">Show Bill Details</a> </th>
      	<th scope="col"><a href="./seeQueryInfo" class="list-group-item list-group-item-action">Recieved Queries </a> </th>
      <!-- <th scope="col"> <a href="#"	class="list-group-item list-group-item-action">Bill History</a> </th>
     <th scope="col"> <a href= "#" class="list-group-item list-group-item-action">Month on Month Revenue</a></th> -->
    </tr>
  </thead>
  </table>
  	<marquee style="color: olive;" ><b> WELCOME TO EMPLOYEE HOME PAGE</b></marquee>
			
			<table class="table-info ;" style="margin-left: 285px; width: 60%"  > 
					<tbody style="text-align: center;">
												
						<tr>
							<td><strong style="color:black;">Employee ID </strong></td>
							<td> :</td>
							<td><strong style="color: black;"><%= emMasterBean.getEmpId()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><Strong style="color: black;">Employee Name </Strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=emMasterBean.getEmpName()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><strong style="color: black;">Region</strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=emMasterBean.getRegion()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><Strong style="color: black;">Password </Strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=emMasterBean.getPassword()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><strong style="color: black;">Designation</strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=emMasterBean.getDesignation()%></strong></td>
									<td> <br><br></td>
						</tr>
						
						 <tr>
							<td><strong style="color: black;">Number of Consumers</strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%= count%></strong></td>
									<td> <br><br></td>
						</tr>
				
						
					</tbody>
			
	<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>


</body>
</html>