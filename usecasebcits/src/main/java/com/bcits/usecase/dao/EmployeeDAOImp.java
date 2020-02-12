package com.bcits.usecase.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.MonthlyConsumptionPk;
import com.bcits.usecase.beans.QueryMsgBean;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Autowired
	private TariffCalculation tariffCalculationMaster;

	@Override
	public EmployeeMasterBean empAuthentication(int empId, String password) {
		EntityManager manager = factory.createEntityManager();
		EmployeeMasterBean employeeMasterBean = manager.find(EmployeeMasterBean.class, empId);
		if (employeeMasterBean != null) {
			return employeeMasterBean;
		}
		return null;
	}// End of empAuthentication()

	@Override
	public long numberOfConsumers(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select count(*) from ConsumerMasterBean where region =: region ";
		Query query = manager.createQuery(jpql);
		query.setParameter("region", region);
		long number = (long) query.getSingleResult();
		if (number != 0) {
			return number;
		}
		return 0;
	}// End of numberOfConsumers()

	@Override
	public List<ConsumerMasterBean> showAllConsumerDetails(String region) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from ConsumerMasterBean where region =: region");
		query.setParameter("region", region);
		List<ConsumerMasterBean> consumerList = (List<ConsumerMasterBean>) query.getResultList();
		System.out.println(consumerList);
		if (consumerList != null) {
			return consumerList;
		}

		return null;
	}

	@Override
	public boolean addCurrentBill(CurrentBillBean currentBillBean) {

		double units = currentBillBean.getCurrentReading() - currentBillBean.getPreviousReading();
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		MonthlyConsumption monthlyConsumption = new MonthlyConsumption();
		MonthlyConsumptionPk monthlyConsumptionPk = new MonthlyConsumptionPk();

		ConsumerMasterBean conMasterBean = manager.find(ConsumerMasterBean.class, currentBillBean.getRrNumber());

		double billAmount = tariffCalculationMaster.billcomputation(units, currentBillBean.getTypeOfConsumer());

		try {
			transaction.begin();
			CurrentBillBean bill = manager.find(CurrentBillBean.class, currentBillBean.getRrNumber());
			if (bill != null) {
				manager.remove(bill);
			}
			monthlyConsumption.setBillAmount(billAmount);
			monthlyConsumption.setPrevReading(currentBillBean.getPreviousReading());
			monthlyConsumption.setCurrentReading(currentBillBean.getCurrentReading());
			monthlyConsumption.setTotalUnits(units);
			monthlyConsumption.setRegion(conMasterBean.getRegion());

			monthlyConsumption.setStatus("Not Paid");
			monthlyConsumption.setMonthlyConsumptionPk(monthlyConsumptionPk);
			monthlyConsumptionPk.setDate(new Date());
			monthlyConsumptionPk.setRrNumber(currentBillBean.getRrNumber());
			currentBillBean.setBillAmount(billAmount);
			currentBillBean.setTotalUnits(units);
			currentBillBean.setIssueDate(new Date());
			manager.persist(monthlyConsumption);
			manager.persist(currentBillBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}// End of addCurrentBill()

	@Override
	public ConsumerMasterBean getConsumer(String rrNumber) {

		EntityManager manager = factory.createEntityManager();
		ConsumerMasterBean consumerBean = manager.find(ConsumerMasterBean.class, rrNumber);
		if (consumerBean != null) {
			return consumerBean;
		}
		manager.close();
		return null;
	}

	@Override
	public double getIntialReading(String rrNumber) {
		System.out.println(rrNumber);
		EntityManager manager = factory.createEntityManager();
		double initialReading;

		try {
			Query query = manager.createQuery(
					"select currentReading from MonthlyConsumption where monthlyConsumptionPk.rrNumber =: rrNumber "
							+ "order by currentReading desc");
			query.setMaxResults(1);
			query.setParameter("rrNumber", rrNumber);
			initialReading = (double) query.getSingleResult();
		} catch (Exception e) {
			return 0;
		}
		if (initialReading != 0) {
			return initialReading;
		}
		return 0;

	}

	@Override
	public List<QueryMsgBean> getQueryList(String region) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createQuery(" from QueryMsgBean where region = :region ");
			query.setParameter("region", region);
			List<QueryMsgBean> queryList = query.getResultList();
			if (queryList == null && queryList.isEmpty()) {
				return null;
			}
			return queryList;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean sendRespond(String rrNumber, String response, Date date) {
		System.out.println(response);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createQuery(" from QueryMsgBean where queryMsgPk.rrNumber= :num and DATE(queryMsgPk.date)=:date ");
			query.setParameter("num", rrNumber);
			query.setParameter("date", date);
			QueryMsgBean queryBean = (QueryMsgBean) query.getSingleResult();
			queryBean.setQueryResponse(response);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
}// End of class
