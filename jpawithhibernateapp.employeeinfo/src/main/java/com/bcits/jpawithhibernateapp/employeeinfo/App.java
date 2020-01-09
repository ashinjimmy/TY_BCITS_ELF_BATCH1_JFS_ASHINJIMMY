package com.bcits.jpawithhibernateapp.employeeinfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.employeeinfo.bean.Test2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	Test2 test2 = new Test2();
    	
    	test2.setEmp_id(210);
    	test2.setEmp_name("Athree");
    	test2.setEmp_mobileno(7890456312l);
    	test2.setMailId("athree123@gmail.com");
    	test2.setDob(java.sql.Date.valueOf("1992-05-04"));
    	test2.setDoj(java.sql.Date.valueOf("2012-06-04"));
    	test2.setDesignation("Analyst");
    	test2.setBloodgrp("O +ve");
    	test2.setDept_id(30);
    	test2.setManager_id(3);
    	test2.setSalary(24000);
    	
    	EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityMangerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(test2);
		System.out.println("Record Saved");
		transaction.commit();
		manager.close();
    	
    	
    }
}
