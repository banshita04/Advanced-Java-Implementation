package com.comparator.customsorting;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data<K extends Integer,V extends String>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
	
	public K getKey() {
		return key;
	}



	public V getValue() {
		return value;
	}



	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer,String>>() {
			
			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				// TODO Auto-generated method stub
				if(o1.getKey() < o2.getKey()) {
					return -1;
				}else if(o1.getKey() > o2.getKey()) {
					return 1;
				}
				return 0;
			}
		};
		
		Set<Data<Integer, String>> set = new TreeSet<Data<Integer, String>>(COMPARE_KEY);
		set.add(new Data<Integer, String>(1, "Bob"));
		set.add(new Data<Integer, String>(2, "Tom"));
		set.add(new Data<Integer, String>(3, "Pom"));
		set.add(new Data<Integer, String>(4, "Mike"));
		set.add(new Data<Integer, String>(5, "Jim"));
		set.add(new Data<Integer, String>(6, "Pam"));
		set.add(new Data<Integer, String>(7, "Bob"));
		set.add(new Data<Integer, String>(7, "Bob"));
		set.add(new Data<Integer, String>(2, "Bob"));
		
		for (Data<Integer, String> data : set) {
			System.out.println(data);
		}
		
//		Set<Data<Integer, String>> set = new HashSet<>();
//		set.add(new Data<Integer, String>(1, "Bob"));
//		set.add(new Data<Integer, String>(2, "Tom"));
//		set.add(new Data<Integer, String>(3, "Pom"));
//		set.add(new Data<Integer, String>(4, "Mike"));
//		set.add(new Data<Integer, String>(5, "Jim"));
//		set.add(new Data<Integer, String>(6, "Pam"));
//		set.add(new Data<Integer, String>(7, "Bob"));
//		
//		for (Data<Integer, String> data : set) {
//			System.out.println(data);
//		}
	}
}
