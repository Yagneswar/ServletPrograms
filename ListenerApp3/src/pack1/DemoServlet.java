package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		
		//add attribute
		
		request.setAttribute("k1", 1000);
        request.setAttribute("k2", 2000);
        request.setAttribute("k3", 3000);
        
        //remove attribute
        request.removeAttribute("k2");
       
        //read the count to the listener
        
        int c1=MyAttributeListener.getCount1();
        int c2=MyAttributeListener.getCount2();
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("Attribute added to request:"+c1);
        out.println("<br>");
        out.println("Attribute removed from request:"+c2);
        out.close();
        
        
	}

	
	
	
}
