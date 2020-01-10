package com.bcits.jpawithhibernateapp.employeeinfo.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;

public class DeleteEmployee {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager manager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo primaryinfo = manager.find(EmployeePrimaryInfo.class, 230);
			manager.remove(primaryinfo);
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
