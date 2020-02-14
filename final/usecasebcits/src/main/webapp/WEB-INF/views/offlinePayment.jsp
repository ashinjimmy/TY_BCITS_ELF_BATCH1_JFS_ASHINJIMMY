
 <%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@page import="java.util.List"%>
<%@page import="com.bcits.usecase.beans.EmployeeMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


 <% String errMsg = (String) request.getAttribute("errMsg"); %>
 <% String msg = (String) request.getAttribute("msg"); %>
 

<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Offline Payment Details </title>
<link rel="stylesheet" href="${css}/consumerHome.css">
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
      <th scope="col"><a href="./employeeHomePage"class="list-group-item list-group-item-action"> Regional Officer Details</a> </th>
      <th scope="col"><a href="./consumerDetails"class="list-group-item list-group-item-action   "> Consumer Details</a> </th>
      <th scope="col"><a href="./displayGenerateBill" class="list-group-item list-group-item-action  ">Generate Bill </a></th>
      <th scope="col"><a href="./showAllCurrentBills" class="list-group-item list-group-item-action">Show Bill Details</a> </th>
   	 <th scope="col"><a href="./seeQueryInfo" class="list-group-item list-group-item-action">Recieved Queries </a> </th>
     <th scope="col"><a href="./revenueBillDetails" class="list-group-item list-group-item-action">Revenue Details</a> </th>
     <th scope="col"><a href="./monthlyRevenue" class="list-group-item list-group-item-action " >Monthly Revenue</a> </th>
		<th scope="col"><a href="./customBillPay" class="list-group-item list-group-item-action  active" >Offline Payment</a> </th>
		</thead>
	</table>
	<marquee style="color: blue;">
		<b>WELCOME TO OFFLINE PAYMENT PAGE</b>
	</marquee>
	
	<div class="container " >
       <div  style="margin-top: 30px;"><h1 id=title>OFFLINE PAYMENT </h1></div> 

        <form class="my-card" action="./customBillPayment" method="post" style="margin-top: -10px;"><br><br>
            <div class="form-row " ><br>
            
            <div class="col-sm-8"><br><br><br>

                    <label for="validationDefault01"><b>RR Number</b></label>
                    <input id="mname" name="rrNumber" type="text" class="form-control"  placeholder="Valid RR Number" required>
                    <p id="merror" style="color: red; display:none; font-size: 12px;">provide valid 8 numbers</p>

                </div>

                <div class="col-sm-6"><br><br>

                    <label for="validationDefault01" ><b>Bill Amount</b></label>
                    <input type="double" class="form-control" id="fname" name="billAmount" placeholder= "Amount"  required>
                    <p id="ferror" style="color: red; display:none; font-size: 12px;">provide valid name</p>

                </div>
               <!--  <div class="col-sm-6">
                    <label for="validationDefault02"><b>Date of Payment</b></label>
                    <input type="date" class="form-control" id="lname" name="" placeholder="Harry" required>
                    <p id="lerror" style="color: red; display:none; font-size: 12px;">provide valid name</p>

                </div> -->
               
       <div style="margin-top: 9px; margin-left: 20px;"><br><br><br>
   <button type="submit"  class="btn btn-primary">Submit</button> 
   </div>
        
        </form>
        
    </div>
	


</body>
</html>
