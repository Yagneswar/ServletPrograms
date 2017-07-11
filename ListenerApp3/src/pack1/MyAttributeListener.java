package pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;


public class MyAttributeListener implements ServletRequestAttributeListener
{
    private static int count1,count2;
    
    public void attributeRemoved(ServletRequestAttributeEvent arg0) 
    { 
    	count1++;
    }

	
    public void attributeAdded(ServletRequestAttributeEvent arg0)  
    { 
    	count2++;
    }

	
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  
    
   {  }
    public static int getCount1()
	{
		return count1;
		
	}
	public static int getCount2()
	{
		return count2;
	}

	
}
