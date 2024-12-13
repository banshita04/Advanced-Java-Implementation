package com.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo1 {
	public static void main(String[] args) {
		Product p1=new Product(101, "Laptop", 55000, 4.5f);
		Product p2=new Product(102, "Bag", 500, 4.7f);
		Product p3=new Product(103, "Basket", 100, 4.5f);
		Product p4=new Product(104, "ear phones", 2000, 4.4f);
		Product p5=new Product(105, "Watch", 5000, 4.2f);
		Product p6=new Product(106, "Type C charger", 600, 4.1f);
		ArrayList<Product> plist=new ArrayList<>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);

		plist.stream().filter(p->p.getPrice()>100)
		.filter(p->p.getRatings()>=4.5)
		.sorted((pr1,pr2)->pr1.getRatings()<pr2.getRatings()?1:-1)
		.forEach(n->System.out.println(n.getProdName()));
		//here whatever date we filtered/sorted it lost (not retaining)
		//now to store the filtered data in a collection:-

		//toList() -> returns the result in a different list(FROM JDK 16)
		List<Product> prodList = 
				plist.stream().filter(p->p.getPrice()>100).
				filter(p->p.getRatings()>=4.5).
				sorted((pr1,pr2)->pr1.getRatings()<pr2.getRatings()?1:-1).toList();
		System.out.println(prodList);
		//Prior to 16th version use collect
		prodList = plist.stream().filter(p->p.getPrice()>100).
				filter(p->p.getRatings()>=4.5).
				sorted((pr1,pr2)->pr1.getRatings()<pr2.getRatings()?1:-1)
				.collect(Collectors.toList());
		System.out.println(prodList);
		//	Stream.of(p1,p2,p3,p4,p5).filter(null);

		plist.stream().
		filter(p->p.getRatings()>=4.5).
		forEach(p-> System.out.println(p.getProdName()));

		System.out.println("Price L to H \n*********");
		plist.stream().sorted( (pr1,pr2)->pr1.getPrice()<pr2.getPrice()?-1:1 ).
		forEach( (p)->System.out.println(p.getProdName()+" "+p.getPrice()) );


		//1. Find the costliest product
		//2. find the cheapest product
		//3. find the highest rated product
		//4. find the lowest rated product
		Product p=plist.stream().max((pr1,pr2)->pr1.getPrice()<pr2.getPrice()?-1:1 ).get();
		System.out.println("Costliest Product is "+p.getProdName()+" and the price is "
				+p.getPrice());


		p=plist.stream().min((pr1,pr2)->pr1.getPrice()<pr2.getPrice()?-1:1 ).get();
		System.out.println("Cheapest Product is "+p.getProdName()+" and the price is "
				+p.getPrice());


	}

}