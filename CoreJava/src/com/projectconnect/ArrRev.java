package com.projectconnect;

import java.util.Scanner;

public class ArrRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of the array");
//		int s = sc.nextInt();
//		int arr[] = new int[s];
		String rev = "";
		System.out.println("Enter the String");
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			rev = s.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
