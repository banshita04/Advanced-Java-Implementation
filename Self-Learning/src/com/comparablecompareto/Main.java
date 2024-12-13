package com.comparablecompareto;

import java.util.LinkedList;
import java.util.List;

class Name implements Comparable<Name>{
	private String name;

	public Name(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public int compareTo(Name o) {
		if(name.length()==o.name.length()) {
			return 0;
		}else if(name.length()>o.name.length()) {
			return -1;
		}
		return 1;
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		String a = "abc";
		String b = "xyz";
		System.out.println(a.compareTo(b));	
		
//		List<Object> names = new LinkedList<>(); (<Object> helps in making a list of all types of elements

		List names = new LinkedList<>();
		names.add(new Name("Bob"));
		names.add(new Name("Tom"));
		names.add(new Name("John"));
		names.add(new Name("Karen"));
		
		System.out.println(names);
		names.sort(null);
		//"names" cannot be sorted because it is a custom object
		//in order to sort it, we have create the compareTo method using COmparable interface
		System.out.println("After sorting: "+names);
	}
}
