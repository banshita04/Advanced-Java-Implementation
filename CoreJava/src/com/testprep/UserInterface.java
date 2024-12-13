package com.testprep;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SSN number");
		String one = sc.nextLine();
		try {
			check(one);
			System.out.println(one + " is a valid Social Security Number.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid SSN Format. "+ e.getMessage());
		}catch (InvalidSocialSecurityNumberException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Thank you for using the application.");
		}
	}

	public static void check(String one)throws InvalidSocialSecurityNumberException,ArrayIndexOutOfBoundsException{
		String[] details = one.split("-");
		if(details.length != 3) {
			throw new ArrayIndexOutOfBoundsException("Expected format: xxx-xx-xxxx");
		}

		int area = Integer.parseInt(details[0]);
		if(area < 1 || area > 999) {
			throw new InvalidSocialSecurityNumberException("Invalid SSN area code. ");
		}

		int group = Integer.parseInt(details[1]);
		if(group < 1 || group > 99) {
			throw new InvalidSocialSecurityNumberException("Invalid SSN group code. ");
		}

		int serial = Integer.parseInt(details[2]);
		if(serial < 1 || serial > 9999) {
			throw new InvalidSocialSecurityNumberException("Invalid SSN serial code. ");
		}
	}

}
