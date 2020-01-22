package com.bcits.usecase.bean.tables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Monthly_Consumption")
public class MonthlyConsumption implements Serializable {
	
	
	private long initialReadingUnits;
	@Column
	private long finalReadingUnits;
	@Column
	private int totalUnits;
	@EmbeddedId
	@Column
	private  MonthlyConsumptionCK  monthlyConsumptionCK;
}
