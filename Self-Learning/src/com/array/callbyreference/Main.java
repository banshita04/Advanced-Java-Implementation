package com.array.callbyreference;

public class Main {
 public static void main(String[] args) {
	String names[] = {"Bob", "Cam", "Pam", "Dan"};
	System.out.println(names[0]);
	Main main = new Main();
	main.displayNames(names);
	System.out.println("New value: "+names[0]);
}
 public void displayNames(String names[]) {
	 System.out.println(names[0]);
	 names[0] = "Tom";
 }
}
