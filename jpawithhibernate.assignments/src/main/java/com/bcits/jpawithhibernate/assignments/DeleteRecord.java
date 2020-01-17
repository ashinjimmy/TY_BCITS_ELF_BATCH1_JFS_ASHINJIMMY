package com.bcits.jpawithhibernate.assignments;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.bean.PrimaryEmployeeInfo;

public class DeleteRecord {

	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			PrimaryEmployeeInfo info = manager.find(PrimaryEmployeeInfo.class, 182);
			manager.remove(info);
			transaction.commit();
			System.out.println("recored deleted");
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
