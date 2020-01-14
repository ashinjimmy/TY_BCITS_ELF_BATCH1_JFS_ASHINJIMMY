package com.bcits.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		EntityTransaction transaction = null;
		EntityManager manager = null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String jpql = " update EmployeePrimaryInfo set emp_name = 'Ranjan' where emp_id = 10 ";
			Query query = manager.createQuery(jpql);
			int count = query.executeUpdate();
			System.out.println("Number of row affected is === " + count);
			transaction.commit();	
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			manager.close();
		}

	}

}
