package com.collections.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("Bob");
		list.add("Pom");
		new Main().printList(list);
		list.sort(null);//natural order of sorting
		System.out.println("Sorted list: "+list);
		Collections.reverse(list);
		System.out.println("Reverse list: "+list);
	}
	public void printList(List<String> list) {
		Iterator<String> data = list.listIterator();
		while(data.hasNext()) {
			System.out.println(data.next());
		}
	}
}
