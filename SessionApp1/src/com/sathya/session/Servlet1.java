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
		//get session object

    HttpSession session=request.getSession(true);
      //set MIME type
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    out.println("ID :"+session.getId());
    out.println("<br>");
    out.println("is New:"+session.isNew());
    out.println("<br>");
    out.println("Inactive Period:"+session.getMaxInactiveInterval());
    out.println("<br>");
    long ms=session.getCreationTime();
    java.util.Date createtiondate=new java.util.Date(ms);
    out.println("Creation date: "+createtiondate);
    out.println("<br>");
    long ms2=session.getLastAccessedTime();
    java.util.Date createn=new java.util.Date(ms2);
    out.println("last Accesseddate: "+createn);
	out.close();
	}


}
