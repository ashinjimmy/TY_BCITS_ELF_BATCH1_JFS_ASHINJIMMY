package com.bcits.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.bean.Test;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Test test = new Test();
		test.setM_id(1);
		test.setM_name("Bahubali");
		test.setM_rating("Best");

		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityMangerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(test);
		System.out.println("Record Saved");
		transaction.commit();
		manager.close();
	}// End of the Main
}// End of the Class
