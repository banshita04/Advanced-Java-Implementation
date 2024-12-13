package practicesprint1;

import java.time.LocalDate;
public class Product {
	private int prodId;
	private String prodName;
	private float price;
	private float ratings;
	private LocalDate manufactureDate;
 //setter and getter
	
	public int getProdId() {
		return prodId;
	}
	public Product(int prodId, String prodName, float price, float ratings, LocalDate manufactureDate) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
	this.ratings = ratings;
	this.manufactureDate = manufactureDate;
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
	public int compareTo(Product p2) {
		// TODO Auto-generated method stub
		return 0;
	}
}