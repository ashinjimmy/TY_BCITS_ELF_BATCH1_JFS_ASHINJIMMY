package com.bcits.springsecuritymvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.jdbc.datasource.embedded.ConnectionProperties;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseConfigurer;
import org.springframework.stereotype.Repository;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean register(EmpInfoBean empInfoBean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();

		boolean isRegistered = false;

		try {
			tx.begin();
			manager.persist(empInfoBean);
			tx.commit();
			isRegistered = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isRegistered;
	}

	@Override
	public EmpInfoBean getEmployee(int empId) {

		EntityManager manager = factory.createEntityManager();
		EmpInfoBean empInfoBean = manager.find(EmpInfoBean.class, empId);

		manager.close();

		return empInfoBean;
	}

	@Override
	public List<EmpInfoBean> getAllEmployees() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from EmpInfoBean");
		List<EmpInfoBean> emList = query.getResultList();
		manager.close();

		return emList;
	}

}
