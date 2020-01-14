package com.bcits.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;

public class FindingName {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = " select emp_name from EmployeePrimaryInfo ";
		Query query = manager.createQuery(jpql);
		List<String> list = query.getResultList();

		for (String info : list) {
			System.out.println("-------------------------------------------------------");
			System.out.println(info);
			System.out.println("-------------------------------------------------------");
			
			manager.close();

		} // End of the loop

	}// End of the main

}// End of the class
