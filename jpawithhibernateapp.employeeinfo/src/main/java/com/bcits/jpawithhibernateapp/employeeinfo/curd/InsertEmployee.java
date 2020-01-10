package com.bcits.jpawithhibernateapp.employeeinfo.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;

/**
 * Hello world!
 *
 */
public class InsertEmployee {
	public static void main(String[] args) {

		EntityTransaction transaction = null;
		EntityManager manager = null;

		EmployeePrimaryInfo test2 = new EmployeePrimaryInfo();

		test2.setEmp_id(230);
		test2.setEmp_name("Sameer");
		test2.setEmp_mobileno(7890456312l);
		test2.setMailId("samee123@gmail.com");
		test2.setDob(java.sql.Date.valueOf("1995-05-04"));
		test2.setDoj(java.sql.Date.valueOf("2019-06-04"));
		test2.setDesignation("Analyst");
		test2.setBloodgrp("O+ve");
		test2.setDept_id(30);
		test2.setManager_id(3);
		test2.setSalary(14000);

		try {
			EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityMangerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(test2);
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
