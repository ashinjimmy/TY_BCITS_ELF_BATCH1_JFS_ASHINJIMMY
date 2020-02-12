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
import com.bcits.usecase.beans.MonthlyConsumptionPk;
import com.bcits.usecase.beans.PaymentDetailsBean;
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.beans.QueryMsgBeanPk;

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

		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createQuery(" from MonthlyConsumption where  "
					+ "monthlyConsumptionPk.rrNumber =: rrNumber order by currentReading DESC");
			query.setMaxResults(1);
			query.setParameter("rrNumber", rrNumber);
			BillHistoryBean billHistory = new BillHistoryBean();
			BillHistoryBeanPk billHistoryPk = new BillHistoryBeanPk();
			MonthlyConsumption monthlyConsumption = (MonthlyConsumption) query.getSingleResult();
			billHistory.setBillAmount(amount);
			billHistory.setStatus("Paid");
			billHistoryPk.setDateOfPayment(date);
			billHistoryPk.setRrNumber(rrNumber);
			billHistory.setBillHistory(billHistoryPk);
			monthlyConsumption.setStatus("Paid");
			manager.persist(billHistory);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}// End of payment()

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
	public List<BillHistoryBean>showBillHistory(String rrNumber) {
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

	@Override
	public ConsumerMasterBean getConsumer(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		ConsumerMasterBean consumerMasterBean = manager.find(ConsumerMasterBean.class, rrNumber);
		if (consumerMasterBean != null) {
			return consumerMasterBean;
		}
		return null;
	}

	@Override
	public List<MonthlyConsumption> showAllBillList(String region) {

		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(" from MonthlyConsumption where region =: region ");
		query.setParameter("region", region);
		List<MonthlyConsumption> billList = query.getResultList();
		if (billList != null) {
			return billList;
		}
		manager.close();
		return null;
	}// End of showAllBillList()

	@Override
	public List<QueryMsgBean> getResponse(String rrNumber) {
		EntityManager manager = factory.createEntityManager();

		try {
			Query query = manager.createQuery(" from QueryMsgBean where queryMsgPk.rrNumber =: rrNumber ");
			query.setParameter("rrNumber", rrNumber);
			List<QueryMsgBean> respQueryMsgList = query.getResultList();
			return respQueryMsgList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}//End of  getResponse()

	@Override
	public boolean setQuery(String request, String rrNumber, String region) {
System.out.println(request);
System.out.println(rrNumber);

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		QueryMsgBean msgBean = new QueryMsgBean();
		QueryMsgBeanPk msgBeanPk = new QueryMsgBeanPk();
		try {
			transaction.begin();
			msgBean.setRegion(region);
			msgBean.setQueryRequest(request);
			msgBeanPk.setRrNumber(rrNumber);
			msgBeanPk.setDate(new Date());
			msgBean.setQueryMsgPk(msgBeanPk);
			manager.persist(msgBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}//End of setQuery()
	
	@Override
	public double totalGeneratedBillAmount(String region) {
		double totalBillAmount = 0.0;
		EntityManager manager = factory.createEntityManager();

		try {
			Query query = manager
					.createQuery("select sum(billAmount) " + "from MonthlyConsumption where region =: region");
			query.setParameter("region", region);
			totalBillAmount = (double) query.getSingleResult();
		} catch (Exception e) {
			return 0;
		}
		if (totalBillAmount != 0) {
			return totalBillAmount;
		}
		return 0;
	}

	@Override
	public double collectedBillAmount(String region) {
		double collectedBillAmount = 0.0;
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createQuery(
					"  select sum(billAmount) from MonthlyConsumption"
					+ " where region =: region and status = 'Paid' ");
			query.setParameter("region", region);
			collectedBillAmount  = (double) query.getSingleResult();
		} catch (Exception e) {
			return 0;
		}
		if (collectedBillAmount  != 0) {
			return collectedBillAmount ;
		}
		return 0;
	}


}// End of Class