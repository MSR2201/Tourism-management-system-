
import java.io.*;
import java.lang.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class register extends
 HttpServlet{
  public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  String connectionURL = "jdbc:mysql://localhost:3306/tourist";
  Connection connection;
  try{
  String username = request.getParameter("username");
  
  String email = request.getParameter("email");
  String phoneno = request.getParameter("phoneno");
  String pass = request.getParameter("pass1");
  int a=0;

  
  Class.forName("com.mysql.jdbc.Driver");
  connection = DriverManager.getConnection(connectionURL, "root", "");
  PreparedStatement pst = connection.prepareStatement
  ("insert into user values(?,?,?,?,?)");
  pst.setString(1, username);
  pst.setString(2, email);
  pst.setString(3, phoneno);
  pst.setString(4, pass);
  pst.setInt(5, a);

  
  int i = pst.executeUpdate();
  if(i!=0){
  pw.println("<br>Record has been inserted");
  RequestDispatcher R = request.getRequestDispatcher("./userlogin.html");
  R.forward(request, response);
  }
  else{
  pw.println("failed to insert the data");
  }
  }
  catch (Exception e){
  pw.println(e);
  }
  }
}