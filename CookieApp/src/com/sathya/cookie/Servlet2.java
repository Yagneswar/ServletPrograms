package com.sathya.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		//readn cookies from request
		Cookie cookies[]=request.getCookies();
		//mime type
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//conditions for cookies
		if(cookies!=null)
		{
			String name=cookies[0].getName();
			String value=cookies[0].getValue();
			
			out.println("<h1>");
			out.println(name+" "+value);
			out.println("</h1>");
		}
		else
		{
			out.println("<h1>firstname cookies expired</h1>");
		}
		out.println("<br>");
		//read last name
		
		String str2=request.getParameter("last");
		out.println("<h1>");
		out.println("Last Name: "+str2);
		out.println("</h1>");
		out.close();
	}



}
