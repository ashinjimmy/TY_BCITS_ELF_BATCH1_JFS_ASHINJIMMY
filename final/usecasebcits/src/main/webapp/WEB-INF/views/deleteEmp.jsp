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
<body>

<% if(errMsg != null && !errMsg.isEmpty()) {%>
	<h2 style="color: red;"><%=errMsg%>
	</h2>
	<%}%>
	
	<% if(msg != null && !msg.isEmpty()) {%>
	<h2 style="color: red;"><%=msg%>
	</h2>
	<%}%>
	

		<div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card "><br><br>
		

		<form action="./deleteEmp"  method="post" >
		<div>
			<h2 class="text-center">Delete Employee Details</h2>
			</div>	
			<div class="form-group"><br>
				<label for="exampleInputEmail1"><br><b>Employee Id</b></label>
           <input id="number" type="number" name = "empId" placeholder="Employee Id" class="form-control" />
			<!-- 	<p id="" style="color: red; display: none; font-size: 12px;">Admin Id</p></div> -->
		</div>
			<button type="submit"
				class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Submit</button>
		</form>
		
			</div>	

</body>
</html>