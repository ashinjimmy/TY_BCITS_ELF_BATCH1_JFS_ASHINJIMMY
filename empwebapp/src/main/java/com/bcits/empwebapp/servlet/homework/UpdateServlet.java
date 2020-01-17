package com.bcits.empwebapp.servlet.homework;

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

import com.bcits.empwebapp.beans.PrimaryEmployeeInfo1;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		PrimaryEmployeeInfo1 employeePrimaryInfo = manager.find(PrimaryEmployeeInfo1.class, empId);

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		if (employeePrimaryInfo == null) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Employee details for empId " + empId + " not found <h1>");
			out.println("</body>");
			out.println("</html>");
		} else {
			employeePrimaryInfo.setSalary(45000);
			transaction.commit();

			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Employee record for " + empId + " is updated <h1>");
			out.println("</body>");
			out.println("</html>");
		}
		manager.close();
		entityManagerFactory.close();
	}
}
