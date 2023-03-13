<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
   
    <link rel="stylesheet" href="style1.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Payment</title>
     
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
        <li><a href="logout.html">Logout</a></li>
        
        <li> user <%=username%></li></ul>
        
        <h1></h1>

      
</div><br>
</nav>
        <br><br><br><br><br><br><br>
        <center>
        <form action="payment" method="post">
        <%request.setAttribute("username",username);%>
        <button type="submit">Do payment</button><br><br>
        <h3>For doing the payment just click the button and it will automatically do the payment. And login again</h3>
      </form><center>
    </body>
</html>
