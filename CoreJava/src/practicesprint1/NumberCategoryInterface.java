package practicesprint1;
import java.util.*;
public class NumberCategoryInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		NumberCategory nc1 = checkAmicable();
		NumberCategory nc2 = checkPalindrome();
		if(nc1.checkNumberCategory(num1, num2)==true)
			System.out.println(num1+" and "+num2+" are amicable numbers");
		else
			System.out.println(num1+" and "+num2+" are not amicable numbers");
		
		if(nc2.checkNumberCategory(num1, num2)==true)
			System.out.println("Their product "+(num1*num2)+" do produces a Palindrome");
		else
			System.out.println("Their product "+(num1*num2)+" does not produce a Palindrome");
	}
		
	public static NumberCategory checkAmicable() {
		NumberCategory amicable = (num1,num2)->{
			int sum1 = 0, sum2 = 0;
			for(int i = 1; i <= num1/2; i++){
				if(num1%i == 0)
					sum1+=i;
			}
			for(int i =1; i <= num2/2; i++) {
				if(num2%i == 0)
					sum2+=i;
			}
			
			if(sum1 == num2 && sum2 == num1)
				return true;
			else
				return false;
			};
			return amicable;
	}
	
	public static NumberCategory checkPalindrome() {
		NumberCategory palindrome = (num1, num2)->{
			int product = num1 * num2;
			int copy = product, rev = 0;
			while(product>0) {
				int b = product%10;
				rev = rev*10 + b;
				product = product/10;
			}
			
			if(rev==copy)
				return true;
			else
				return false;
			
		};
		return palindrome;
	}

}
