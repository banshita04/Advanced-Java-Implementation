package com.exceptions;

import java.util.Scanner;

public class ThrowExe1 {
	
	public static void main(String[] args) {
		float balance = 5000f;
		
		System.out.println("****WELCOME TO HDFC BANK****");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount to withdraw");
		float amtToWith = sc.nextFloat();
		
		if(amtToWith>balance)
			try{
				throw new InsufficientFundsException("Amt u entered is exceeding the balance amt");
			} catch(Exception e){
				System.out.println("In catch "+e);
			}
		else {
			balance-=amtToWith;
			System.out.println("transaction successful, balance is: "+balance);
		}
	}

}
