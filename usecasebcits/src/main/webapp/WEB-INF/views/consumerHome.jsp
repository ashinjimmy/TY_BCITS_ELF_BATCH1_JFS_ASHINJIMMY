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
href ="${css}/consumerHome.css">
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
      <th scope="col"><a href="./consumerHomePage"class="list-group-item list-group-item-action active "> AccountDetails</a> </th>
      <th scope="col"><a href="./currentBill" class="list-group-item list-group-item-action">CurrentBill</a></th>
      <th scope="col"><a href="./monthlyConsumption" class="list-group-item list-group-item-action">Monthly	Consumption</a> </th>
      <th scope="col"> <a href="./billHistoryPage"	class="list-group-item list-group-item-action">Bill History</a> </th>
     <th scope="col"> <a href= "./onlinePayement" class="list-group-item list-group-item-action">Pay Online</a></th>
    </tr>
  </thead>
  </table>
  	<marquee style="color: blue;" ><b> WELCOME TO CONSUMER HOME PAGE</b></marquee>
				<table class="table-success ;" style="margin-left: 285px; width: 60%"  > 
					<tbody style="text-align: center;">
												<tr>
												<td><strong style="color: black; text-align: center;" >Consumer Name</strong></td>
												<td>: </td> 
												<td><strong style="color:black;"><%=consumerBean.getFirstName()+" "+consumerBean.getLastName() %></strong></td>
												<td> <br><br></td>
												</tr>
						<tr>
							<td><strong style="color:black;">RR Number </strong></td>
							<td> :</td>
							<td><strong style="color: black;"><%=consumerBean.getRrNumber()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><Strong style="color: black;">Phone Number</Strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=consumerBean.getPhoneNumber()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><strong style="color: black;">Email ID</strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=consumerBean.getEmailId()%></strong></td>
								<td> <br><br></td>
						</tr>
						<tr>
							<td><Strong style="color: black;">Region  </Strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=consumerBean.getRegion()%></strong></td>
								<td> <br><br></td>
						</tr><br>
						<tr>
							<td><strong style="color: black;"> Consumer Type
									</strong></td>
							<td>:</td>
							<td><strong style="color: black;"><%=consumerBean.getTypeOfConsumer()%></strong></td>
						</tr>
				
							<td><br><br><br></td>
					</tbody>
				</table><br><br>
			
			 <div class="form-group" style="margin-left: 285px; width: 60%; " > 
				<label for="comment"><strong>Query:</strong></label><br>
					<div align="center">
	         <textarea name="txtArea" rows="5" cols="125" ></textarea>
	         </div>
		<!-- 		<textarea class="form-control" rows="2" id="comment"></textarea> -->
				<br>
				<button type="submit" formaction="/" class="btn btn-primary"
					style="margin-top: -7px;">Submit</button>
			</div>
			
				<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>

<body>
</body>
</html>