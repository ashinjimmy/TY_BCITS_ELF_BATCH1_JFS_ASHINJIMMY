package com.bcits.springmvc.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;


@Data
@Entity
@Table(name = "primary_employee_info")
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
	@DateTimeFormat(iso=ISO.DATE)
	private Date dob;
	
	@Column
	@DateTimeFormat(iso=ISO.DATE)
	private Date doj;
	
	@Column
	private String designation;
	
	@Column
	private String bloodGrp;
	
	@Column
	private double salary;
	
	@Column
	private int deptId;
	
	@Column
	private int managerId;
	
	@Column
	private String password;

}
