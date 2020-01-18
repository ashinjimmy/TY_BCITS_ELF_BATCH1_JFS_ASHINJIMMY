package com.bcits.webservletapp.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "primary_employee_info")
public class PrimaryEmployeeInfo implements Serializable {

	@Id
	@Column
	private int empId;

	@Column
	private String empName;

	@Column
	private long empMobileNo;

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
	
	@Column
	private int managerId;
	
	@Column
	private int deptId;
	

}
