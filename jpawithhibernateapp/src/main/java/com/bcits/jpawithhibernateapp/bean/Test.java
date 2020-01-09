package com.bcits.jpawithhibernateapp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_info")
public class Test implements Serializable {
	@Id
	@Column(name = "id")
	private int m_id;
	@Column(name = "name")
	private String m_name;
	@Column(name = "rating")
	private String m_rating;

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_rating() {
		return m_rating;
	}

	public void setM_rating(String m_rating) {
		this.m_rating = m_rating;
	}

}
