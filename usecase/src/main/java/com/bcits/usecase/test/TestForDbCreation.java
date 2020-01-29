package com.bcits.usecase.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.usecase.beans.EmployeeMaster;



public class TestForDbCreation {
	
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		EmployeeMaster primary = new EmployeeMaster();
		primary.setName("Mark");
		primary.setEmpId(100);
		primary.setDesignation("Admin");
		primary.setEmailId("mark10@gmail.com");
		primary.setPassword("Mark123#");

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(primary);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
	}

}
