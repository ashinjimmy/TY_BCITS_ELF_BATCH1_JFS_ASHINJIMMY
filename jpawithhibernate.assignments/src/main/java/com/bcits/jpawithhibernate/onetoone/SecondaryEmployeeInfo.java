package com.bcits.jpawithhibernate.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernate.bean.PrimaryEmployeeInfo;

import lombok.Data;

@Data
@Entity
@Table(name = "secondaryEmpInfo")
public class SecondaryEmployeeInfo implements Serializable {
	
	@Id
	private int empId;
	@Column
	private String gender;
	@Column
	private String personalEmail;
	@Column
	private int age;
	@Column
	private String nationality;
	@Column
	private String martialStatus;
	@Column
	private String govtId;
	@Column
	private String guardianName;
	@Column
	private long guardianContact;
	
	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empId")
	private PrimaryEmployeeInfo pInfo;

}
