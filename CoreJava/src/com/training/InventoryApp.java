package com.training;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class InventoryApp {

	public static void main(String[] args) {

		Product p1=new Product(101,"lenovo",50000,4.5f,LocalDate.of(2020, 1, 10));
		System.out.println(p1.getManufactureDate());
		Product p2=new Product(102,"Bag",4500,4.1f,LocalDate.of(2020, 10, 20));
		String date="09-01-2024";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyy");
		LocalDate d=LocalDate.parse(date,formatter); //converting string to local date
		System.out.println(d);

		Product p3=new Product(103,"pen",300,4.1f,LocalDate.parse("05-02-2011",formatter));
		Product p4=new Product(104,"pencil",500,4.6f,LocalDate.parse("06-03-2012",formatter));
		Product p5=new Product(105,"eraser",100,4.7f,LocalDate.parse("16-04-2013",formatter));
		ArrayList<Product> productList= new ArrayList<>();
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);

		for(Product p:productList) {
			System.out.println(p.getProdId()+"\t"+p.getProdName()
			+"\t"+p.getPrice()+"\t"+p.getRatings()+"\t"+p.getManufactureDate());
		}

		Collections.sort(productList);
		System.out.println("===Product list after sorty cost ====");
		for(Product p:productList) {
			System.out.println(p.getProdId()+"\t"+p.getProdName()
			+"\t"+p.getPrice()+"\t"+p.getRatings()+"\t"+p.getManufactureDate());
		}

		Collections.sort(productList,new SortByRating());
		System.out.println("===Product list after sort by ratings ====");
		for(Product p:productList) {
			System.out.println(p.getProdId()+"\t"+p.getProdName()
			+"\t"+p.getPrice()+"\t"+p.getRatings()+"\t"+p.getManufactureDate());
		}
	}
}
