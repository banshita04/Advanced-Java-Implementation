package com.cg.beans;

public class SavingsAccDaoImpl implements SavingsAccDao{
	

	@Override
	public String creditSalary(float amt) {
		// TODO Auto-generated method stub
		return "salary of "+ amt+" is credited";
	}
	public SavingsAccDaoImpl() {
		System.out.println("savings account dao constructor");
	}

}
