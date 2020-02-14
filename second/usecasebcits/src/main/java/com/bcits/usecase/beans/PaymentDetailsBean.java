package com.bcits.usecase.beans;




import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
//@Table(name = " payment_details ")
public class PaymentDetailsBean  implements Serializable {
	
	@Id
	@Column(name = "rr_number")
	private String rrNumber;
	@Column(name = "bill_amount")
	private Double billAmount;
	@Column(name = "current_status")
	private String currentStatus;

}