package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Payment</title>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"overflow: scroll; height : 90%\">\n");
      out.write("              ");

    Object username = request.getAttribute("username");

      out.write("\n");
      out.write("      <nav>\n");
      out.write("      <div class=\"navbar\">\n");
      out.write("      <div class=\"logo\"><a href=\"index.html\">Tourism Management System</a></div>\n");
      out.write("      <ul class=\"nav-links\">\n");
      out.write("        <li><a href=\"noneligible.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"about.html\">About</a></li>\n");
      out.write("        <li><a href=\"contactus.html\">Contact</a></li>\n");
      out.write("        <li><a href=\"payment.jsp\">payment</a></li>\n");
      out.write("        <li><a href=\"logout.html\">Logout</a></li>\n");
      out.write("        \n");
      out.write("        <li> user ");
      out.print(username);
      out.write("</li></ul>\n");
      out.write("        \n");
      out.write("        <h1></h1>\n");
      out.write("\n");
      out.write("      \n");
      out.write("</div><br>\n");
      out.write("</nav>\n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("        <center>\n");
      out.write("        <form action=\"payment\" method=\"post\">\n");
      out.write("        ");
request.setAttribute("username",username);
      out.write("\n");
      out.write("        <button type=\"submit\">Do payment</button><br>\n");
      out.write("        <h3>For doing the payment just click the button and it will automatically do the payment. And login again</h3>\n");
      out.write("      </form><center>\n");
      out.write("    </body>\n");
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
