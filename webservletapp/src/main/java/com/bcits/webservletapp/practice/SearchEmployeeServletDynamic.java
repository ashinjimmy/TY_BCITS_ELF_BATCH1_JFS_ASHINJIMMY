package com.bcits.webservletapp.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.webservletapp.bean.PrimaryEmployeeInfo;

@WebServlet("/findEmployee")
public class SearchEmployeeServletDynamic extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Get the form data

		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		// Search record in the db

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = entityManagerFactory.createEntityManager();

		PrimaryEmployeeInfo info = manager.find(PrimaryEmployeeInfo.class, empId);

		// Generate dynamic response

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if (info != null) {

			out.print("<html>");
			out.print("<body>");

			out.println("<h1 style='color:green'>Employee ID " + empId + "Found <h1>");
			out.println("<br>Designation = " + info.getDesignation());
			out.println("<br>Name =  " + info.getEmpName());
			out.println("<br>Salary = " + info.getSalary());
			out.print("<br>Blood Group = " + info.getBloodGrp());
			out.print("<br>Employee ID = "+ info.getEmpId());
			out.print("<br> Manager Id = "+ info.getManagerId());

			out.print("</body>");
			out.print("</html>");

		} else {

			// dispaly empId not found

			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'> Employee Id " + empId + " Not Found!!! </h1>");
			out.println("</body>");
			out.println("</html>");

		}
		manager.close();
		entityManagerFactory.close();

	}

}
