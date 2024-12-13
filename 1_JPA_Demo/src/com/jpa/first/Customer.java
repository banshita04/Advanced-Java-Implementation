package com.jpa.first;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity//maps the class with Customer table
@DynamicUpdate //will only update the field which is required, will not fire query for
//all the fields
//generates update query only for the updated column
@DynamicInsert //will insert null automatically if value is not passed
//generates insert query @runtime it identifies null values and wont insert null
//dynamic annotations are part of hibernate, not jpa
public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Id//makes custId as Primary Key
	private int custId;
	@Column(length = 20)
	private String custName;
	@Column(length = 20)
	private String address;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}
