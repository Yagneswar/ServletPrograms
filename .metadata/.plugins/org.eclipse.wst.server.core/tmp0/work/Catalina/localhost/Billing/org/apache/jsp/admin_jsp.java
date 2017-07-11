package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>\r\n");
      out.write("\t\t\tWelcome Page\r\n");
      out.write("\t\t</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div id=\"outer\">\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\tPayment Billing System\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"banner\">\r\n");
      out.write("\t\t\t\t<div class=\"captions\">\r\n");
      out.write("\t\t\t\t\t<h2>Sign in</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<img src=\"images/banner.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"nav\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"home.jsp\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"generalinfo.jsp\">New Registration</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"modify.jsp\">Modify Detail</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ahome.jsp\">Administrator</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"contactus.jsp\">Contact us</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul><br class=\"clear\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
					if(request.getAttribute("notlogin_msg")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("notlogin_msg"));
					out.print("</font>");
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("<table align=\"right\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\"><td style=\"color: navy;\"><B>Notice</B></td></tr>\r\n");
      out.write("\t\t\t<tr><td><div><marquee direction=\"up\" width=\"300px\" truespeed=\"truespeed\" onmouseover=\"stop()\" onmouseout=\"start()\" style=\"color: red;\">Welcome Administrator sir.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     You Can Visit a lot of information\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     about my various Branches.and Accountants\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </marquee></div></td></tr></table>\r\n");
      out.write("\r\n");
      out.write("<h3 style=\"color: navy;\" align=\"center\"><B>Consultant:-   javatpoint</B></h3>\r\n");
      out.write("<div id=\"box\">\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" action=\"aloginprocess.jsp\" >\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr><td style=\"color:navy;\"><B> Login Form</B></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><br></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>User Name:</td><td><input type=\"text\" name=\"username\"/></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td><br></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Password:</td><td><input type=\"password\" name=\"userpass\"/></td></tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td><br></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>      </td><td><input type=\"submit\" value=\"Sign in\"></td></tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</form>\t\t\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
