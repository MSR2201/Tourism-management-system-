package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class searchtourist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("    <title>Tourist place</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("        <style>\n");
      out.write("            .img {\n");
      out.write("    float: left;\n");
      out.write("    width:  300px;\n");
      out.write("    height: 300px;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("<body style=\"overflow: scroll; height : 90%\">\n");

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
            
      out.write("\n");
      out.write("            <nav>\n");
      out.write("      <div class=\"navbar\">\n");
      out.write("      <div class=\"logo\"><a href=\"index.html\">Tourism Management System</a></div>\n");
      out.write("      <ul class=\"nav-links\">\n");
      out.write("        <li><a href=\"eligibleuser.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"about.html\">About</a></li>\n");
      out.write("        <li><a href=\"contactus.html\">Contact</a></li>\n");
      out.write("        <li><a href=\"logout.html\">Logout</a></li>\n");
      out.write("        <li>User ");
      out.print(username);
      out.write("</li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      \n");
      out.write("</div><br>\n");
      out.write("</nav>\n");
      out.write("        <br><br><br><br><br>\n");
      out.write("            <h1>Tourist place information</h1>\n");
      out.write("                <H1>");
      out.print(rst.getString("name"));
      out.write("</h1><br>\n");
      out.write("                \n");
      out.write("                <p>");
      out.print(rst.getString("description"));
      out.write("</p>\n");
      out.write("                <h1>History</h1><br>\n");
      out.write("                <p>");
      out.print(rst.getString("history"));
      out.write("</p><br>\n");
      out.write("                <h1>Rating : ");
      out.print(rst.getString("rating"));
      out.write("</h1><br>\n");
      out.write("                <h1>Images</h1>\n");
      out.write("                <div class=\"img\" style=\"background-image:url('");
      out.print(rst.getString("pic1"));
      out.write("');\"></div><br>\n");
      out.write("                <div class=\"img\" style=\"background-image:url('");
      out.print(rst.getString("pic2"));
      out.write("');\"></div><br>\n");
      out.write("                <div class=\"img\" style=\"background-image:url('");
      out.print(rst.getString("pic3"));
      out.write("');\"></div>\n");
      out.write("                \n");
      out.write("                <iframe src=\"");
      out.print(rst.getString("map"));
      out.write("\" width=\"640\" height=\"480\"></iframe>\n");
      out.write("                \n");
      out.write("                ");

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

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
