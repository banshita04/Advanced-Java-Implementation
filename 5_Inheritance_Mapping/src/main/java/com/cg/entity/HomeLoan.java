package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class HomeLoan extends Loan{
	@Column(length = 20)
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}