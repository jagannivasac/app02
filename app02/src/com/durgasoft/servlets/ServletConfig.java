package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
        javax.servlet.ServletConfig config = getServletConfig();
	    String lname  = config.getServletName();
	    String driver_url = config.getInitParameter("Driver_url");
	    String driver_name = config.getInitParameter("driver_name");
	    String user = config.getInitParameter("user");
	    String password = config.getInitParameter("password");
	    out.println("<html>");
	    out.println("<body>");	
	    out.println("<table border= '1'>");
	    out.print("<th><colspan='2'> <fount color= 'red' size = '6'>servletConfig Details</th>");
	    out.println("<tr><th> servlet logical</th><td>"+lname+"</td></tr>");
	    out.print("<tr><th> driver_name</th><td>"+driver_name+ "</td><tr>");
	    out.print("<tr><th>driver url</th><td>"+driver_url+"</td><tr>");
	    out.print("<tr><th>user name</th><td>"+user+"</td></tr>");
	    out.print("<tr><th> password</th><td>"+password+"</td></tr>");
	    
	    out.println("</body>");
	    out.println("</html>");

	}
}
