package com.cg.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
//@Primary
public class SavingsAccDaoImpl implements SavingsAccDao{
	public SavingsAccDaoImpl() {
		System.out.println("salary account dao constructor");
	}
	
	@Override
	public String creditSalary(float amt) {
		// TODO Auto-generated method stub
		return "salary of "+ amt+" is credited";
	}
}
