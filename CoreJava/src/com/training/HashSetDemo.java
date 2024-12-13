package com.training;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(101, "Banshita", 50000);
		Employee1 e2 = new Employee1(102, "Datta", 60000);
		Employee1 e3 = new Employee1(103, "Roy", 70000);
		Employee1 e4 = new Employee1(104, "abc", 80000);
		Employee1 e5 = new Employee1(105, "xyz", 30000);
		
		HashSet<Employee1> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		System.out.println("Size: "+set.size());
		System.out.println("------------------");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());

		int n = 5; //max size of the bucket
		System.out.println("Bucket no.: "+((n - 1)&e2.hashCode()));
		System.out.println("------------------");

		
		//array objects has hashCode but a single element in the array doesn't have a hashCode 
		//because it is of primitive datatype - int
		
		System.out.println("Array concept of hashCode");
		int arr[] = new int[10];
//		arr[3] = 5;
//		System.out.println(arr[3].hashCode());
		System.out.println(arr.hashCode());


	}
}
