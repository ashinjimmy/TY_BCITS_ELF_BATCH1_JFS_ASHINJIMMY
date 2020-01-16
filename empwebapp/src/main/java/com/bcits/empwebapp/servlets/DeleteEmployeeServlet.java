package com.bcits.empwebapp.servlets;

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



@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Get the form data
		
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		//Search record in db
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		PrimaryEmployeeInfo1 primaryInfo = manager.find(PrimaryEmployeeInfo1.class, empId);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		//Generate Dynamic Response
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		if( primaryInfo != null) {
			// display employee record 
			manager.remove(primaryInfo);
			transaction.commit();
			
			out.println("<html>");
			out.println("<body>");
			
			out.println("<h1 style='color:red'> Record Deleted  <h1>" );
			
			out.println("</body>");
			out.println("</html>");
			
			
		} else {
			
			// dispaly empId not found
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>EmployeeID " + empId + " deleted </h1>" );
			out.println("</body>");
			out.println("</html>");
			
		} 
		manager.close();
		emf.close();
		
	
	}

}
