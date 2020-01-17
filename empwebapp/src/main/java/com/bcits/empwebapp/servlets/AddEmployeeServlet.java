package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

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

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Get the form 
		
		String empIdVal = req.getParameter("emp_id");
		String nameVal = req.getParameter("emp_name");
		String designationVal = req.getParameter("designation");
		String salaryVal = req.getParameter("salary");
		String mobileVal = req.getParameter("emp_mobileno");
		String password = req.getParameter("password");
		String dojVal = req.getParameter("doj");
		
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date doj = null;
		
		try {
			
			doj = dateFormat.parse(dojVal);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		PrimaryEmployeeInfo1 primaryInfo = new PrimaryEmployeeInfo1();
		
		primaryInfo.setEmpId(Integer.parseInt(empIdVal));
		primaryInfo.setEmp_name(nameVal);
		primaryInfo.setDesignation(designationVal);
		primaryInfo.setSalary(Double.parseDouble(salaryVal));
		primaryInfo.setPassword(password);
		primaryInfo.setEmp_mobileno(Long.parseLong(mobileVal));
		primaryInfo.setDoj(doj);
		
		
		//Store Employee Date in to db
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
				
		boolean isAdded = false;
		
		try {
			tx.begin();
			manager.persist(primaryInfo);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();	
			}
		manager.close();
		emf.close();
		
		PrintWriter out = resp.getWriter();
		
	
		if(isAdded) {
			//Employee added Successfully
			out.println("<h1 style='color:green'>Employeee Record for ID  "+empIdVal+"Inserted</h1>");
			
		} else {
			//Not added
			out.println("<h1 style='color:red'>Unable to add employee record!!</h1>");
			
		}
		out.println("</body>");
		out.println("</html>");
		
		
	}//End of doPost()

}//End of the class
