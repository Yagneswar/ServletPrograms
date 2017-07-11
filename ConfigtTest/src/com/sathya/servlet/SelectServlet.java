package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectServlet extends HttpServlet {
	
	String s1,s2,s3,s4;
	public void init(ServletConfig config) throws ServletException
	{
		s1=config.getInitParameter("driver");
		s2=config.getInitParameter("url");
		s3=config.getInitParameter("username");
		s4=config.getInitParameter("password");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName(s1);
			Connection con=DriverManager.getConnection(s2,s3,s4);
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from empdet");
			out.println("<center><table border=2 height=70 width=50>");
			out.println("<b><tr>");
			out.println("<th>EMPID</th><th>EMPNAME</th><th>EMPADD</th>");
			out.println("</tr></b>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getInt(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("</tr>");
			}
			out.println("</table></center>");
			rs.close();
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			out.println("sorry, some problem occure to server");
		}

		out.close();
	}

}
