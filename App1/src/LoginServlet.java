

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter out=response.getWriter();
		String str1=request.getParameter("T1");
		String str2=request.getParameter("T2");
		if(str1.equals("sinu")&&str2.equals("sinu"))
		{
			out.println("login success........");
		}
		else
		{
			out.println("login failed");
		}
		
	}

	
	

}
