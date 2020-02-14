<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<%
	ConsumerMasterBean consumerBean = (ConsumerMasterBean) session.getAttribute("infoBean");
%>

 <% String errMsg = (String) request.getAttribute("errMsg"); %>
 <% String msg = (String) request.getAttribute("msg"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>



<table class="table">
  <thead class="bg-primary">
    <tr>
      <th scope="col"><a href="./consumerHomePage"class="list-group-item list-group-item-action"> AccountDetails</a> </th>
      <th scope="col"><a href="./currentBill" class="list-group-item list-group-item-action">CurrentBill</a></th>
      <th scope="col"><a href="./monthlyConsumption" class="list-group-item list-group-item-action">Monthly	Consumption</a> </th>
      <th scope="col"> <a href="./billHistoryPage"	class="list-group-item list-group-item-action">Bill History</a> </th>
     <th scope="col"> <a href= "./onlinePayement" class="list-group-item list-group-item-action">Pay Online</a></th>
      <th scope="col"> <a href= "./queryRaised" class="list-group-item list-group-item-action  active ">Comment for Help</a></th>
      <th scope="col"> <a href= "./seeResponse" class="list-group-item list-group-item-action   ">Recieved Response</a></th>
    </tr>
  </thead>
  </table>

	 <div class="form-group" style="margin-left: 285px; width: 60%; margin-top: 200px;" > 
	 <form action="./queryRaised">
				<label for="comment"><strong><h3>Write for Support</h3></strong></label><br>
					<div align="center">
	         <textarea  id = "query" name="query" rows="8" cols="125" ></textarea>
	         </div>
		<!-- 		<textarea class="form-control" rows="2" id="comment"></textarea> -->
				<br>
				<button type="submit"  class="btn btn-primary"
					style="margin-top: -7px;">Submit</button>
					</form>
			</div>
			
			<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: red;"><%=errMsg%>
	</h2>
	<%}%>
	
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: red;"><%=msg%>
	</h2>
	<%}%>

</body>
</html>