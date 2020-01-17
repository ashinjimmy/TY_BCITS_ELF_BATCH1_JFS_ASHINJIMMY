package com.bcits.jpawithhibernate.assignments;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.bean.PrimaryEmployeeInfo;

public class InsertRecord 
{
    public static void main( String[] args )
    {
    	
    		EntityManager manager = null;
    		EntityTransaction transaction = null;
    		PrimaryEmployeeInfo  primary = new PrimaryEmployeeInfo ();
    		primary.setEmpId(400);
    		primary.setEmpName("Anju");
    		primary.setEmpMobileno(8786598934L);
    		primary.setMailId("anjut@bcits.com");
    		primary.setDob(java.sql.Date.valueOf("1994-10-26"));
    		primary.setDoj(java.sql.Date.valueOf("2016-04-11"));
    		primary.setDesignation("Developer");
    		primary.setBloodGrp("B+ve");
    		primary.setSalary(37000);
    		primary.setDeptId(30);
    		primary.setManagerId(30);
    		primary.setPassword("an33");

    		try {
    			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
    			manager = entityManagerFactory.createEntityManager();
    			transaction = manager.getTransaction();
    			transaction.begin();
    			manager.persist(primary);
    			System.out.println("record saved");
    			transaction.commit();
    		} catch (Exception e) {
    			e.printStackTrace();
    			if (transaction != null) {
    				transaction.rollback();
    			}
    		} finally {
    			
    				manager.close();
    			
    		}
    	}
    }

