package com.bcits.jpawithhibernate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.bean.PrimaryEmployeeInfo;
import com.bcits.jpawithhibernate.onetoone.UnidirectionalEmployeeBankInfo;

public class OneToOneBankInfo {

	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		PrimaryEmployeeInfo primary = new PrimaryEmployeeInfo();
		UnidirectionalEmployeeBankInfo bankInfo = new UnidirectionalEmployeeBankInfo();

		primary.setEmpId(367);
		primary.setEmpName("Maya");
		primary.setEmpMobileno(6887992898L);
		primary.setMailId("maya@google.com");
		primary.setDob(java.sql.Date.valueOf("1996-02-13"));
		primary.setDoj(java.sql.Date.valueOf("2019-03-12"));
		primary.setDesignation("HR");
		primary.setBloodGrp("A-Ve");
		primary.setSalary(13000);
		primary.setDeptId(30);
		primary.setManagerId(20);

		bankInfo.setBankName("SYNDICATE Bank");
		bankInfo.setBranchName("Banglore");
		bankInfo.setAccountNo(33990719410L);
		bankInfo.setIfscCode("SYN00891188");
		bankInfo.setPrimaryInfo(primary);
//		primary.setBankInfo(bankInfo);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(bankInfo);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();

			transaction.rollback();

		} finally {

			manager.close();

		}
	}

}
