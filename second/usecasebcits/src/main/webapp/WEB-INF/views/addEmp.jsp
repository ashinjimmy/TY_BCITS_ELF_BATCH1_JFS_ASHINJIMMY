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



    <div class="container " >
       <div><h1 id=title>ADD EMPLOYEE</h1></div> 

        <form class="my-card" action="#" method="post">
            <div class="form-row " >

                <div class="col-sm-6">

                    <label for="validationDefault01" ><b>Employee Name</b></label>
                    <input type="text" class="form-control" id="fname" name="empName" placeholder= "example: Mark"  required>
                    <p id="ferror" style="color: red; display:none; font-size: 12px;">provide valid name</p>

                </div>
               
                <div class="col-md-6 mb-2"><br>
                    <label for="validationDefault02"><b>Employee Id</b></label>
                    <input type="number" class="form-control" id="pname" name="empId" placeholder="Valid 10 number" required>
                    <p id="perror"  style="color: red; display:none; font-size: 12px;">provide valid 10 numbers</p>

                </div>

                <div class="col-sm-6"><br>

                    <label for="validationDefault01"><b>Password</b></label>
                    <input id="password"  name="password" type="password" class="form-control" placeholder="Valid password" required>
                    <p id="pele" style="color: red; display:none; font-size: 12px;">provide valid password</p>
                </div>

            <div class="  col-md-6 mb-2"   ><br>
                <label for="validationDefault01"><b>Region</b></label>
                <select class="custom-select" name="region" >
                    <option selected value ="0" selected disabled>choose</option>
                    <option value="Banglore North">Banglore North</option>
                    <option value="Banglore South">Banglore South</option>
                   
                  </select>
                </div>
     
                <button type="submit"  class="btn btn-primary">Submit</button> 

        </form>
    </div>

    
     <script src="${js}/jquery-3.4.1.js"></script>
    <script src="${js}/bootstrap.min.js"></script>
    <script src="${js}/consumerSignUpPageJS.js"></script>
    

</body>
</html>