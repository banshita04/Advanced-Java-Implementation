package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone number");
		String num = sc.next();
		String reg1 = "[+][9][1]([1-9]{1})([0-9]{9})";
		String reg2 = "[9][1]([1-9]{1})([0-9]{9})";
		String reg3 = "([1-9]{1})([0-9]{9})";
		String reg4 = "[0]([1-9]{1})([0-9]{9})";
		
		Pattern p1 = Pattern.compile(reg1);
		Pattern p2 = Pattern.compile(reg2);
		Pattern p3 = Pattern.compile(reg3);
		Pattern p4 = Pattern.compile(reg4);
		
		Matcher m1 = p1.matcher(num);
		Matcher m2 = p2.matcher(num);
		Matcher m3 = p3.matcher(num);
		Matcher m4 = p4.matcher(num);
		
		if(m1.matches())
			System.out.println("Valid");
		else if (m2.matches())
			System.out.println("Valid");
		else if (m3.matches())
			System.out.println("Valid");
		else if (m4.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		
		
		
		
	}
}
