package com.bcits.springmvc.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;


@Data
@Entity
@Table(name = "employee_primary_info")
public class EmployeeInfoBean {
	
	@Id
	@Column
	private int empId;
	
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
	private String bloodgrp;
	
	@Column
	private double salary;
	
	@Column
	private int deptId;
	
	@Column
	private int managerId;
	
	@Column
	private String password;



}
