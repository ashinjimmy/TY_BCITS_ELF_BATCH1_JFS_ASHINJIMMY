package com.bcits.usecase.bean.tables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Employee_Master")
public class EmployeeMaster implements Serializable{

	@Id
	@Column
	private int empId;
	@Column
	private String name;
	@Column
	private String designation;
	@Column
	private String emailId;
	@Column
	private String password;
}


