package com.bcits.jpawithhibernateemployeecurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateemployee.bean.PrimaryInfo;

public class UpdateRecord {

	public static void main(String[] args) {

		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			PrimaryInfo info = manager.find(PrimaryInfo.class, 10);
			info.setSalary(22000);
			transaction.commit();
			System.out.println("Record Updated");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

	}

}
