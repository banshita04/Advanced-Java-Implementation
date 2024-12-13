package com.training;
import java.time.LocalDate;

public class Product implements Comparable<Product> {

	private int prodId;
	private String prodName;
	private float price;
	private float  ratings;
	private LocalDate manufactureDate;
	public int compareTo(Product p){
		//System.out.println("comparing "+this.prodName+ "and"+ p.prodName);
		/*if(this.price<p.price) {
		return 1;
	}
	else
		return -1;
    return this.price<p.price?-1:1;*/
		return this.prodName.compareTo(p.prodName);
	}
	public Product(int prodId, String prodName, float price, float ratings, 
			LocalDate manufactureDate) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.ratings = ratings;
		this.manufactureDate = manufactureDate;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


}
