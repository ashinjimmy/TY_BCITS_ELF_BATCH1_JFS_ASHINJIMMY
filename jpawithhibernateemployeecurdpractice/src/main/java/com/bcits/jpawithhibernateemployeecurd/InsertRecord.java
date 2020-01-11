package com.bcits.jpawithhibernateemployeecurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateemployee.bean.PrimaryInfo;

/**
 * Hello world!
 *
 */
public class InsertRecord {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;

		PrimaryInfo info = new PrimaryInfo();

		info.setEmp_id(125);
		info.setEmp_name("Akash");
		info.setEmp_mobileno(6598001234L);
		info.setBlood_group("A -ve");
		info.setDate_of_birth(java.sql.Date.valueOf("1997-04-23"));
		info.setDate_of_Join(java.sql.Date.valueOf("2019-12-30"));
		info.setOfficial_mailid("akash@gmail.com");
		info.setSalary(34000);
		info.setDept_id(10);
		info.setManager_id("4");
		info.setDesignation("Tester");

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

	}
}
