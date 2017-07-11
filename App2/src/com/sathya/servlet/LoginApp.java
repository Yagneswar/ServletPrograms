package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LoginApp extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String str1=request.getParameter("uname");
		String str2=request.getParameter("pwd");
		String str3[]=request.getParameterValues("hobby");
		String str4="";
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(str3!=null)
		{
			for(int i=0;i<str3.length;i++)
			str4=str4+" "+str3[i];
		}
			
		
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:oci:@xe","sinu","sinu");
				PreparedStatement ps=con.prepareStatement("insert into userinfo values(?,?,?)");
				ps.setString(1, str1);
				ps.setString(2, str2);
				ps.setString(3, str4);
				int x=ps.executeUpdate();
				ps.close();
				con.close();
				
					out.println("Hiiii "+str1);
					out.println("<br>");
					out.println("You are successfully registered..........");
				
				
			}
			catch(Exception e)
			{
				out.println("register not successful.....");
			}
	}

}
