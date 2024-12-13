package com.training;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//Hash sets -->NO duplicates, NO guarantee for order
public class SetsExe {
public static void main(String args[]) {
	HashSet<String> set1=new HashSet<>();
	boolean b1=set1.add("Shoes");
	set1.add("T-shirt");
	set1.add("Jeans");
	set1.add("Kurtha");
	boolean b2=set1.add("Shoes");
	System.out.println("Hash set output");
	System.out.println(set1);
	System.out.println(b1);
	System.out.println(b2);
	
	
	//Tree set-> NO duplicates, elements are arranged in default
	//linked Hash set --> NO duplicates, elements arranged in insertion order
	
	TreeSet<String> set2=new TreeSet<>();
	boolean b3=set2.add("Shoes");
	set2.add("T-shirt");
	set2.add("Jeans");
	set2.add("Kurtha");
	boolean b4=set1.add("Shoes");
	System.out.println("Tree set output");
	System.out.println(set2);
	System.out.println(b3);
	System.out.println(b4);	
	
	LinkedHashSet<String> set3=new LinkedHashSet<>();
	boolean b5=set3.add("Shoes");
	set3.add("T-shirt");
	set3.add("Jeans");
	set3.add("Kurtha");
	boolean b6=set3.add("Shoes");
	System.out.println("Linked hash set output");
	System.out.println(set3);
	System.out.println(b5);
	System.out.println(b6);	
	
}
}

