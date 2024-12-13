package com.cg.oop;

public class Apparal extends Product{
	public Apparal(int prodCode, String prodName2, String string, String string2, String string3, float price2, String string4) {
		super(prodCode, prodName2, price2);
		// TODO Auto-generated constructor stub
	}
	//OR

	private String color;
	private String size;
	private String fabric;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

}

