package com.bcits.webservletapp.practice2;

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




@WebServlet("/getAllEmployee")
public class RetrieveAllDetailServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = factory.createEntityManager();

		String jpql = " from PrimaryEmployeeInfo1";

		Query query = manager.createQuery(jpql);

		List<PrimaryEmployeeInfo1> list = query.getResultList();
		req.setAttribute("employeeLists",list );
		req.getRequestDispatcher("").forward(req, resp);

		
		PrintWriter out = resp.getWriter();

		if (session != null) {
			  
			if (list != null) {
				out.println("<html>");
				out.println("<body>");
				out.print("<h1> All Employee Deatils </h1>");
				out.println("<table");
				out.print("<tr>");
				out.println("<th> ID </th>");
				out.println("<th> Name </th>");
				out.println("<th> Salary </th>");
				out.println("<th> Designation </th>");
				out.println("<th> Number </th>");
				out.print("</tr");
				for (PrimaryEmployeeInfo1 primaryInfo : list) {
					out.print("<br><tr>");
					out.println("<td>" + primaryInfo.getEmpId() + "</td>");
					out.println("<td>" + primaryInfo.getEmpName() + "</td>");
					out.println("<td>" + primaryInfo.getSalary() + "</td>");
					out.println("<td>" + primaryInfo.getDesignation() + "</td>");
					out.println("<td>" + primaryInfo.getEmpMobileNo() + "</td>");
					out.print("<tr>");

				}
				out.println("</table");
				out.println("</body>");
				out.println("</html>");
			} else {
				out.println("<html>");
				out.println("<body>");
				out.println("<h1 style='color:red'> Employee Details Not Found<h1>");
				out.println("</body>");
				out.println("</html>");
			}
			manager.close();
			factory.close();
		} else {
			// back to login page
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'> Please Login First</h1>");
			out.println("</body>");
			out.println("</html>");

			req.getRequestDispatcher("./loginForm.html").include(req, resp);
		}
	}
}