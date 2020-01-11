package com.bcits.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountRecord {

	public static void main(String[] args) {
	

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager manager = entityManagerFactory.createEntityManager();
			String jpql = " select count(*) from EmployeePrimaryInfo ";
			Query query = manager.createQuery(jpql);
			Object count= query.getSingleResult();

			System.out.println("The total count is "+count);
				
				manager.close();

	

		}// End of the main


	}
