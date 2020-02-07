<%@page import="com.bcits.usecase.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% ConsumerMasterBean consumerBillInfo = (ConsumerMasterBean)request.getAttribute("billMaster"); %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electricity Bill Generator</title>
</head>
<body>

<form class="needs-validation"  action=" ">
  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltip01">RR Number</label>
      <input type="text" class="form-control" value="consumerBillInfo." required>
      </div>

    
    <div class="col-md-4 mb-3">
      <label for="validationTooltip02">Previous Reading</label>
      <input type="text" class="form-control"  value="#" required>
    </div>
    
    <div class="col-md-4 mb-3">
      <label for="validationTooltipUsername">Current Reading</label>
      <input type="number" class="form-control"value="#" required>
      <div class="input-group">
      </div>
    </div>
        </div>

  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationTooltip03">Type Of Consumer</label>
      <input type="text" class="form-control"  required>
    </div>
   
    <div class="col-md-3 mb-3">
      <label for="validationTooltip05">Due Date</label>
      <input type="date" class="form-control" required>
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Submit form</button>
</form>

</body>
</html>