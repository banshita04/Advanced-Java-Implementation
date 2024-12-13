package com.layeredarchitecture;

import java.util.ArrayList;
import java.util.List;


public class ProductRepository {
	List<Product> plist = new ArrayList<>();
	{
		Product p1=new Product(101, "Laptop", 55000, 4.5f);
		Product p2=new Product(102, "Bag", 500, 4.7f);
		Product p3=new Product(103, "Basket", 100, 4.5f);
		Product p4=new Product(104, "Earphones", 2000, 4.4f);
		Product p5=new Product(105, "Watch", 5000, 4.2f);
		Product p6=new Product(106, "Type C charger", 600, 4.1f);
		//ArrayList<Product> plist=new ArrayList<>();

		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);
		//		plist.forEach(p->System.out.println(p.getProdName()));
	}

	public List<Product> getAllProducts(){
		return plist;
	}
}
