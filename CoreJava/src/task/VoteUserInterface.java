package task;
import java.util.Scanner;
class VoteUserInterface{
	public static void main(String[] args)throws InvalidAgeException{
		//get the input from the user
		//call and checkEligibility method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		VoteUserInterface vui = new VoteUserInterface();
		try {
			if(vui.checkEligibility(name, age).equals("true")) {
				System.out.println("Hi "+name+" "+"You are eligible to vote.");
			}else {
				throw new InvalidAgeException("");
			}
		} catch (InvalidAgeException e) {
			System.out.println("Hi "+name+" "+"You are not eligible to vote.");
		}


	}
	String checkEligibility(String name, int age){
		if(age<18)
			return "false";
		else
			return "true";
	}

}