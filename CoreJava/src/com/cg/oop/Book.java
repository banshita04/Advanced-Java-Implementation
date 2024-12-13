package com.cg.oop;

public class Book  extends Product{


public Book(int prodCode, String prodName2, String string, String string2, float price2) {
		super(prodCode, prodName2, price2);
		// TODO Auto-generated constructor stub
	}
private String authourName;
private String genre;
public String getAuthourName() {
	return authourName;
}
public void setAuthourName(String authourName) {
	this.authourName = authourName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}

}

