package com.bcits.jpawithhibernateapp.employeeinfo.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;

public class RetrieveEmployee {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();

//		EmployeePrimaryInfo info = manager.getReference(EmployeePrimaryInfo.class, 10);
		
		EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, 12310);
//		System.out.println(info.getName() );
		
//		System.out.println(info.getClass());
		


		/*
		 * System.out.println("Employee ID ----> " + info.getEmp_id());
		 * System.out.println("Employee Name ---> " + info.getEmp_name());
		 * System.out.println("Employee Mobile number ----> " + info.getEmp_mobileno());
		 * System.out.println("Employee Salary ---> " + info.getSalary());
		 * System.out.println("Employee Designation ---> " + info.getDesignation());
		 * System.out.println("Employee DeptID  ---> " + info.getDept_id());
		 * System.out.println("Employee mailID ---> " + info.getMailId());
		 * System.out.println("Employee managerID ---> " + info.getManager_id());
		 */

		System.out.println("-------------------------------------------------------");
		manager.close();
	}// End of the main

}// End of the class
