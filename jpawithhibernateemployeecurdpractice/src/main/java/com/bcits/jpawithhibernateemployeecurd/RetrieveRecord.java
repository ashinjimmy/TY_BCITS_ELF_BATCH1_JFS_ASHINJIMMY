package com.bcits.jpawithhibernateemployeecurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateemployee.bean.PrimaryInfo;

public class RetrieveRecord {

	public static void main(String[] args) {
		
		EntityManager manager = null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		manager = entityManagerFactory.createEntityManager();
		PrimaryInfo info = manager.find(PrimaryInfo.class, 10);
	     
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Employee ID ----> " + info.getEmp_id());
		System.out.println("Employee Name ---> " + info.getEmp_name());
		System.out.println("Employee Mobile number ----> " + info.getEmp_mobileno());
		System.out.println("Employee Salary ---> " + info.getSalary());
		System.out.println("Employee Designation ---> " + info.getDesignation());
		System.out.println("Employee DeptID  ---> " + info.getDept_id());
		System.out.println("Employee mailID ---> " + info.getOfficial_mailid());
		System.out.println("Employee managerID ---> " + info.getManager_id());

		System.out.println("-------------------------------------------------------");
		
		manager.close();
}

}
