package com.bcits.jpawithhibernate.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Cleanup;
import lombok.Data;

@Data
@Entity
@Table(name = "primaryEmployeeInfo")
public class PrimaryEmployeeInfo implements Serializable {
	

	@Id
	@Column
	private int empId;
	
	@Column
	private int deptId;
	
	@Column
	private int managerId;

	@Column
	private String empName;

	@Column
	private long empMobileno;

	@Column
	private String mailId;

	@Column
	private Date dob;

	@Column
	private Date doj;

	@Column
	private String designation;

	@Column
	private String bloodGrp;

	@Column
	private double salary;
	
	@Column
	private String password;
	
	

}
