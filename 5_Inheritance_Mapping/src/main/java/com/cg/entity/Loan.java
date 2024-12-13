package com.cg.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//this creates a single combined table
@Inheritance(strategy = InheritanceType.JOINED)//THIS CREATES THREE DIFF TABLE
public class Loan {
	@Id 
	private long accNo;
	@Column(length = 20)
	private String accName;
	private float interestRate;
	private float loanAmt;

	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public float getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(float loanAmt) {
		this.loanAmt = loanAmt;
	}

}