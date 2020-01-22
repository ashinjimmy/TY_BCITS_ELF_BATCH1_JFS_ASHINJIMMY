package com.bcits.usecase.bean.tables;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;


import lombok.Data;

@Data
@Embeddable
public class BillHistoryCK  implements Serializable {
	
	private int  rrNumber;
	private Date billDate;

}
