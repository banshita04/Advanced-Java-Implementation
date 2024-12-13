package com.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		System.out.println("Iterate a MAP");
		Map<String, String> map = new HashMap<>();
		map.put("A1", "Bob");
		map.put("A2", "Raul");
		map.put("A3", "John");
		map.put("A4", "Lopus");
		map.put("A5", "Carol");
		map.put("A6", "Santa");
		map.put("A7", "Elf");
		
		System.out.println("****Process 1****");

		for (String key : map.keySet()) {
			System.out.println("Key - "+key+" Value - "+map.get(key));
		}
		
		System.out.println("****Process 2****");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("****Process 3****");
		
		Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
		while(entryIterator.hasNext()) {
//			Map.Entry<String, String> temp = entryIterator.next();
			System.out.println(entryIterator.next());
		}
	}
}
