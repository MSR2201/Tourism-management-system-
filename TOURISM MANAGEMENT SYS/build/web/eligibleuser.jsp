
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
   
    <link rel="stylesheet" href="style1.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  background: #f1f1f1;
}

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
  display: table;
}
    </style>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Home</title>
     
    </head>
    
    <body>
              <%
    Object username = request.getAttribute("username");
%>
      <nav>
      <div class="navbar">
      <div class="logo"><a href="index.html">Tourism Management System</a></div>
      <ul class="nav-links">
        <li><a href="eligibleuser.jsp">Home</a></li>
        <li><a href="about.html">About</a></li>
        <li><a href="contactus.html">Contact</a></li>
        <li><a href="index.html">Logout</a></li>
        <li>Welcome user <%=username%></li>
        <%request.setAttribute("username",username);%>
      </ul>
        

      
</div><br>
</nav>
        <br><br><br><br><br><br><br>
        <div>
       <center> <p>Search Tourist place</p></center><br>
<form class = "example" action="searchtourist.jsp" style="margin:auto;max-width:300px">
  <input type="text" placeholder="Search.." name="name">
  <button type="submit"><i class="fa fa-search"></i></button>
</form><br></div>
<div>       <center> <p>Search through district</p></center><br>
       <form class= "example" action="searchdistrict.jsp" style="margin:auto;max-width:300px">
  <input type="text" placeholder="Search.." name="district">
  <button type="submit"><i class="fa fa-search"></i></button>
</form></div>
    </body>
    
</html>
