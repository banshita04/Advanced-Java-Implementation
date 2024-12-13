package com.array.callbyvalue;

public class Main {
	public static void main(String[] args) {
		int value = 10;
		Main main = new Main();
		main.displayValue(value);
		System.out.println("Value from main method: "+value);
	}
	void displayValue(int value) {
		System.out.println("Value of the variable in the method displayValue: "+value);
		value = 20;
		System.out.println("Value of the variable in the method displayValue: "+value);
	}
}
