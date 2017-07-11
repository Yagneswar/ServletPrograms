package com.serv.insert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String s1=request.getParameter("T1");
		String s2=request.getParameter("T2");
		String s3=request.getParameter("T3");
		String s4=request.getParameter("T4");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sinu","sinu");
		PreparedStatement ps=con.prepareStatement("insert into emp values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			out.println("inserted successfully");
		}
		rs.close();
		ps.close();
		con.close();
		
		}
		catch(Exception e)
		{
			out.println("My Err"+e);
		}
	}

}
