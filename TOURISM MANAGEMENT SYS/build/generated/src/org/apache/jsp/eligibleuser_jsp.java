package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eligibleuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        form.example input[type=text] {\n");
      out.write("  padding: 10px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: 1px solid grey;\n");
      out.write("  float: left;\n");
      out.write("  width: 80%;\n");
      out.write("  background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example button {\n");
      out.write("  float: left;\n");
      out.write("  width: 20%;\n");
      out.write("  padding: 10px;\n");
      out.write("  background: #2196F3;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: 1px solid grey;\n");
      out.write("  border-left: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example button:hover {\n");
      out.write("  background: #0b7dda;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("    </style>\n");
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
      out.write("        <li><a href=\"logout.html\">Logout</a></li>\n");
      out.write("        <li>Welcome user ");
      out.print(username);
      out.write("</li>\n");
      out.write("        ");
request.setAttribute("username",username);
      out.write("\n");
      out.write("      </ul>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      \n");
      out.write("</div><br>\n");
      out.write("</nav>\n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("        <div>\n");
      out.write("       <center> <p>Search Tourist place</p></center><br>\n");
      out.write("<form class = \"example\" action=\"searchtourist.jsp\" style=\"margin:auto;max-width:300px\">\n");
      out.write("  <input type=\"text\" placeholder=\"Search..\" name=\"name\">\n");
      out.write("  <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("</form><br></div>\n");
      out.write("<div>       <center> <p>Search through district</p></center><br>\n");
      out.write("       <form class= \"example\" action=\"searchdistrict\" style=\"margin:auto;max-width:300px\">\n");
      out.write("  <input type=\"text\" placeholder=\"Search..\" name=\"district\">\n");
      out.write("  <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("</form></div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
