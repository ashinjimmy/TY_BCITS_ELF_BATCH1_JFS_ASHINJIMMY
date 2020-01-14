package com.bcits.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernateapp.employeeinfo.bean.EmployeePrimaryInfo;
@Entity
@Table(name = "employee_secondary_info")
public class Employee_Secondary_Info {

	@Id
	private int emp_id;
	@Column
	private String gender; 
	@Column
	private String personal_emailid;
	@Column
	private int age;
	@Column
	private String nationality;
	@Column
	private String martial_status;
	@Column
	private String govt_id;
	@Column
	private String guardian_name;
	@Column
	private long guardian_contactno;
	@Column
	private int house_no;

	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")

	private EmployeePrimaryInfo primary;

	public EmployeePrimaryInfo getPrimary() {
		return primary;
	}

	public void setPrimary(EmployeePrimaryInfo primary) {
		this.primary = primary;
	}


	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPersonal_emailid() {
		return personal_emailid;
	}

	public void setPersonal_emailid(String personal_emailid) {
		this.personal_emailid = personal_emailid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMartial_status() {
		return martial_status;
	}

	public void setMartial_status(String martial_status) {
		this.martial_status = martial_status;
	}

	public String getGovt_id() {
		return govt_id;
	}

	public void setGovt_id(String govt_id) {
		this.govt_id = govt_id;
	}

	public String getGuardian_name() {
		return guardian_name;
	}

	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
	}

	public long getGuardian_contactno() {
		return guardian_contactno;
	}

	public void setGuardian_contactno(long guardian_contactno) {
		this.guardian_contactno = guardian_contactno;
	}

	public int getHouse_no() {
		return house_no;
	}

	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}
}
