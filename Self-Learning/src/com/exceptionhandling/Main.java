package com.exceptionhandling;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.case1(5, 0);
		main.case2(5, 0);
	}
	public void case1(int x, int y) {//10/0
		if(y!=0) {
			System.out.println("x/y="+x/y);
		}else {
			System.out.println("The value of y is 0, possible exception.(using if else");
		}
	}
	public void case2(int x, int y) {
		try {
			System.out.println("x/y="+x/y);
		}catch(Exception e) {
			System.out.println("Using try catch block:-");
			System.out.println("The value of y is 0, possible exception.");
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
