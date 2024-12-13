package stringtask;

import java.util.Scanner;

public class PosNegString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		int index = (int) str.charAt(0);
		int check = 0;
		for(int i = 1; i < str.length(); i++) {
			int in = (int) str.charAt(i);
			if(in<index) {
				check = 1;
				break;
			}else {
				index = in;
			}
		}
		if(check == 1)
			System.out.println("Negative string");
		else
			System.out.println("Positive string");
	}
}
