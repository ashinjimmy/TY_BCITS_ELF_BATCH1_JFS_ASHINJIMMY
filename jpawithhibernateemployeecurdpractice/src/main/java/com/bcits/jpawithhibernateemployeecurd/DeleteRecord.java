package com.bcits.jpawithhibernateemployeecurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateemployee.bean.PrimaryInfo;

public class DeleteRecord {

	public static void main(String[] args) {

		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory enetityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = enetityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			PrimaryInfo info = manager.find(PrimaryInfo.class, 125);
			manager.remove(info);
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
