package com.bcits.jpawithhibernateapp.jql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernateapp.bean.Test;

public class ReadEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager =entityManagerFactory.createEntityManager();
		String jpql = "from Test";
		Query query = manager.createQuery(jpql);
		List<Test> list = query.getResultList();
		
		for (Test test : list) {
			
			System.out.println("-------------------------------------------------------");
			
			System.out.println("Movie ID ----> " +test.getM_id());
			System.out.println("Movie Name ---> " + test.getM_name());
			System.out.println("Employee Mobile number ----> " + test.getM_rating());
			

			System.out.println("-------------------------------------------------------");
			
			manager.close();
			
		}
		

	}//End of the main

}//End of the class
