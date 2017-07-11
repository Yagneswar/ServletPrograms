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


public class Select1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String a=request.getParameter("T1");
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sinu","sinu");
		PreparedStatement ps=con.prepareStatement("select * from emp where empno='"+a+"'");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			
			out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			
		    out.println("Select EmpId:<input type=text name=T2><input type=submit value=search><br><br>");
			
				
			
		}
		rs.close();
		ps.close();
		con.close();
		
		}
		
		catch(Exception e)
		{
			out.println("sorry result not found");
			out.println("My Err"+e);
			
		}
	}

}
