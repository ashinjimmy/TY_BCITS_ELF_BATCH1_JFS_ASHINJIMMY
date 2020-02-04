package com.bcits.usecase.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImp implements EmployeeDAO{
	
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean employeeLogin(int empId, String password) {
	
		return false;
	}

}
