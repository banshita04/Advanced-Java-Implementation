package com.cg.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("service")
public class AccountServiceImpl implements AccountService {
	@Autowired
	//@Qualifier("salaryAccountDaoImpl")
	@Qualifier("savingsAccDaoImpl")
	// qaulifier should be camel case of the class name 
	// can use any qualifier -> use primary in class if needed 
	private SavingsAccDao dao;
	public AccountServiceImpl() {
		System.out.println("Account service constructor");
	}
//	@Autowired
	
	public void setDao(SavingsAccDao dao) {
		this.dao = dao;
		System.out.println("setter..");
	}
	public String creditService(float amt) {
		return dao.creditSalary(amt);
	}

}