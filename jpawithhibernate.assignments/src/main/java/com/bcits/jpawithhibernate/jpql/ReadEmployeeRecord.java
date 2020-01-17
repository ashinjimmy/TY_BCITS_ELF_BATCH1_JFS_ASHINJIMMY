package com.bcits.jpawithhibernate.jpql;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernate.bean.PrimaryEmployeeInfo;

public class ReadEmployeeRecord {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager manager = factory.createEntityManager();
		String jpql = "from  PrimaryInfo ";
		Query query = manager.createQuery(jpql);
		List<PrimaryEmployeeInfo> list =query.getResultList();		
		for (PrimaryEmployeeInfo primaryInfo : list) {

			System.out.println("employee id              => "+ primaryInfo.getEmpId());
			System.out.println("employee name            => "+ primaryInfo.getEmpName());
			System.out.println("employee mail            => "+primaryInfo.getMailId());
			System.out.println("employee mobile number   => "+primaryInfo.getEmpMobileno());
			System.out.println("employee designation     => "+primaryInfo.getDesignation());
			System.out.println("employee salary          => "+primaryInfo.getSalary());
			System.out.println("employee date of birth   => "+primaryInfo.getDob());
			System.out.println("employee date of joining => "+primaryInfo.getDoj());
			System.out.println("employee department id   => "+primaryInfo.getDeptId());
			System.out.println("employee blood group     => "+primaryInfo.getBloodGrp());
			System.out.println("employee manager id      => "+primaryInfo.getManagerId());
		}
		manager.close();
	}
}
