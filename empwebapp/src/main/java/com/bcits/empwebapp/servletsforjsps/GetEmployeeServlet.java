package com.bcits.empwebapp.servletsforjsps;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.beans.PrimaryEmployeeInfo1;

@WebServlet("/getEmp")
public class GetEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPeristenceUnit");
		EntityManager manager = factory.createEntityManager();

		PrimaryEmployeeInfo1 info = manager.find(PrimaryEmployeeInfo1.class, empId);
		
		req.setAttribute("empInfo", info);
 
		manager.close();
		factory.close();
		
		req.getRequestDispatcher("./searchEmployee.jsp").forward(req, resp);
		
	}//End of doGet()

}//End of class
