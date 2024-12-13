package stringtask;

import java.util.Scanner;

public class SumOfAllIntegers {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String num = sc.next();
			for(int i = 0; i < num.length(); i++) {
				System.out.println(num.charAt(i));
			}
			int sum = 0;
			int d = Integer.parseInt(num);
			while(d>0) {
				sum+=d%10;
				d=d/10;
			}
			System.out.println("Sum is "+sum);
//			for(int i = 0; i < num.length(); i++) {
//			}
	}
}
