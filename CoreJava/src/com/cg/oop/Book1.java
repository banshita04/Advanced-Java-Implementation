package com.cg.oop;

class Book1 extends Product{
	private String authour;
	Book1(int prodCode,String prodName,float price,String authour){
		super(prodCode,prodName,price);
		this.authour=authour;
	}
	void displayAuthour() {
		System.out.println("Authour: "+authour);
	}
}
