package pack1;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

    private int count=0;
    public void sessionCreated(HttpSessionEvent arg0)  
    { 
    	count++;
    	System.out.println("At present number of session in server is:"+count);
    	
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0) 
    { 

    	count--;
    	System.out.println("At present number of session in server is:"+count);

    }
	
}
