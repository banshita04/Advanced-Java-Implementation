package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		
		map1.put("C0123", "Banshita");
		map1.put("C0124", "Shradha");
		map1.put("C0125", "Akshata");
		map1.put("C0126", "Swathi");
		
		System.out.println(map1);
		
		String eName = map1.get("C0123");
		System.out.println(eName);
		
		Set<String> empId = map1.keySet();
		System.out.println("---------employee ID----------");
		for(String id: empId)
			System.out.println(id);
		
		Collection<String> empName = map1.values();
		System.out.println("--------employee name----------");
		for(String name: empName)
			System.out.println(name);
		
		//map.entry -> represents key value pair
		System.out.println("----iterating key and values together----");
		Set<Map.Entry<String, String>> records = map1.entrySet();
		
		for(Map.Entry<String, String> row: records) {
			String k = row.getKey();
			String v = row.getValue();
			System.out.println(k+" -|- "+v);
		}
		
	}

}
