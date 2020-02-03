<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
<title>Consumer Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="${css}/consumerLogin.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>
<body>

	


	<nav class="navbar navbar-expand-lg navbar-dark bg-success">
		<img height="70px" src="${images}/Dislogo.gif" alt="">
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav offset-md-2 pl-5">
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
					href="./mainHomePage"><i class="fas fa-home"></i>Home</a>
				</li>
				<li class="nav-item active"><a class="nav-link active" href="">AboutUs</a>
				</li>
				  <li class="nav-item active">
                        <a class="nav-link active" href="./consumerLogout">logout</a>
                     </li>
			</ul>


		</div>
	</nav>
	<div
		class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">

		<form action="./loginPage"onsubmit="return validateForm()" method="post">
			<div id="success" class="alert alert-success" style="display: none;">
				login <strong>Success!</strong>
			</div>
			<div class="text-primary offset-md-5 ">
				<h1>
					<i class="fas fa-user-circle"></i>
				</h1>
			</div>
			<h2 class="text-center">Consumer Login</h2>
			<div class="form-group">
				<label for="exampleInputEmail1">Email Id</label> <input id="email" name="emailId"
					type="email" placeholder="validemail@gmail.com"
					class="form-control">

				<p id="eele" style="color: red; display: none; font-size: 12px;">provide
					valid emailId</p>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					id="password" type="password" name="password" placeholder="Mark@123$%"
					class="form-control" id="exampleInputPassword1">
				<p id="pele" style="color: red; display: none; font-size: 12px;">provide
					valid password</p>

			</div>
			<div class="form-group form-check ">
				<p>
				<div class="float-left">
					<input onclick="checkBox()" id="checkbox" type="checkbox"
						class="form-check-input"> <label class="form-check-label"
						for="exampleCheck1">Show Password</label>
				</div>

				<div class="float-left offset-md-4 ">
					<input id="savebox" type="checkbox" class="form-check-input ">
					<label class="form-check-label" for="exampleCheck1">Save
						Password</label>
				</div>
			</div>
			<button type="submit"
				class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Login</button>
				
		</form>
		<p class="text-center mt-1">
			New user ? <a class="my-text" href="./consumerSignUpPage">Register</a>

		</p>
	</div>
		
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: blue;"><%=msg%>
	</h2>
	<%}%>
	
	


	<script src="${js}/jquery/jquery-3.4.1.js"></script>
	<script src="${js}/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
	<script src="${js}/consumerLoginP.js"></script>


</body>
</html>