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
<title>SignUp page</title>
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

    <nav class="navbar navbar-expand-lg navbar-dark bg-success">
        <img height="70px"
            src="${images}/Dislogo.gif"
            alt="">
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav offset-md-2 pl-5">
                <li class="nav-item active">
                    <h3 class=" active"><a class="nav-link" href="#"> CENTRAL DISCOM ELECTRICITY SUPPLY PRIVATE
							LIMITED <span
                                class="sr-only">(current)</span></a></h3>
                </li>
                

            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link active" href="./mainHomePage"><i class="fas fa-home"></i>Home</a>
                 </li>
                 <li class="nav-item active">
                    <a class="nav-link active" href="">About</a>
                 </li>
            </ul>


        </div>
    </nav>

    <div class="container " >
       <div><h1 id=title>SIGN UP PAGE</h1></div> 

        <form class="my-card" action="./consumerSignUp" method="post">
            <div class="form-row " >

                <div class="col-sm-6">

                    <label for="validationDefault01" ><b>First name</b></label>
                    <input type="text" class="form-control" id="fname" name="firstName" placeholder= "example: Mark"  required>
                    <p id="ferror" style="color: red; display:none; font-size: 12px;">provide valid name</p>

                </div>
                <div class="col-sm-6">
                    <label for="validationDefault02"><b>Last name</b></label>
                    <input type="text" class="form-control" id="lname" name="lastName" placeholder="Harry" required>
                    <p id="lerror" style="color: red; display:none; font-size: 12px;">provide valid name</p>

                </div>
               
                <div class="col-sm-6"><br>

                    <label for="validationDefault01"><b>Email Id</b></label>
                    <input id="email" name="emailId" type="emlId" class="form-control"  placeholder="mark@gmail.com" required>

                </div>

                <div class="col-md-6 mb-2"><br>
                    <label for="validationDefault02"><b>Phone Number</b></label>
                    <input type="number" class="form-control" id="pname" name="phoneNumber" placeholder="Valid 10 number" required>
                    <p id="perror"  style="color: red; display:none; font-size: 12px;">provide valid 10 numbers</p>

                </div>



                <div class="col-sm-12"><br>

                    <label for="validationDefault01"><b>RR Number</b></label>
                    <input id="mname" name="rrNumber" type="text" class="form-control"  placeholder="Valid RR Number" required>
                    <p id="merror" style="color: red; display:none; font-size: 12px;">provide valid 8 numbers</p>

                </div>



                <div class="col-sm-6"><br>

                    <label for="validationDefault01"><b>Password</b></label>
                    <input id="password"  name="password" type="password" class="form-control" placeholder="Valid password" required>
                    <p id="pele" style="color: red; display:none; font-size: 12px;">provide valid password</p>
                </div>

                <div class="col-md-6 mb-2"><br>
                    <label for="validationDefault02"><b>Confirm Password</b></label>
                    <input id="cname" type="password" name="confirmed" class="form-control"  placeholder="Valid password" required>
                    <p id="cerror"  style="color: red; display:none; font-size: 12px;">provide valid password</p>
                </div>
        

           
            <div class="  col-md-6 mb-2"   ><br>
                <label for="validationDefault01"><b>Region</b></label>
                <select class="custom-select" name="region" >
                    <option selected value ="0" selected disabled>choose</option>
                    <option value="Banglore North">Banglore North</option>
                    <option value="Banglore South">Banglore South</option>
                   
                  </select>
                </div>

                <div class="  col-md-6 mb-2"   ><br>
                    <label for="validationDefault01"><b>Consumer Type</b></label>
                    <select class="custom-select" name="typeOfConsumer">
                        <option value ="0" selected disabled >choose</option>
                        <option value="Residential">Residential</option>
                        <option value="Commercial">Commercial</option>
                        <option value="Industry">Industry</option>
                      </select>
                </div>

                 
                <div class="col-sm-12"><br>

                    <label for="validationDefault01"><b>House Number</b></label>
                    <input id="mname" name="houseNumber" type="text" class="form-control"  placeholder="Address line 1" required>
                    <p id="merror"  style="color: red; display:none; font-size: 12px;">provide valid address</p>

                </div>

                 
                <div class="col-sm-12"><br>

                    <label for="validationDefault01"><b>Area</b></label>
                    <input id="mname" name="area" name="address2" type="text" class="form-control"  placeholder="Address line 2" required>
                    <p id="merror"  style="color: red; display:none; font-size: 12px;">provide valid address</p>

                </div>
                
                
                <div class="col-sm-6"><br>

                    <label for="validationDefault01"><b>Pin Code</b></label>
                    <input id="password"  name="pinCode" type="number" class="form-control" placeholder="Pin code" required>
                    <p id="pele" style="color: red; display:none; font-size: 12px;">provide valid password</p>
                </div>



                <div class="form-group">
                    <div class="form-check"><br>
                        <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" name="" required>
                        <label class="form-check-label" for="invalidCheck2">
                            I hereby declare that the details furnished above are true and correct to the best
                             of my knowledge and belief and I undertake to inform you of any changes therein, immediately. 
                        </label>
                    </div>
                </div>
                <button type="submit"  class="btn btn-primary">Submit</button> 

 

        </form>
    </div>

    
     <script src="${js}/jquery-3.4.1.js"></script>
    <script src="${js}/bootstrap.min.js"></script>
    <script src="${js}/consumerSignUpPageJS.js"></script>
    

</body>
</html>