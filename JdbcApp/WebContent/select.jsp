<%@page import="java.io.IOException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<html>
<head>
</head>
<body>
<form>
Select EmpId:<input type="text" name="T1">
<input type="submit" value="search">
</form>
</body>
</html>

<%
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
				
		}
		
		rs.close();
		ps.close();
		con.close();
		
		}
		
		
		catch(Exception e)
		{
         			
              
			   out.println(e);
		  
		 
		}
		
	



%>

