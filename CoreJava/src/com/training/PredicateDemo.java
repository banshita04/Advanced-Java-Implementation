package com.training;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(97);
		list.add(75);
		list.add(56);
		list.add(23);
		list.add(9);
		list.add(88);
		System.out.println("before removing even nos.");
		System.out.println(list);
		
		System.out.println("after removing even nos.");
		Predicate<Integer> pre = (i)-> i%2==0;
		
		list.removeIf(pre);
		System.out.println(list);
		
		//OR

//		System.out.println("after removing odd nos.");
//		list.removeIf(i->i%2!=0);
//		System.out.println(list);
		
		//new techniques of iterating
		
		System.out.println("One way of Iterating list");
		
		Consumer<Integer> c = i->System.out.println(i);
		list.forEach(c);
		
		//OR
		
		System.out.println("Another way of iterating list");
		
		list.forEach(i->System.out.println(i));
		
		
	}
}
