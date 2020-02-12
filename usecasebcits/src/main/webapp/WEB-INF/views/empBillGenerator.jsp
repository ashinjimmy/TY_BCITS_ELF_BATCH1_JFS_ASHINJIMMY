<%@page import="java.util.List"%>
<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% ConsumerMasterBean consumerBillInfo = (ConsumerMasterBean)request.getAttribute("billMaster"); %>
   <%  Double  previousData  =  (Double) request.getAttribute("previous"); 
     String msg = (String ) request.getAttribute("msg");
      String errMsg = (String ) request.getAttribute("errMsg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electricity Bill Generator</title>
</head>
<body>
	<jsp:include page="empHeader.jsp"/>
	
<div class="container">
<% if( consumerBillInfo != null && previousData != null){ %>
<form class="needs-validation"  action="./generateCurrentBill"  method="post">

  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltip01">RR Number</label>
      <input type="text" name ="rrNumber" class="form-control" value="<%= consumerBillInfo.getRrNumber() %>" required>
      </div>

    </div>
      <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltipUsername">Previous Reading</label>
      <input type="text" name = "previousReading" class="form-control"  value="<%= previousData %>" required>
    </div>

    <div class="col-md-4 mb-3">
      <label for="validationTooltipUsername">Current Reading</label>
      <input type="number" name="currentReading" class="form-control" required>
    </div>
        </div>

  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltip03">Type Of Consumer</label>
      <input type="text" name="typeOfConsumer" class="form-control"   value="<%= consumerBillInfo.getTypeOfConsumer()%>" required>
    </div>
   
       <div class="col-md-4 mb-3">
      <label for="validationTooltip05">Issue Date</label>
      <input type="date"  name = "issueDate" class="form-control" required>
    </div>
   
   
    <div class="col-md-4 mb-3">
      <label for="validationTooltip05">Due Date</label>
      <input type="date"  name = "dueDate" class="form-control" required>
    </div>
    
  </div>
  <button class="btn btn-primary" type="submit">Submit form</button>

</form>
<%} %>
      <% if(msg != null && !msg.isEmpty()){ %>
      	<h1><%=msg %></h1>
      <%} %>
      
      <% if(errMsg != null && !errMsg.isEmpty()){ %>
      	<h1><%=errMsg %></h1>
      <%} %>
      
</div>

</body>
</html>