package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.empwebapp.beans.PrimaryEmployeeInfo1;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Get the form data
		
		int empIdVal = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		
		String jpql = "from PrimaryEmployeeInfo1 where empId =:empId and password =:pwd";
		Query query = manager.createQuery(jpql);
		query.setParameter("empId", empIdVal);
		query.setParameter("pwd", password);
		
		PrimaryEmployeeInfo1 primaryEmployeeInfo1 = null;
		try {
			primaryEmployeeInfo1 = (PrimaryEmployeeInfo1) query.getSingleResult();
		} catch (Exception e) {
		  e.printStackTrace();
		}
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		if(primaryEmployeeInfo1 != null) {
			// Valid Credentials
			//Create the Session
			
			HttpSession session = req.getSession(true);
			session.setMaxInactiveInterval(60); // time in sec For the  automatic session out
			
			session.setAttribute("primarInfo",primaryEmployeeInfo1);
			
			out.println("<h1 style='color:Navy'>Welcome "+ primaryEmployeeInfo1.getEmp_name()+"</h1>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("./employeeHome.html");
			dispatcher.include(req, resp);
		} else {
			//Invalid Creden tials
			
			out.println("<h1 style='color:red'>Invalid Creditionals!! </h1>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);
		}
		
		out.println("</body>");
		out.println("</html>");
		
		manager.close();
		emf.close();
		
	}//End of doPost()

}//End of Class
