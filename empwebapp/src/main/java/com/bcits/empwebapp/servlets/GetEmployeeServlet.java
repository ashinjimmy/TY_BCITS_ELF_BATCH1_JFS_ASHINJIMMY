package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.empwebapp.beans.PrimaryEmployeeInfo1;

@WebServlet("/getEmployee")
public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Validate the Session
		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if (session != null) {
			// Validation Session
			// Get the form Data

			// Search record in db

			int empId = Integer.parseInt(req.getParameter("empId"));
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			EntityManager manager = emf.createEntityManager();

			PrimaryEmployeeInfo1 primaryInfo = manager.find(PrimaryEmployeeInfo1.class, empId);

			// Generate Dynamic Response

			if (primaryInfo != null) {
				// display employee record
				PrimaryEmployeeInfo1 loggedIn = (PrimaryEmployeeInfo1) session.getAttribute("primarInfo");

				out.println("<html>");
				out.println("<body>");
				out.println("<h1>Hello " + loggedIn.getEmp_name() + "!</h1>");

				out.println("<h1 style='color:green'>Employee Found <h1>");
				out.println("<br>Designation = " + primaryInfo.getDesignation());
				out.println("<br>Name =  " + primaryInfo.getEmp_name());
				out.println("<br>Salary = " + primaryInfo.getSalary());

				out.println("</body>");
				out.println("</html>");

			} else {

				// dispaly empId not found

				out.println("<html>");
				out.println("<body>");
				out.println("<h1 style='color:red'> Employee Id Not Found!!! </h1>");
				out.println("</body>");
				out.println("</html>");

			}
			manager.close();
			emf.close();

		} else {

			// Invalid Session

			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'> Please Login </h1>");
			out.println("</body>");
			out.println("</html>");

			req.getRequestDispatcher("./loginForm.html").include(req, resp);

		}

	} // End of the doGet()
}// End of the Class
