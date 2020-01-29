package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "monthlyConsumption")
public class MonthlyConsumption implements Serializable {
	@Id
	@Column
	private int rrNumber;
	@Column
	private long initialReadingUnits;
	@Column
	private long finalReadingUnits;
	@Column
	private int totalUnits;
	@Column
	private String status;

}
