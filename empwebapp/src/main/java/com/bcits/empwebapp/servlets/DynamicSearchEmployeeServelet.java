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

import com.bcits.empwebapp.beans.PrimaryEmployeeInfo1;


@WebServlet("/findEmployee")
public class DynamicSearchEmployeeServelet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Get the form data
		
	
		
		//Search record in db
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		String jpql = " from PrimaryEmployeeInfo1";
		Query query = manager.createQuery(jpql);
		List<PrimaryEmployeeInfo1 >  primaryInfo = query.getResultList();
		//Generate Dynamic Response
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if( primaryInfo != null) {
			// display employee record 
			
			out.println("<html>");
			out.println("<body>");
			for (PrimaryEmployeeInfo1 primaryEmployeeInfo1 : primaryInfo) {
			out.println("<h1 style='color:green'>Employee  Found <h1>" );
			out.println("<br>Designation = "+ primaryEmployeeInfo1.getDesignation());
			out.println("<br>Name =  "+primaryEmployeeInfo1.getEmp_name());
			out.println("<br>Salary = "+primaryEmployeeInfo1.getSalary());
			}
			out.println("</body>");
			out.println("</html>");
			
			
		} else {
			
			// dispaly empId not found
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'> Employee Id Not Found!!! </h1>" );
			out.println("</body>");
			out.println("</html>");
			
		} 
		manager.close();
		emf.close();
		
	
	}

}
