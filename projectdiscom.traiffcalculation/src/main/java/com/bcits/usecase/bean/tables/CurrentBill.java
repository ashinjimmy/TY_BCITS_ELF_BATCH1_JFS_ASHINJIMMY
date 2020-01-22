package com.bcits.usecase.bean.tables;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Current_Bill")
public class CurrentBill implements Serializable {
	@Id
	@Column
	private int rrNumber;
	@Column
	private long initialReadingUnits;
	@Column
	private long finalReadingUnits;
	@Column
	private int consumptionInUnits;
	@Column
	private Date generatedDate;
	@Column
	private Date dueDate;
	@Column
	private double billAmount;
}
