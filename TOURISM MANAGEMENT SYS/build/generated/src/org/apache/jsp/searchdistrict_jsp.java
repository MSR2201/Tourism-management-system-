package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class searchdistrict_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>User Home</title>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("              ");

    Object username = request.getAttribute("username");
    

      out.write("\n");
      out.write("      <nav>\n");
      out.write("      <div class=\"navbar\">\n");
      out.write("      <div class=\"logo\"><a href=\"index.html\">Tourism Management System</a></div>\n");
      out.write("      <ul class=\"nav-links\">\n");
      out.write("        <li><a href=\"eligibleuser.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"about.html\">About</a></li>\n");
      out.write("        <li><a href=\"contactus.html\">Contact</a></li>\n");
      out.write("        <li><a href=\"index.html\">Logout</a></li>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("      </ul>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      \n");
      out.write("</div><br>\n");
      out.write("</nav>\n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("        \n");
      out.write("       ");

           String district= request.getParameter("district");
           Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourist","root","");  
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from tourist where district='"+district+"'");
           
       
      out.write("\n");
      out.write("         <center>\n");
      out.write("         <H3>Type the tourist name again to get the information about the  tourist place</h3><br>\n");
      out.write("      <TABLE BORDER=\"1\">\n");
      out.write("          \n");
      out.write("      <TR>\n");
      out.write("      \n");
      out.write("      <TH>Name</TH>\n");
      out.write("      <TH>District</TH>\n");
      out.write("      <TH>Rating</TH>\n");
      out.write("\n");
      out.write("      <TH>Type to open</TH>\n");
      out.write("      </TR>\n");
      out.write("      ");
 while(rs.next()){ 
      out.write("\n");
      out.write("      <TR>\n");
      out.write("       <TD> ");
      out.print( rs.getString("name") );
      out.write("</td>\n");
      out.write("       <TD> ");
      out.print( rs.getString("district") );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( rs.getString("rating") );
      out.write("</TD>\n");
      out.write("       <TD> <form class = \"example\" action=\"searchtourist.jsp\" >\n");
      out.write("  <input type=\"text\" placeholder=\"Search..\" name=\"name\">\n");
      out.write("  <button type=\"submit\">Search</i></button>\n");
      out.write("</form></TD>\n");
      out.write("      </TR>\n");
      out.write("      \n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("</center></body>\n");
      out.write("</html>\n");
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
