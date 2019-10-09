package com.durgasoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		String driver_name = context.getInitParameter("driver_name");
		String driver_url = context.getInitParameter("driver_url");
		String db_user =context.getInitParameter("db_user");
		String db_password = context.getInitParameter("bd_password");
		ServletConfig config = getServletConfig();
		String config_var1 = config.getInitParameter("config_var1");
		String context_name = context.getServletContextName();
		context.setAttribute("football", "butia");
		context.setAttribute("cricket","Sachin");
		String football = (String)context.getAttribute("football");
		String cricket = (String)context.getAttribute("cricket");
		String config1 = config.getServletName();
		Enumeration<String> e = context.getInitParameterNames();
		Enumeration<String> e1 = context.getAttributeNames();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<font size = '6' color = 'red'><b>Servlet context details</b></font>");
		out.println("<table border =1>");
		out.println("<tr><th> logical name </th><td>"+context_name+"</td><tr>");
		out.println("<tr><th cospan='2'><font size= '5' color='blue'><b> context parameter details </b></font></th><tr>");
		out.print("<tr><th> driver name<th><td>"+driver_name+"</td></tr>");
		out.print("<tr><th> driver url<th><td>"+driver_url+"</td></tr>");
		out.print("<tr><th> driver user<th><td>"+db_user+"</td></tr>");
		out.print("<tr><th> driver password<th><td>"+db_password+"</td></tr>");
		out.print("<tr><th> footballer name<th><td>"+football+"</td></tr>");
		out.print("<tr><th> cricketor<th><td>"+cricket+"</td></tr>");
		out.println("<tr><th cospan='2'><font size= '5' color='blue'><b> servlet parameter details </b></font></th><tr>");
		out.print("<tr><th> serlet paramter<th><td>"+config_var1+"</td></tr>");
		out.print("<tr><th> servlet logical name <th><td>"+config1+"</td></tr>");
		out.println("<center><body><htlml>");
		
		
		
	}

}
