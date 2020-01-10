package com.bcits.jpawithhibernateapp.employeeinfo.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductInfo")
public class ProductInfo implements Serializable {
	@Id
	@Column
	private int pId;
	@Column
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
