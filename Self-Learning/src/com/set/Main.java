package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		System.out.println("LINKEDHASHSET\n");
		Set<String> set = new LinkedHashSet<>();
		for(int i = 15; i > 0; i--) {
			set.add("A"+i);
		}

		for (String name : set) {
			System.out.print(name+" ");//in order they are added, no duplicates
		}

		System.out.println("\n\nTREESET\n");
		Set<String> set1 = new TreeSet<String>();
		for(int i = 15; i > 0; i--) {
			set1.add("A"+i);
		}

		for (String name : set1) {
			System.out.print(name+" ");//no natural order, random, no duplicates
		}

		System.out.println("\n\nHASHSET\n");
		Set<String> set2 = new HashSet<>();
		for(int i = 15; i > 0; i--) {
			set2.add("A"+i);
		}

		for (String name : set2) {
			System.out.print(name+" ");//no natural order, random, no duplicates, allows one null
		}


	}
}
