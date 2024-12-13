package com.training;

import java.util.Comparator;

public class SortByRating implements Comparator<Product>{

	
	public int compare(Product p1, Product p2) {
		
		return p1.getRatings()<p2.getRatings()?1:-1;
	}

	

}
