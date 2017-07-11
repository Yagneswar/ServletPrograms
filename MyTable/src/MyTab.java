import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class MyTab {

	public static void main(String[] args) {
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:dns","sinu","sinu");
			Statement st=con.createStatement();
			st.execute("create table myname(sroll (number),sname varchar2(30),saddress varchar2(80))");
			System.out.println("Table created");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("My err"+e);
		}

	}

}
