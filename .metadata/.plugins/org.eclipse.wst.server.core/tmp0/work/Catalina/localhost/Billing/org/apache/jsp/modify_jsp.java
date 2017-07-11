package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var request;\r\n");
      out.write("function sendInfo()\r\n");
      out.write("{\r\n");
      out.write("var v=document.myform.findName.value;\r\n");
      out.write("var url=\"findname1.jsp?val=\"+v;\r\n");
      out.write("if(window.XMLHttpRequest){\r\n");
      out.write("request=new XMLHttpRequest();\r\n");
      out.write("}\r\n");
      out.write("else if(window.ActiveXObject){\r\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("}\r\n");
      out.write("try\r\n");
      out.write("{\r\n");
      out.write("request.onreadystatechange=getInfo;\r\n");
      out.write("request.open(\"GET\",url,true);\r\n");
      out.write("request.send();\r\n");
      out.write("}\r\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getInfo(){\r\n");
      out.write("if(request.readyState==4){\r\n");
      out.write("var val=request.responseText;\r\n");
      out.write("document.getElementById('hi').innerHTML=val;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function sendGenInfo(name)\r\n");
      out.write("{\r\n");
      out.write("var v=name;\r\n");
      out.write("var url=\"getgeninfoname.jsp?val=\"+v;\r\n");
      out.write("if(window.XMLHttpRequest){\r\n");
      out.write("request=new XMLHttpRequest();\r\n");
      out.write("}\r\n");
      out.write("else if(window.ActiveXObject){\r\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("}\r\n");
      out.write("try\r\n");
      out.write("{\r\n");
      out.write("request.onreadystatechange=getGenInfo;\r\n");
      out.write("request.open(\"GET\",url,true);\r\n");
      out.write("request.send();\r\n");
      out.write("}\r\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getGenInfo(){\r\n");
      out.write("if(request.readyState==4){\r\n");
      out.write("var val=request.responseText;\r\n");
      out.write("document.getElementById('hello').innerHTML=val;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<div id=\"outer\">\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h3 style=\"color: navy;\" align=\"center\"><B>Consultant:-   JavaTpoint</B></h3>\r\n");
      out.write("<div id=\"box\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"save1.jsp\" name=\"myform\" id=\"hello\" method=\"post\">\r\n");
      out.write("<table width=\"100%\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td><table width=\"55%\" align=\"left\" style=\"table-layout: fixed;\">\r\n");
      out.write("\t\t<tr><td>\r\n");
      out.write("<table cellspacing=15 cellpadding=15\">\r\n");
      out.write("<tr><td><font style=\"color:navy\"><B>Student Detail:</B></font></td></tr>\r\n");
      out.write("<tr><td><B>ID:</B></td><td><input type=\"text\" name=\"id\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Name:</B></td><td><input type=\"text\" name=\"name\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Course:</B></td><td><input type=\"text\" name=\"course\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Mobile:</B></td><td><input type=\"text\" name=\"mobile\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Father's Name:</B></td><td><input type=\"text\" name=\"fathername\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Mother's Name:</B></td><td><input type=\"text\" name=\"mothername\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Qualification:</B></td><td><input type=\"text\" name=\"qualification\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Date of Birth:</B></td><td><input type=\"text\" name=\"dateofbirth\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Date of Joining:</B></td><td><input type=\"text\" name=\"dateofjoining\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Date of Submission:</B></td><td><input type=\"text\" name=\"feesub\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Paid:</B></td><td><input type=\"text\" name=\"paid\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Fee:</B></td><td><input type=\"text\" name=\"fee\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Balance:</B></td><td><input type=\"text\" name=\"balance\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Address:</B></td><td><input type=\"text\" name=\"address\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Description:</B></td><td><input type=\"text\" name=\"description\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Trainer:</B></td><td><input type=\"text\" name=\"trainer\"></input></td></tr>\r\n");
      out.write("<tr><td></td><td><input style=\"padding:3px 3px\" value=\" Edit & Save\" type=\"submit\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("<table align=\"right\" width=\"25%\" >\r\n");
      out.write("<tr>\r\n");
      out.write("<td><font style=\"color: navy;\"><B>Search:</B></font><input type=\"text\" name=\"findName\" onkeyup=\"sendInfo()\"></input></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td><div id=\"hi\"></div></td></tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
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
