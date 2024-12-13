package com.exceptions;

public class FinallyExe1 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
			System.out.println(5/0);
			System.out.println("Try ends");
		}catch(Exception e) {
			System.out.println("In catch");
			System.out.println(3/0);
		}
		finally {
			System.out.println("In finally...");
		}
		System.out.println("Main ends");
	}

}
