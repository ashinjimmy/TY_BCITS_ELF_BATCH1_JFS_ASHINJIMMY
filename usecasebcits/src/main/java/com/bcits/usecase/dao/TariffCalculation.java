package com.bcits.usecase.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import com.bcits.usecase.beans.TariffMaster;

public class TariffCalculation {
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	public double billcomputation(double units, String typeOfConsumer) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from TariffMaster where typeOfConsumer =: type");
		query.setParameter("type", typeOfConsumer);
		
		 List<TariffMaster> tariffInfo = query.getResultList();
		 
		 long initialRange = tariffInfo.get(0).getTariffMasterPk().getRange();
		long midRange = tariffInfo.get(1).getTariffMasterPk().getRange();
		long finalRange = tariffInfo.get(2).getTariffMasterPk().getRange();
		
		double initialAmount = tariffInfo.get(0).getAmount();
		double midAmount = tariffInfo.get(1).getAmount();
		double finalAmount = tariffInfo.get(2).getAmount();
		
		double bill = 0.0;
		
		if(units <  initialRange ) {
			bill = units* initialAmount;
		} else if( units < midRange ) {
			bill = (initialRange  * initialAmount ) + ((units - initialRange)* midAmount);	
		} else if( units > finalRange ) {
			bill = (initialRange * initialAmount ) + ((midRange - initialRange) * midAmount) + ((units - midRange));
		}
			return bill;
		}
		
	}// End of class

