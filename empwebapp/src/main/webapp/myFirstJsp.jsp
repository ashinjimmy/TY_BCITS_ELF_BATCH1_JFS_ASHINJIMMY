<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%!  //declaration tag
    
    private int a = 10;
    public void setA(int a){
    	this.a =a;
    }
    public int getA(){
    	return a;
    }
    public String name = "Seema";
    
    public String getName() {
    	return name;
    }
    public String getName(String name){
    	return name;
    }

    %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:blue"> Welcome To JSP </h1>


a = <%= a %><br>
a = <%= getA() %><br>
<% setA(100); %>
a = <%= getA() %><br><br>

Name = <%= name %><br>
Name = <%= getName() %><br>
Name = <%= getName("Dinga") %>


<%for(int i = 0; i < 5 ; i++) { %>
<%= getName() %><br>
<% } %>



</body>
</html>


<%-- <<jsp:include page="/currentDate"> --%>

<%-- <jsp:include page="/searchEmployee">
<jsp:param  name="empId" value="456"/>
</jsp:include> --%>

<%-- <%@ include file="date.html " %> --%>


<%-- <jsp:forward page="./currentDate"></jsp:forward> --%>

<%-- <jsp:forward page="./searchEmployee">
<jsp:param name="empID"   value="98765"/>
</jsp:forward> --%>

<%-- <jsp:forward page="./currentDate"></jsp:forward> --%>

<%-- <jsp:forward page="./searchEmployee">
<jsp:param name="empID"   value="98765"/>
</jsp:forward> --%>