package com.anonymousobject;

public class Main {
	public static void main(String[] args) {
		System.out.println(args[0]);
		if(args[0].equals(new Lock().getCode())) {
			System.out.println("The door is now open");
		}else {
			System.out.println("The door is now closed");
		}
	}
}