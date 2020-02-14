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
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/fontawesome-free-5.12.0-web/css/all.css">
</head>
<body  style="color:blue;" >

<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: red;"><%=errMsg%>
	</h2>
	<%}%>
	
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: red;"><%=msg%>
	</h2>
	<%}%>
	
<div
		class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card "><br><br>
		

		<form action="./adminLoginPage" onsubmit="return validateForm()" method="post" >
			<div id="success" class="alert alert-success" style="display: none;">
				login <strong>Success!</strong>
			</div>
			
			<div class="text-primary offset-md-5 ">
				<h1 ><i class="fas fa-user-circle"></i></h1>
			</div>
			<h2 class="text-center">ADMIN LOGIN</h2>
			<div class="form-group">
				<label for="exampleInputEmail1">Admin Id</label> <input
					id="number" type="number" name = "adminId" placeholder="Admin Id" class="form-control">
				<p id="" style="color: red; display: none; font-size: 12px;">Admin Id</p></div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					id="password" name = "password" type="password" placeholder="Mark$123%"
					class="form-control">
				<p id="pele" style="color: red; display: none; font-size: 12px;">Password</p>

			</div>
			
				
			<button type="submit"
				class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Login</button>
		</form>
		
			</div>				

</body>
</html>