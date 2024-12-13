package com.cg;

public class HelloWorld {

public static void main(String[] args) {
	String names[] = {"Harish", "Ashwini", "kartick", "Neha"};
	int scores[] = {90, 45, 56, 99};
	
	for(int i = 0; i < names.length; i++) {
		System.out.println(names[i] + " = " + scores[i]);
	}
	
	int max = 0;
	for(int i = 0; i < scores.length; i++) {
		if(scores[i]>max);
		max = i;
	}
	System.out.print("Top scorer is: " + names[max]);
		
}

}
