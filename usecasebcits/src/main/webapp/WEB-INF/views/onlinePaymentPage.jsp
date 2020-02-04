<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
     
     <%	ConsumerMasterBean masterBean =(ConsumerMasterBean) session.getAttribute("infoBean");
%> 

 <% String errMsg = (String) request.getAttribute("errMsg"); %>
 <% String msg = (String) request.getAttribute("msg"); %>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="${css}/consumerLogin.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">


 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Main Home Page</title>
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/fontawesome-free-5.12.0-web/css/all.css">
  
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
      <th scope="col"><a href="./monthlyConsumption" class="list-group-item list-group-item-action ">Monthly	Consumption</a> </th>
      <th scope="col"> <a href="./billHistoryPage"	class="list-group-item list-group-item-action ">Bill History</a> </th>
     <th scope="col"> <a href="./onlinePayement " class="list-group-item list-group-item-action active">Pay Online</a></th>
    </tr>
  </thead>
  </table>


<div style="color: blue;"><marquee ><h3>Welcome to Online Payment Page. Please fill valid details !</h3> </marquee></div>
  <div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">
        
    <form action="./billPaymentPage"  method="post">
        <div  id="success" class="alert alert-success" style="display: none; margin-top: 3px;">

            <strong>Success!</strong>
          </div>
        
            
            <div style="padding-left: 13px;" class="icon-container ">
              <h5 >Accepted Cards</h5>
              <img height="40px" width="20%"
              src="${images}/image1.png"
              alt="">
              <img height="40px"width="20%"
              src="${images}/image2.png"
              alt="">
              <img height="60px"width="35%"
              src="${images}/image3.png"
              alt="">
              <img height="90px"width="21%"
              src="${images}/image4.png"
              alt="">
              
            </div>
        <h3 class="text-center">PAYMENT DETAILS</h3>
        
         <div class="form-group">
            <label for="exampleInputEmail1">CARD HOLDER NAME</label>
            <input id="email" type="text" placeholder="Holder Name" class="form-control" >
        </div>
       
        <div class="form-group">
            <label for="exampleInputEmail1">CARD NUMBER</label>
            <input id="email" type="number" placeholder="Valid Card Number" class="form-control" >
        </div>
        
           <div class="form-group">
            <label for="exampleInputEmail1">AMOUNT</label>
            <input id="billAmount" name ="amount"  type="number" placeholder="Amount" class="form-control" >
        </div>
        
        <div>
          &nbsp;<label for="exampleInputPassword1">EXPIRY DATE</label><br>
            &nbsp; <input  style=width:80px; type="number" placeholder="YYYY"  >
            &nbsp; &nbsp;<input  style=width:80px; type="number" placeholder="MM" >
            &nbsp; &nbsp; &nbsp;<label for="exampleInputPassword1">CV CODE</label>
            &nbsp;<input style=width:70px; type="number" placeholder="CVC"  >
         

        </div>
        <div class="form-group form-check ">
         <p>
            <div class="float-left">
                <input onclick="checkBox()" id="checkbox" type="checkbox" class="form-check-input">
            <label class="form-check-label" for="exampleCheck1">Agree the terms & conditions.</label>
            </div>
         </p>
        </div>
        <button type="submit" class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Pay</button>
    </form>
</div>
<script src="${js}/jquery-3.4.1.js"></script>
<script src="${js}/js/bootstrap.min.js"></script>
<script src="${js}/paymentP.js"></script>

</body>
</html>