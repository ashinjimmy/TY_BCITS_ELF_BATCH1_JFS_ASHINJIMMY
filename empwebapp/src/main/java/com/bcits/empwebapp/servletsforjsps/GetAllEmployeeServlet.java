package com.bcits.empwebapp.servletsforjsps;

import java.io.IOException;
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


@WebServlet("/seeAllEmployees")
public class GetAllEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = factory.createEntityManager();

		String jpql = " from PrimaryEmployeeInfo";

		Query query = manager.createQuery(jpql);

		List<PrimaryEmployeeInfo1> list = query.getResultList();
		req.setAttribute("employeeLists",list );
		req.getRequestDispatcher("").forward(req, resp);

		
	}//End of doGet()

}// Emd of class
