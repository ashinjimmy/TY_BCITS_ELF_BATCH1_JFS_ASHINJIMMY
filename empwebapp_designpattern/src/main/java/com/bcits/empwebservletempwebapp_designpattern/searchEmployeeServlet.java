package com.bcits.empwebservletempwebapp_designpattern;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empIdVal = req.getParameter("empId");

		resp.setContentType("text/html");

		ServletContext context = getServletContext();
		String myContextParamVal = context.getInitParameter("appName");

		ServletConfig config = getServletConfig();
		String myConfigParamVal = config.getInitParameter("servletName");

		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1> Emp ID = " + empIdVal + "</h1>");
		out.print("Emp Name = Kohli <br>");
		out.print("Emp Age = 30 <br>");
		out.print("Salary = 1000000 <br>");
		out.print("Designation = SD");
		out.println("<h2> Application Name = " + myContextParamVal);
		out.println("<h2> Servlet Name = " + myConfigParamVal);
		out.print("</body>");
		out.print("</html>");

	}// End of doGet()

}// End of Class
