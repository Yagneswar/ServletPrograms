package com.sai.i18n;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class I18NServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String str=request.getParameter("lc");
		Locale locale=new Locale(str);
		ResourceBundle rb=ResourceBundle.getBundle("sai",locale);
		String value=rb.getString("msg");
		request.setAttribute("k", value);
		RequestDispatcher dis=request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);
		

	}

}
