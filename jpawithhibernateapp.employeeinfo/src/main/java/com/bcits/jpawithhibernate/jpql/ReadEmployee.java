package com.bcits.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;

public class ReadEmployee {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmployeePrimaryInfo";
		Query query = manager.createQuery(jpql);
		List<EmployeePrimaryInfo> list = query.getResultList();

		for (EmployeePrimaryInfo info : list) {

			System.out.println("-------------------------------------------------------");
			System.out.println("Employee ID ----> " + info.getEmp_id());
			System.out.println("Employee Name ---> " + info.getEmp_name());
			System.out.println("Employee Mobile number ----> " + info.getEmp_mobileno());
			System.out.println("Employee Salary ---> " + info.getSalary());
			System.out.println("Employee Designation ---> " + info.getDesignation());
			System.out.println("Employee DeptID  ---> " + info.getDept_id());
			System.out.println("Employee mailID ---> " + info.getMailId());
			System.out.println("Employee managerID ---> " + info.getManager_id());

			System.out.println("-------------------------------------------------------");

			manager.close();

		} // End of the loop

	}// End of the main

}// End of the class
