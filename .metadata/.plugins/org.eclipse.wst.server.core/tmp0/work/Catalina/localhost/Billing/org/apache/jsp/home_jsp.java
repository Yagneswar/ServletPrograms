package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<title>\r\n");
      out.write("\t\t\tSearch\r\n");
      out.write("\t\t</title>\r\n");
      out.write("<script>\r\n");
      out.write("var request;\r\n");
      out.write("function sendInfo()\r\n");
      out.write("{\r\n");
      out.write("var v=document.myform.findName.value;\r\n");
      out.write("var url=\"findname.jsp?val=\"+v;\r\n");
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
      out.write("document.getElementById('location').innerHTML=val;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function sendGenInfo(name)\r\n");
      out.write("{\r\n");
      out.write("var v=name;\r\n");
      out.write("var url=\"getgeninfo.jsp?val=\"+v;\r\n");
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
      out.write("document.getElementById('getgeninfo').innerHTML=val;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function getAllInfo(){\r\n");
      out.write("if(request.readyState==4){\r\n");
      out.write("var val=request.responseText;\r\n");
      out.write("document.getElementById('bottom').innerHTML=val;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getAllRec(){\r\n");
      out.write("if(request.readyState==4){\r\n");
      out.write("var val=request.responseText;\r\n");
      out.write("document.getElementById('right').innerHTML=val;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function viewAll(name)\r\n");
      out.write("{\r\n");
      out.write("var v=name;\r\n");
      out.write("var url=\"viewall.jsp?val=\"+v;\r\n");
      out.write("\r\n");
      out.write("if(window.XMLHttpRequest){\r\n");
      out.write("request=new XMLHttpRequest();\r\n");
      out.write("}\r\n");
      out.write("else if(window.ActiveXObject){\r\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("try\r\n");
      out.write("{\r\n");
      out.write("request.onreadystatechange=getAllInfo;\r\n");
      out.write("request.open(\"GET\",url,true);\r\n");
      out.write("request.send();\r\n");
      out.write("}\r\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function viewAllInfo(name)\r\n");
      out.write("{\r\n");
      out.write("var v=name;\r\n");
      out.write("var url=\"viewallinfo.jsp?val=\"+v;\r\n");
      out.write("\r\n");
      out.write("if(window.XMLHttpRequest){\r\n");
      out.write("request=new XMLHttpRequest();\r\n");
      out.write("}\r\n");
      out.write("else if(window.ActiveXObject){\r\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("try\r\n");
      out.write("{\r\n");
      out.write("request.onreadystatechange=getAllRec;\r\n");
      out.write("request.open(\"GET\",url,true);\r\n");
      out.write("request.send();\r\n");
      out.write("}\r\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<div id=\"outer\">\r\n");
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
      out.write("<body width=\"100\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3 style=\"color: navy;\" align=\"center\"><B>Consultant:-   JavaTpoint</B></h3>\r\n");
      out.write("<div id=\"box\">\r\n");
      out.write("\r\n");
      out.write("<form name=\"myform\" >\r\n");
      out.write("<font style=\"color: navy;\">Find:-</font>\r\n");
      out.write("<input type=\"text\" align=\"right\" name=\"findName\" onkeyup=\"sendInfo()\"></input>\r\n");
      out.write("<div id=\"right\" align=\"right\"></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"location\" align=\"left\"></div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div id=\"bottom\" align=\"justify\"></div>\r\n");
      out.write("<div id=\"getgeninfo\" align=\"justify\"></div>\r\n");
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
