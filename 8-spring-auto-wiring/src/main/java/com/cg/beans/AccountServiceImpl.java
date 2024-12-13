package com.cg.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {
	private SavingsAccDao dao;
	public AccountServiceImpl() {
		System.out.println("Account service constructor");
	}
	@Autowired
	public void setDao(SavingsAccDao dao) {
		this.dao = dao;
		System.out.println("setter..");
	}
	public String creditService(float amt) {
		return dao.creditSalary(amt);
	}

}