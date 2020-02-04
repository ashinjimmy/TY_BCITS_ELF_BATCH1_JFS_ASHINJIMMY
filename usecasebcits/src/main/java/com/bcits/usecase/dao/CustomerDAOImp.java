package com.bcits.usecase.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.BillHistoryBeanPk;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.PaymentDetailsBean;

@Repository
public class CustomerDAOImp implements CustomerDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean consumerSignUp(ConsumerMasterBean consumerBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;

		try {
			transaction.begin();
			manager.persist(consumerBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}// end of consumerSignUp method

	@Override
	public ConsumerMasterBean consumerLogin(String emailId, String password) {
		EntityManager manager = factory.createEntityManager();
//		System.out.println(emailId + password);
		Query query = manager.createQuery(" from ConsumerMasterBean where emailId= :email ");
		query.setParameter("email", emailId);
		ConsumerMasterBean InfoBean = (ConsumerMasterBean) query.getSingleResult();
		if (InfoBean != null && InfoBean.getPassword().equals(password)) {
			return InfoBean;
		}
		return null;

	}// end of consumerLogin method


	@Override
	public boolean payment(String rrNumber, Date date, double amount) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		BillHistoryBean billHistory = new BillHistoryBean();
		BillHistoryBeanPk  billHistoryPk = new BillHistoryBeanPk();
		billHistory.setBillAmount(amount);
		billHistory.setStatus("Paid Success!");
	    billHistoryPk.setDateOfPayment(date);
		billHistoryPk.setRrNumber(rrNumber);
		billHistory.setBillHistory(billHistoryPk);
		if (billHistoryPk != null) {
			transaction.begin();
			manager.persist(billHistory);
			transaction.commit();
			return true;
		} 
			return false;
	}

	@Override
	public CurrentBillBean showCurrentBill(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		CurrentBillBean currentBillBean = manager.find(CurrentBillBean.class, rrNumber);
		if (currentBillBean != null) {
			return currentBillBean;
		}
		manager.close();
		return null;

	}

	@Override
	public List<BillHistoryBean> showBillHistory(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from BillHistoryBean where rr_Number =:  rrNumber");
		query.setParameter("rrNumber", rrNumber);
		List<BillHistoryBean> billHistoryMaster = query.getResultList();
		if (billHistoryMaster != null) {
			return billHistoryMaster;
		}
		manager.close();
		return null;
	}// End of showBillHistory()

	@Override
	public List<MonthlyConsumption> monthlyConsumption(String rrNumber) {

		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from MonthlyConsumption where rr_Number =: rrNumber");
		query.setParameter("rrNumber", rrNumber);
		List<MonthlyConsumption> monthlyConsumptionList = query.getResultList();

		if (monthlyConsumptionList != null) {
			return monthlyConsumptionList;
		}
		manager.close();
		return null;
	}// End of monthlyConsumption()

}// End of Class