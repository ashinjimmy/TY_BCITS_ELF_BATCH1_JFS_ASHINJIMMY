package com.bcits.springrest.beans;

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
		private Integer empId;
		
		@Column
		private String empName;
		
		@Column
		private Long empMobileno;
		
	    @Column
		private String mailId;
		
		@Column
		/* @DateTimeFormat(iso=ISO.DATE) */
		private Date dob;
		
		@Column
		/* @DateTimeFormat(iso=ISO.DATE) */
		private Date doj;
		
		@Column
		private String designation;
		
		@Column
		private String bloodgrp;
		
		@Column
		private Double salary;
		
		@Column
		private Integer deptId;
		
		@Column
		private Integer managerId;
		
		@Column
		private String password;
	
}
