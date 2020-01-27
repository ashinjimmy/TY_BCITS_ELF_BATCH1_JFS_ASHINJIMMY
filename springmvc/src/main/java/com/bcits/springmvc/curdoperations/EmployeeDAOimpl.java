 package com.bcits.springmvc.curdoperations;

 import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcits.springmvc.beans.EmployeeInfoBean;

@Repository
public class EmployeeDAOimpl implements EmployeeDAO {

	/*
	 * private EntityManagerFactory emf =
	 * Persistence.createEntityManagerFactory("springPersistenceUnit");
	 */
	
	
	
	 @PersistenceUnit // in case of not working put @AutoWired private
	  EntityManagerFactory emf;
	 

	/*
	 * @PersistenceUnitContex private EntityManager manager;
	 */
	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {

		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		boolean isAdded = false;

		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();

		return isAdded;
	}

	@Override
	public boolean deleteEmployee(Integer empId) {

		boolean isDeleted = false;
		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean info = manager.find(EmployeeInfoBean.class, empId);

		if (info != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(info);
			transaction.commit();
			isDeleted = true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public EmployeeInfoBean getEmployee(Integer empId) {

		EntityManager manager = emf.createEntityManager();

		EmployeeInfoBean info = manager.find(EmployeeInfoBean.class, empId);

		manager.close();
		if (info != null) {
			return info;
		}
		return null;
	}

	@Override
	public List<EmployeeInfoBean> getallEmployees() {

		EntityManager manager = emf.createEntityManager();
		String jpql = " from EmployeeInfoBean ";
		Query query = manager.createQuery(jpql);
		List<EmployeeInfoBean> list = query.getResultList();
		manager.close();
		if (list != null) {
			return list;

		} else {
			return null;
		}
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean emBean) {
		boolean isUpdated = false;

		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			
			EmployeeInfoBean info = manager.find(EmployeeInfoBean.class,emBean.getEmpId());
			if(!emBean.getEmpName().isEmpty()) {
				info.setEmpName(emBean.getEmpName());
			}
			info.setSalary(emBean.getSalary());
			info.setEmpMobileno(emBean.getEmpMobileno());
			info.setDesignation(emBean.getDesignation());
			info.setEmpName(emBean.getEmpName());
			info.setBloodgrp(emBean.getBloodgrp());
			info.setDob(emBean.getDob());
			info.setDoj(emBean.getDoj());
			info.setEmpId(emBean.getEmpId());
			info.setDeptId(emBean.getDeptId());
			info.setMailId(emBean.getMailId());
			info.setManagerId(emBean.getManagerId());
			info.setPassword(emBean.getPassword());
			
			transaction.commit();
			isUpdated = true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();	
		}
		return isUpdated;
		
	}

	@Override
	public EmployeeInfoBean authenticate(Integer empId, String password) {
	EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);

		if (employeeInfoBean != null && employeeInfoBean.getPassword().equals(password)) {
			return employeeInfoBean;
		} else {

			return null;
		}
	}// End of authenticate()
}// End of class
