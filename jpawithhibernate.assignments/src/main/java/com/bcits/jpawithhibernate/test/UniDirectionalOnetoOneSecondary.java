package com.bcits.jpawithhibernate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.bean.PrimaryEmployeeInfo;
import com.bcits.jpawithhibernate.onetoone.SecondaryEmployeeInfo;

public class UniDirectionalOnetoOneSecondary {

	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		PrimaryEmployeeInfo primary = new PrimaryEmployeeInfo();
		SecondaryEmployeeInfo secondary = new SecondaryEmployeeInfo();

		primary.setEmpId(534);
		primary.setEmpName("Megha");
		primary.setEmpMobileno(6086525632L);
		primary.setMailId("mohan@bcits.com");
		primary.setDob(java.sql.Date.valueOf("1995-11-10"));
		primary.setDoj(java.sql.Date.valueOf("2018-04-20"));
		primary.setDesignation("Ass. Manager");
		primary.setBloodGrp("O+Ve");
		primary.setSalary(40000);
		primary.setDeptId(40);
		primary.setManagerId(10);

		secondary.setAge(24);
		secondary.setGender("Female");
		secondary.setGovtId("Adhar Card");
		secondary.setGuardianName("Prajval");
		secondary.setGuardianContact(8788912323l);
		secondary.setMartialStatus("Not Married");
		secondary.setNationality("India");
		secondary.setPersonalEmail("megha123@gmail.com");
		secondary.setPInfo(primary);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(secondary);
			// PrimaryEmployeeInfo info = manager.find(PrimaryEmployeeInfo.class, 199);
			/*
			 * System.out.println(info.getEmpId()); System.out.println(info.getEmpName());
			 * System.out.println("record saved");
			 */
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();

			transaction.rollback();

		} finally {

			manager.close();

		}
	}

}
