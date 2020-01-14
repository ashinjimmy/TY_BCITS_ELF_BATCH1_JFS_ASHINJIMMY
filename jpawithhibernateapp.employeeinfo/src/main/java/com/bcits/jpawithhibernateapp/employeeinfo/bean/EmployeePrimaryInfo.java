package com.bcits.jpawithhibernateapp.employeeinfo.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_primary_info")

public class EmployeePrimaryInfo implements Serializable {

	@Id
	@Column
	private int emp_id;
	@Column(name = "emp_name")
	private String emp_name;
	@Column
	private long emp_mobileno;
	@Column(name = "official_mailid")
	private String mailId;
	@Column(name = "date_of_birth")
	private Date dob;
	@Column(name = " date_of_join")
	private Date doj;
	@Column(name = "designation")
	private String designation;
	@Column(name = " blood_group")
	private String bloodgrp;
	@Column(name = "salary")
	private double salary;
	@Column(name = "dept_id")
	private int dept_id;
	@Column(name = " manager_id")
	private int manager_id;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public long getEmp_mobileno() {
		return emp_mobileno;
	}
	public void setEmp_mobileno(long emp_mobileno) {
		this.emp_mobileno = emp_mobileno;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBloodgrp() {
		return bloodgrp;
	}
	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

}
