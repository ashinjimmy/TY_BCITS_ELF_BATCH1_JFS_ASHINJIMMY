package com.bcits.usecase.bean.tables;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "Bill_History")
public class BillHistory implements Serializable {
	@EmbeddedId
	private BillHistoryCK billHistory;
	@Column
	private double initialReadingUnits;
	@Column
	private double finalReadingUnits;
	@Column
	private double totalUnits;
	@Column
	private double billAmount;
	@Column
	private Date issueDate;
	@Column
	private Date dueDate;
	@Column
	private String status;
}
