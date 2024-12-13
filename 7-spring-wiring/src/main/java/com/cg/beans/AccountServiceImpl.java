package com.cg.beans;

public class AccountServiceImpl implements AccountService {
	private SavingsAccDao dao;
	public AccountServiceImpl() {
		System.out.println("Account Service initialised");
	}
	public void setDao(SavingsAccDao dao) {
		this.dao = dao;
		System.out.println("setter...");
	}
	public String creditService(float amt) {
		return dao.creditSalary(amt);
	}

}

