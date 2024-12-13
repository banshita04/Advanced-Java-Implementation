package stringtask;

import java.util.Scanner;

public class ModifyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		ModifyNumber mn = new ModifyNumber();


		System.out.println(mn.modifyNumber(num));


	}
	int modifyNumber(int n) {
		String s = "";

		String num = Integer.toString(n);
		for(int i = 0; i < num.length()-1; i++) {
			int cur = Integer.valueOf(num.charAt(i));
			int next = Integer.valueOf(num.charAt(i+1));
			int diff = Math.abs(cur-next);
			s = s+Integer.toString(diff);
		}
		if(num.length()%2!=0)
			return Integer.valueOf(s+num.charAt(num.length()-1));
		else
			return Integer.valueOf(s);

	}
}
