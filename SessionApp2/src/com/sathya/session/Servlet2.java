package com.sathya.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
      HttpSession session=request.getSession();
      String str2=(String)session.getAttribute("fast");
      String str3=request.getParameter("T2");
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      out.println("Session Id:"+session.getId());
      out.println("<center>");
      out.println("First Name:"+str2);
      out.println("<br>");
      out.println("Last Name:"+str3);
      out.println("<a href='logoutsrv'>LogOut</a>");
      out.close();


      

	}

}
