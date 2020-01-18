package com.bcits.webservletapp.practice2;

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

import com.bcits.webservletapp.bean.PrimaryEmployeeInfo;

@WebServlet("/addEmployee")
public class AddEmployee extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get the form data
		String empIdVal = req.getParameter("empId");
		String nameVal = req.getParameter("empName");
		String bloodGroupVal = req.getParameter("bloodGrp");
		String deptIdVal = req.getParameter("deptId");
		String designationVal = req.getParameter("designation");
		String dobVal = req.getParameter("dob");
		String dojVal = req.getParameter("doj");
		String managerIdVal = req.getParameter("managerId");
		String mobileNumberVal = req.getParameter("empMobileNo");
		String mailIdVal = req.getParameter("mailId");
		String passwordVal = req.getParameter("password");
		String salaryVal = req.getParameter("salary");

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = null;
		Date doj = null;

		try {

			dob = dateFormat.parse(dobVal);
			doj = dateFormat.parse(dojVal);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		PrimaryEmployeeInfo employeePrimaryInfo = new PrimaryEmployeeInfo();
		employeePrimaryInfo.setBloodGrp(bloodGroupVal);
		employeePrimaryInfo.setDeptId(Integer.parseInt(deptIdVal));
		employeePrimaryInfo.setDesignation(designationVal);
		employeePrimaryInfo.setDob(dob);
		employeePrimaryInfo.setDoj(doj);
		employeePrimaryInfo.setEmpId(Integer.parseInt(empIdVal));
		employeePrimaryInfo.setManagerId(Integer.parseInt(managerIdVal));
		employeePrimaryInfo.setEmpMobileNo(Long.parseLong(mobileNumberVal));
		employeePrimaryInfo.setEmpName(nameVal);
		employeePrimaryInfo.setMailId(mailIdVal);
		employeePrimaryInfo.setPassword(passwordVal);
		employeePrimaryInfo.setSalary(Double.parseDouble(salaryVal));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(employeePrimaryInfo);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		emf.close();

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		if (isAdded) {
			// Employee added successfully
			out.println("<h1 style='color:green'>Employee with ID " + empIdVal + " Added-</h1>");
		} else {
			// Not added
			out.println("<h1 style='color:red'>Unable to add");
		}
		out.println("</body>");
		out.println("</html>");

	}

}
