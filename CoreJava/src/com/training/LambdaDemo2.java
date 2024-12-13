package com.training;

public class LambdaDemo2 {
	
	public static void main(String[] args) {
		//make a lambda for calculator
		//pass as a arg to process method
		
		Calculator r = (a,b)->{System.out.printf("Sum: %.2f\nDifference: %.2f\nMultiplication: %.2f\nDivision: ",(a+b),(a-b),(a*b));return a/b;};
		
		Calculator r1 = (a,b)->{return a+b;};
		
		process(r, 50, 10);
		process(r1, 20, 10);
		process((a,b)->a+b, 5,10);
		

	}
	
	static void process(Calculator c, float x, float y) {
		System.out.println(c.eval(x,y));
	}
}
@FunctionalInterface
interface Calculator{
	float eval(float a, float b);
}
