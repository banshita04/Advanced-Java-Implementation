package com.cg.oop;
//its a blueprint
public class Customers {
	//state/property
	int custID;
	String custName;
	String gender;
	String dob;
	
	//behaviour/functionality
	void printDetails() {
		System.out.println("Customer ID: "+custID);
		System.out.println("Customer name: "+custName);
		System.out.println("Customer gender: "+gender);
		System.out.println("Customer dob: "+dob);

	}

}
