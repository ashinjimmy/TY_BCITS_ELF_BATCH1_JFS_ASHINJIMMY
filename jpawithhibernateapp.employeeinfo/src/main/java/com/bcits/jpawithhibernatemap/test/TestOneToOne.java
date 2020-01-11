package com.bcits.jpawithhibernatemap.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.onetoone.Employee_Secondary_Info;
import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;

public class TestOneToOne {

	public static void main(String[] args) {

		EntityTransaction transaction = null;
		EntityManager manager = null;

		EmployeePrimaryInfo test2 = new EmployeePrimaryInfo();

		test2.setEmp_id(290);
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
		
		Employee_Secondary_Info secondaryInfo = new Employee_Secondary_Info();
		secondaryInfo.setGender("Male");
		secondaryInfo.setGovt_id("Adhar Card");
		secondaryInfo.setGuardian_contactno(8989076543L);
        secondaryInfo.setGuardian_name("Sudha Varrier");
        secondaryInfo.setHouse_no(6754);
        secondaryInfo.setMartial_status("Married");
        secondaryInfo.setNationality("INDIA");
        secondaryInfo.setPersonal_emailid("samee897@gmail.com");
        secondaryInfo.setPrimary(test2);
        
		
		try {
			EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityMangerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(secondaryInfo);
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
