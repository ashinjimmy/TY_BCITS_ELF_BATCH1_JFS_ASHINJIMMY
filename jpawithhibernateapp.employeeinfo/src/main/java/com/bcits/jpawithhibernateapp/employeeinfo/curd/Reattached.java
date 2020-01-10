package com.bcits.jpawithhibernateapp.employeeinfo.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;

public class Reattached {

	public static void main(String[] args) {

		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, 215);
			System.out.println(manager.contains(info));
			manager.detach(info);
			System.out.println(manager.contains(info));
			EmployeePrimaryInfo reattached = manager.merge(info);
			reattached.setSalary(39000);
			System.out.println("Executed");
			System.out.println(manager.contains(reattached));
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
