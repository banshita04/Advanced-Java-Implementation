package com.generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int id;

	public Vehicle(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + "]";
	}

}
class Car extends Vehicle{
	private String model;

	public Car(int id, String model) {
		super(id);
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]"+super.toString();
	}

}
public class Wildcards {
	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(1));
		list.add(new Vehicle(2));
		list.add(new Vehicle(3));
		list.add(new Vehicle(4));
		list.add(new Car(5,"Suzuki"));
//		System.out.println(list);
		Wildcards.display(list);


	}
	public static void display(List list) {
		for (Object data : list) {
			System.out.println(data);
		}
	}
}
