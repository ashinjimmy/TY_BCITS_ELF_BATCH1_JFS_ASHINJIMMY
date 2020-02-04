<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
<title>Main Home Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/fontawesome-free-5.12.0-web/css/all.css">
<link rel="stylesheet" href="${css}/mHomePage.css">

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
				<li class="nav-item active"><a class="nav-link active" href="">&nbsp;About Us</a>
				</li>
				 
			</ul>


		</div>
	</nav>

	<div class="my-btn ">
		<a class="float-left" href="./consumerLogin"><button type="button"	class="btn btn-md-lg btn-sm-lg btn-lg mr-5 btn-outline-primary ">
		Consumer Login</button></a> 
				<a class="float-left" href="./employeeLoginPage"><button type="button" class="btn btn-md-lg btn-sm-lg btn-lg  btn-outline-primary">
				Employee Login</button></a>
	</div>

	<script src="${js}/jquery-3.4.1.js"></script>
	<script src="${js}/js/bootstrap.min.js"></script>

</body>
</html>