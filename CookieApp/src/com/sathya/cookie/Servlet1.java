package com.sathya.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
     String str=request.getParameter("first");
     //create a cookie
     Cookie fs=new Cookie("FirstName",str);
     //set expire time 1min
     fs.setMaxAge(60);
     //add cookie to response
     response.addCookie(fs);
     //set MIME Type
     response.setContentType("text/html");
     PrintWriter out=response.getWriter();
     out.println("<center>");
     out.println("<form action='srv2'>");
     out.println("Last Name:<input type=text name='last'>");
     out.println("<br>");
     out.println("<input type=submit value='click'>");
     out.println("</form></center>");
     out.close();
	
	}

}
