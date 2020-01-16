package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		String url = "./date.html"; //(dynamic resources)
		String url = "./currentDate"; //(static resources)
		
//		String url = "https://www.youtube.com"; // 404 (we cannot forward to external resources)
		
		/*
		 * PrintWriter out = resp.getWriter(); out.println("<html>");
		 * out.println("<body>"); out.print("<h2>Hello User </h2>");    // Not shown in the browser
		 * out.println("</body>"); out.println("</html>");
		 */

		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher(url);
		requestDispatcher.forward(req, resp);
	}//End of doGet()

}//End of class
