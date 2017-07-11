

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

/**
 * Servlet implementation class CreateAccount
 */
public class CreateAccount extends HttpServlet {
       
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		String nn=request.getParameter("T1");
		String ad=request.getParameter("S1");
		String ph=request.getParameter("T2");
		String em=request.getParameter("T3");
		String db=request.getParameter("T4");
		String dop=request.getParameter("T5");
		String at=request.getParameter("D1");
		String nat=at.substring(0,2);
		Connection con=null;
		int nr=0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sinu","sinu");
			PreparedStatement ps1=con.prepareStatement("Select count(*) from bankaccountdetails");
			ResultSet rs1=ps1.executeQuery();
while(rs1.next())
{
	nr=rs1.getInt(1);
}
rs1.close();
ps1.close();
		}
		catch(Exception e)
		{
			System.out.println("myconerr"+e);
		}
		nr++;
		String acn=nat+String.valueOf(nr);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sinu","sinu");
PreparedStatement ps2=con.prepareStatement("insert into bankaccountdetails values('"+acn+"','"+nn+"','"+ad+"','"+ph+"','"+em+"','"+db+"','"+dop+"','"+at+"')");
int ins=ps2.executeUpdate();
if(ins>0)
{
	out.print("your "+at+" a/c has been created Successfully");
	out.print("<br> your "+at+" a/c no is "+acn);
}
ps2.close();
con.close();
	
	}
catch(Exception e)
{
	out.print("failure in creation of Account");
	System.out.println("myInserr"+e);
}
		
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}

}
