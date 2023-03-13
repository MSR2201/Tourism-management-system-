
<!DOCTYPE html>
<html>
    <%@page import="java.sql.*"%>
    <head>
    <meta charset="UTF-8">
   
    <link rel="stylesheet" href="style1.css">

   
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
        
     
      </ul>
        

      
</div><br>
</nav>
        <br><br><br><br><br><br><br>
        
       <%
           String district= request.getParameter("district");
           Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourist","root","");  
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from tourist where district='"+district+"'");
           
       %>
         <center>
         <H3>Type the tourist name again to get the information about the  tourist place</h3><br>
      <TABLE BORDER="1">
          
      <TR>
      
      <TH>Name</TH>
      <TH>District</TH>
      <TH>Rating</TH>

      <TH>Type to open</TH>
      </TR>
      <% while(rs.next()){ %>
      <TR>
       <TD> <%= rs.getString("name") %></td>
       <TD> <%= rs.getString("district") %></TD>
       <TD><center> <%= rs.getString("rating") %></center></TD>
       <TD> <form class = "example" action="searchtourist.jsp" >
  <input type="text" placeholder="Search.." name="name">
  <button type="submit">Search</i></button>
</form></TD>
      </TR>
      
      <% } %>
</center></body>
</html>
