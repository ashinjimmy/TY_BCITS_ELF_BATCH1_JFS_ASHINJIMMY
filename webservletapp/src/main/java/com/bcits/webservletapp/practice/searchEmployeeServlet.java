package com.bcits.webservletapp.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empIdVal = req.getParameter("empID");

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");

		out.print("<h1> Emp ID = " + empIdVal + "</h1>");
		out.print("Emp Name = Kohli <br>");
		out.print("Emp Age = 30 <br>");
		out.print("Salary = 1000000 <br>");
		out.print("Designation = SD");

		out.print("</body>");
		out.print("</html>");

	}

}
