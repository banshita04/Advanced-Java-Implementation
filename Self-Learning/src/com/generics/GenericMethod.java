package com.generics;

import java.util.ArrayList;
import java.util.List;

class Print {
	public <E> void printListData(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
	}
	public <E> void printArrayData(E[] arrayData) {
		for (E element : arrayData) {
			System.out.println(element);
		}
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(22);
		list.add(89);
		list.add(13);
		new Print().printListData(list);
		
		System.out.println("**********");
		
		List<String> list1 = new ArrayList<>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		new Print().printListData(list1);
		
		System.out.println("**********");
		
		String stringArray[] = {"One", "Two", "Three"};
		new Print().printArrayData(stringArray);
		
		System.out.println("**********");
		
		Integer intArray[] = {1,2,3};
		new Print().printArrayData(intArray);
	}
}
