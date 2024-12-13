package com.cg.beans;

public class SavingsAccDaoImpl implements SavingsAccDao{
	public SavingsAccDaoImpl() {
		System.out.println("Savings Acc initialised");
	}
	@Override
	public String creditSalary(float amt) {
		return "Hi the salary of "+amt+" credited in ur salary acc";
	}

}