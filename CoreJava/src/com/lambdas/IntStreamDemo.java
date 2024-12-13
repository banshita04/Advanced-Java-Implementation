package com.lambdas;

import java.util.stream.IntStream;

public class IntStreamDemo {
	
	public static void main(String[] args) {
		
		int s = IntStream.of(1,2,3,4,5,6,7,8,9).filter(i->i%2==0).sum();
		
		System.out.println("Sum of even nos."+s);
		
		int arr[] = {1,23,89,65,81,33,24,22,78,46,35,98};
		s = IntStream.of(arr).filter(i->i%2!=0).sum();
		System.out.println("Sum of odd nos.: "+s);
		
		
		System.out.println("-----Ascending order-----");
		IntStream.of(arr).sorted().forEach(i->System.out.println(i));
		
		System.out.println("------Average------");
//		double avg = IntStream.of(arr).average();
		System.out.println(IntStream.of(arr).filter(i->i%2==0).average().getAsDouble());
	}

}
