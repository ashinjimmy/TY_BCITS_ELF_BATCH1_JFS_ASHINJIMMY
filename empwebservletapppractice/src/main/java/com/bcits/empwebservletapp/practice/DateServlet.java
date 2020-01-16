package com.bcits.empwebservletapp.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Date date = new Date();
		
		//Code to generate dynamic response
		
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
		
		PrintWriter out =  resp.getWriter();
		out.print("<html>");
		out.print("<Body>");
		out.println("<h1> Current System Date & Time is :-"+date+"</h1>");
		out.print("</Body>");
		out.print("</html>");
	}

}
