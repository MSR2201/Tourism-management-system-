
<html>
    <%@page import="java.sql.*"%>
<head>
    <title>Tourist place</title>
        <link rel="stylesheet" href="style1.css">
        <style>
            .img {
    float: left;
    width:  300px;
    height: 300px;
    background-size: cover;
}
        </style>
</head>
    
<body style="overflow: scroll; height : 90%">
<%
try{
String name=request.getParameter("name");
String username=request.getParameter("username");
 Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourist","root","");  
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from tourist where name='"+name+"'");
           int count=0;
          while(rs.next())
          {
                              count++;
          }

                    if(count>0){
            
            Statement s=con.createStatement();
           ResultSet rst=s.executeQuery("select * from tourist where name='"+name+"'");
          while(rst.next()){
              System.out.println(rst.getString("name"));
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
        <br><br><br><br><br>
            <h1>Tourist place information</h1>
                <H1><%=rst.getString("name")%></h1><br>
                
                <p><%=rst.getString("description")%></p>
                <h1>History</h1><br>
                <p><%=rst.getString("history")%></p><br>
                <h1>Rating : <%=rst.getString("rating")%></h1><br>
                <h1>Maps</h1>
                <iframe src="<%=rst.getString("map")%>" width="640" height="480"></iframe>
                <h1>Images</h1>
                <div class="img" style="background-image:url('<%=rst.getString("pic1")%>');"></div>
                <div class="img" style="background-image:url('<%=rst.getString("pic2")%>');"></div>
                <div class="img" style="background-image:url('<%=rst.getString("pic3")%>');"></div>
                <br><br>
                
                
                
                <%
          }
          }
          else
          {
                       System.out.println("The tourist place is not there in the database");
          }
}

catch(Exception e){
    System.out.println(e);
}
%>
</body>
</html>