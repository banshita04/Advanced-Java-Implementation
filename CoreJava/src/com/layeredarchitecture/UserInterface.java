package com.layeredarchitecture;
import java.util.*;
import java.util.Map.Entry;
import java.util.List;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		while(true) {
			System.out.println("1. Get All Products");
			System.out.println("2. Get Product Name And Price Sorted By Price");
			System.out.println("3. Get Cheapest Product");
			System.out.println("4. Count Product by Ratings");
			System.out.println("5. Total Cost");
			System.out.println("6. Search Product by Name");
			System.out.println("7. Get top three costliest product");
			System.out.println("8. Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch){
			case 1:
				if(ps.getAllProductNames().isEmpty())
					System.out.println("There is no Product");
				else {
					List<String> l = ps.getAllProductNames();
					for(String n: l)
						System.out.println(n);
				}
				break;

			case 2:
				if(ps.getAllProductNames().isEmpty())
					System.out.println("There is no Product");
				else{
					Map<String, Float> l = ps.getProductNameAndPriceSortByPrice();
					for(Entry<String, Float> m: l.entrySet()) {
						System.out.println(m.getKey()+" "+m.getValue());
					}
				}
				break;

			case 3:
				if(ps.getAllProductNames().isEmpty())
					System.out.println("There is no Product");
				else {
					Product p = ps.getCheapestProduct();
					System.out.println("The cheapest product is "+p.getProdName()+" and price is "+p.getPrice());
				}
				break;


			case 4:
				if(ps.getAllProductNames().isEmpty())
					System.out.println("There is no Product");
				else {
					System.out.println("Enter the rating");
					float r = sc.nextFloat();
					System.out.println("There are "+ps.getCountProductByRating(r)+" products having rating "+r);
				}
				break;

			case 5:
				if(ps.getAllProductNames().isEmpty())
					System.out.println("There is no Product");
				else
					System.out.println("Total cost is "+ps.totalCost());
				break;

			case 6:
				if(ps.getAllProductNames().isEmpty())
					System.out.println("There is no Product");
				else{
					System.out.println("Enter the name");
					sc.nextLine();
					String n = sc.nextLine();
					List<Product> ls = ps.searchProductByName(n);
					for(Product p: ls)
						System.out.println(p.getProdId()+" "+p.getProdName()+" "+p.getPrice()+" "+p.getRatings());
				}
				break;

			case 7:
				if(ps.getAllProductNames().isEmpty())
					System.out.println("There is no Product");
				else {
					List<Product> list = ps.getTopThreeCostliestProducts();
					for(Product p:list)
						System.out.println(p.getProdId()+" "+p.getProdName()+" "+p.getPrice()+" "+p.getRatings());
				}
				break;

			case 8:
				System.out.println("Thank you for using the application");
				break;

			default:
				System.out.println("Wrong choice. Try again...");
			}
			if(ch == 8)
				break;
		}

	}

}
