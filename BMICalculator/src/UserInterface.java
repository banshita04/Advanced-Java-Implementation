import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter weight in kg");
		double weight = sc.nextDouble();
		System.out.println("Enter height in cm");
		double height = sc.nextDouble();
		
		double bmi = weight/((height/100)*(height/100));
		
		if(bmi>=25){
		    System.out.printf("Your BMI is %.2f. You are overweight \n", bmi);
		    System.out.printf("Reduce %.2f kg to be fit", bmi-25);
		}
		else if(bmi>=18.5 && bmi<25){
		    System.out.printf("Your BMI is %.2f. You are fit and healthy", bmi);
		}
		
		else if(bmi<18.5){
		    System.out.printf("Your BMI is %.2f. You are underweight\n", bmi);
		    System.out.printf("Gain %.2f kg to be fit", 18.5-bmi);
		}
		
	}

}
