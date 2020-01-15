package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.beans.PrimaryEmployeeInfo1;


@WebServlet("/findEmployee")
public class SearchEmployeeServelet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Get the form data
		
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		//Search record in db
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		PrimaryEmployeeInfo1 primaryInfo = manager.find(PrimaryEmployeeInfo1.class, empId);
		
		//Generate Dynamic Response
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if( primaryInfo != null) {
			// display employee record 
			
			out.println("<html>");
			out.println("<body>");
			
			out.println("<h1 style='color:green'>Employee ID "+ empId + "Found <h1>" );
			out.println("<br>Designation = "+primaryInfo.getDesignation());
			out.println("<br>Name =  "+primaryInfo.getEmp_name());
			out.println("<br>Salary = "+primaryInfo.getSalary());
			out.println("</body>");
			out.println("</html>");
			
			
		} else {
			
			// dispaly empId not found
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'> Employee Id " + empId +" Not Found!!! </h1>" );
			out.println("</body>");
			out.println("</html>");
			
		} 
		manager.close();
		emf.close();
		
	
	}

}
