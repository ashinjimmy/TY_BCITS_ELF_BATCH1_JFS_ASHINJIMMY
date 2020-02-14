<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <% String errMsg = (String) request.getAttribute("errMsg"); %>
 <% String msg = (String) request.getAttribute("msg"); %>
 
 <spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Add Employee</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/fontawesome-free-5.12.0-web/css/all.css">
<link rel="stylesheet" href="${css}/cSignUpPage.css">
</head>
<body>

<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: red;"><%=errMsg%>
	</h2>
	<%}%>
	
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: red;"><%=msg%>
	</h2>
	<%}%>

<div class="modal fade" id="modalRegisterForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
  aria-hidden="true">
  <form action="./addEmp" method="post">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header text-center">
        <h4 class="modal-title w-100 font-weight-bold">Add Employee Details</h4>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body mx-3">
        <div class="md-form mb-5">
          <i class="fas fa-user prefix grey-text"></i>
          <input type="text" id="orangeForm-name" name="empId" class="form-control validate">
          <label data-error="wrong" data-success="right" for="orangeForm-name">Employee Id</label>
        </div>
        <div class="md-form mb-5">
          <i class="fas fa-envelope prefix grey-text"></i>
          <input type="text" id="orangeForm-email"  name="empName"class="form-control validate">
          <label data-error="wrong" data-success="right" for="orangeForm-email">Employee Name</label>
        </div>
        
         <div class="md-form mb-4">
          <i class="fas fa-lock prefix grey-text"></i>
          <input type="password" name="designation" id="orangeForm-pass" class="form-control validate">
          <label data-error="wrong" data-success="right" for="orangeForm-pass">Employee Designation</label>
        </div>
        
         <div class="md-form mb-4">
          <i class="fas fa-lock prefix grey-text"></i>
          <input type="password" id="orangeForm-pass" name="region" class="form-control validate">
          <label data-error="wrong" data-success="right" for="orangeForm-pass">Region</label>
        </div>

        <div class="md-form mb-4">
          <i class="fas fa-lock prefix grey-text"></i>
          <input type="password" id="orangeForm-pass" name="password" class="form-control validate">
          <label data-error="wrong" data-success="right" for="orangeForm-pass">Password</label>
        </div>

      </div>
      <div class="modal-footer d-flex justify-content-center">
        <button class="btn btn-deep-orange">Add</button>
      </div>
    </div>
  </div>
  </form>
</div>

<div class="text-center">
  <a href="" class="btn btn-default btn-rounded mb-4" data-toggle="modal" data-target="#modalRegisterForm">Launch
    Modal Register Form</a>
</div>



</body>
</html>