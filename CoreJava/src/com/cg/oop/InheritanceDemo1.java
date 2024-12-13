package com.cg.oop;

public class InheritanceDemo1 {
public static void main(String[] args) {
	Book book=new Book(1001, "harry potter", "banshita", "fantasy", 350);
	book.setProductId(10001);
	book.setProdName("Atomic Habits");
	book.setAuthourName("Manisha");
	book.setGenre("Life style");
	book.setBrandName("Manisha publications");
	book.setPrice(150);
	
	Apparal ap=new Apparal(101, "coat", "H&M", "peach", "leather", 5000, "L");
	ap.setProductId(10002);
	ap.setProdName("T Shirt");
	ap.setBrandName("Nike");
	ap.setColor("Blue");
	ap.setFabric("Cotton");
	ap.setPrice(1999);
	ap.setSize("M");
	
	System.out.println(book.getProdName());
	System.out.println(book.getBrandName());
	//access all getters .....
	
}
}
