package com.enums;

//Enum: special data type

public class Main {
//	public static final int COREJAVA = 1;
//	public static final int COLLECTION = 2;
//	public static final int GENERICS = 3;
//	public static final int JSP = 4;
//	public static final int MULTITHREADING = 5;
	public static void main(String[] args) {
		Learning learning = Learning.COREJAVA;
		switch(learning) {
		//short-hand notation
		case COREJAVA -> System.out.println("Core Java");
		case COLLECTION -> System.out.println("Collection");
		case GENERICS -> System.out.println("Generics");
		case JSP -> System.out.println("JSP");
		case MULTITHREADING -> System.out.println("Multithreading");
		}
		System.out.println(Learning.GENERICS);
		System.out.println(Learning.MULTITHREADING.getI());
	}
}
