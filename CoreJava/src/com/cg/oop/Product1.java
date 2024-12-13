package com.cg.oop;

public class Product1 {
	private int prodCode;
	private String prodName;
	private float price;
	Product1(int prodCode,String prodName,float price){
		this.prodCode=prodCode;
		this.prodName=prodName;
		this.price=price;
	}
	void displayProduct() {
		System.out.println(prodCode+" "+prodName+" "+price);
	}
}