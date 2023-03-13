

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
   
    <link rel="stylesheet" href="style1.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Home</title>
     
    </head>
    
    <body style="overflow: scroll; height : 90%">
              <%
    Object username = request.getAttribute("username");
%>
      <nav>
      <div class="navbar">
      <div class="logo"><a href="index.html">Tourism Management System</a></div>
      <ul class="nav-links">
        <li><a href="noneligible.jsp">Home</a></li>
        <li><a href="about.html">About</a></li>
        <li><a href="contactus.html">Contact</a></li>
        <li><a href="payment.jsp">payment</a></li>
        <li><a href="index.html">Logout</a></li>
        
        <li>Welcome user <%=username%></li>
        <%request.setAttribute("username",username);%>
      </ul>
        

      
</div><br>
</nav>
        <br><br><br><br><br><br><br>
        <h1><%=username%></h1>
        <p>User You are not eligible to search through the data of the tourist places do the payment and you will be able to view the places </p>
    </body>
    
</html>
