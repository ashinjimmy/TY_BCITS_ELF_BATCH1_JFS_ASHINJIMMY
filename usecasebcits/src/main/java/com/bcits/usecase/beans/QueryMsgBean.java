package com.bcits.usecase.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="query_raised")
public class QueryMsgBean implements Serializable {
	
	@EmbeddedId
	private QueryMsgBeanPk queryMsgPk;
	@Column(name = "query_request")
	private String queryRequest;
	@Column(name = "query_response")
	private String queryResponse;
	@Column
	private String region;
}



