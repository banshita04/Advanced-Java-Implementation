package practicesprint1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class InventoryApp {
public static void main(String[] args) {
    Product p1=new Product(101, "Lenova Laptop", 50000, 4.5f, LocalDate.of(2020, 1, 10));
	Product p2=new Product(102, "Bag", 1000, 4.1f, LocalDate.of(2022, 10, 20));
	//String date="09-12-2023";
	
	DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	Product p3=new Product(103,"Pen",50,4.4f,LocalDate.parse("05/01/2024", formater));
	Product p4=new Product(104,"Chair",2000,4.5f,LocalDate.parse("10/02/2024",formater));
	Product p5=new Product(105,"Water Bottle",200,4.9f,LocalDate.parse("10/12/2023", formater));
	ArrayList<Product> productList=new ArrayList<>();
	productList.add(p1);
	productList.add(p2);
	productList.add(p3);
	productList.add(p4);
	productList.add(p5);
	Collections.sort(productList,new SortOnDate ());
	Iterator itr = productList.iterator();
//	for(Product p: productList)
//		System.out.println(productList.getManufactureDate());
//	while(itr.hasNext()) {
//		System.out.print(itr.next()+" ");
//	}
	
	
}
}
