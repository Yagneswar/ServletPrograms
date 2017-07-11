

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyNew
 */
public class MyNew extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String i=request.getParameter("T1");
		String n=request.getParameter("T2");
		String a=request.getParameter("S1");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sinu","sinu");
			PreparedStatement ps=con.prepareStatement("insert into empdet values('"+i+"','"+n+"','"+a+"')");
			int x=ps.executeUpdate();
			if(x>0)
			{
				out.println("<h1>");
				out.println("Mr. "+n+" ur account successfully created" );
				out.println("</h1>");
				out.println("<br>");
				out.println("Your Address: "+a);
			}
			ps.close();
			con.close();
		}
		
		catch(Exception e)
		{
			out.println("not deleted");
			System.out.println("my err:"+e);
		}
	}

}
