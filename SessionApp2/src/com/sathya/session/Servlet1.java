package com.sathya.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
 
		String str=request.getParameter("T1");
		HttpSession session=request.getSession();
		session.setAttribute("fast", str);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Session Id :"+session.getId());
		out.println("<center>");
		out.println("<form action='srv2'>");
		out.println("LastName:<input type=text name='T2'>");
		out.println("<br>");
		out.println("<input type=submit value='click'>");
		out.close();
		
	}

}
