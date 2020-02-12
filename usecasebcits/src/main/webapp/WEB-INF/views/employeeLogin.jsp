<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	 <% String errMsg = (String) request.getAttribute("errMsg"); %>
 <% String msg = (String) request.getAttribute("msg"); %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
<link rel="stylesheet"href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-success">
		<img height="70px" src="${images}/Dislogo.gif" alt="">
		

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav offset-md-1 pl-3">
				<li class="nav-item active">
					<h3 class=" active">
						<a class="nav-link" href="#">CENTRAL DISCOM ELECTRICITY SUPPLY
							PRIVATE LIMITED <span class="sr-only">(current)</span>
						</a>
					</h3>
				</li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link active"
					href="./mainHomePage"><i class="fas fa-home"></i></a>
				</li>
				<li class="nav-item active"><a class="nav-link active" href="./consAboutUsPage">&nbsp;About Us</a>
				</li>
			</ul>
		</div>
	</nav>
	
		<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: blue;"><%=errMsg%>
	</h2>
	<%}%>
	
			
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: blue;"><%=msg%>
	</h2>
	<%}%>
	
	<div
		class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">

		<form action="./loginEmployee" onsubmit="return validateForm()" method="post">
			<div id="success" class="alert alert-success" style="display: none;">
				login <strong>Success!</strong>
			</div>
			
			<div class="text-primary offset-md-5 ">
				<h1 ><i class="fas fa-user-circle"></i></h1>
			</div>
			<h2 class="text-center">EMPLOYEE LOGIN</h2>
			<div class="form-group">
				<label for="exampleInputEmail1">Employee Id</label> <input
					id="number" type="number" name = "empId" placeholder="Admin provided email Id" class="form-control">
				<p id="" style="color: red; display: none; font-size: 12px;">provide valid emailId</p></div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					id="password" name = "password" type="password" placeholder="Mark$123%"
					class="form-control">
				<p id="pele" style="color: red; display: none; font-size: 12px;">provide
					valid password</p>

			</div>
			

		<!-- 	<div class="form-group form-check ">
				<p>
				<div class="float-left">
					<input onclick="checkBox()" id="checkbox" type="checkbox"
						class="form-check-input"> <label class="form-check-label"
						for="exampleCheck1">Show Password</label>
				</div> -->
				
			<button type="submit"
				class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Login</button>
		</form>
		
			</div>					


	<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
<%-- 	<script src="${css}/employeeLoginP.js"></script> --%>

</body>
</html>