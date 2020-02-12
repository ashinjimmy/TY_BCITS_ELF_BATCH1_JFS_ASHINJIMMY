<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
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
			</ul>
		</div>
	</nav>


<div class="alert alert-info" role="alert" style="text-align: center;"><br><br>
  <h2 class="alert-heading">Unit of Government Of Karnataka </h2><br><br>
<p style="color: blue; text-align: center;">Industry	Electricity<br>
Founded	2002<br>
Headquarters Karnataka, India<br>
Owner	Karnataka Government<p><br>
</div>
<!-- <div class="container form">
<p style="color: navy; text-align: center;"> Responsible for electric power
 distribution in state of Karnataka.<br> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<br>
 Its origin was in Karnataka Electricity Board.
  This distribution entity was incorporated to provide efficient electric power supply 
  to the people of Karnataka state.<p>
  
</div> -->

<div class="media">
  
  <div class="media-body">
    <h5 class="mt-0 font-weight-bold" style="color: purple;text-align: center;">
    Responsible for electric power distribution in state of Karnataka. Its origin was in Karnataka Electricity Board.
    <br>This distribution entity was incorporated to provide efficient electric power supply to the people of Karnataka state.
    </h5>
  </div>
</div>



</body>
</html>