package com.cg.oop;

public class ObjectCreationDemo1 {
	public static void main(String args[]) {
		//need to make object of Customer
		//new -> keyword to allocate  memory
		//new Customer() -> allocates memory in heap
		
		Customers c1 = null;//ref variable declare locally
		c1 = new Customers();
		c1.custID = 101;
		c1.custName = "Riya";
		c1.gender = "female";
		c1.dob = "12-dec-1998";
		
		c1.printDetails();
		update(c1);
		System.out.println("Updated name "+c1.custName);
		
	}
	
	static void update(Customers c1) {
		c1.custName = "Riya Sen";
	}

}
