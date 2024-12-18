package com.generics;

import java.util.LinkedList;
import java.util.List;

class Data<T> {
	private Object object;

	public Data(Object object) {
		super();
		this.object = object;
	}

	@Override
	public String toString() {
		return object.toString();
	}

//	public Data(Object object) {
//		this.object = object;
//	}

//	public Object getObject() {
//		return object;
//	}

//	@Override
//	public String toString() {
//		return object.toString();
//	}
	
	
	
}

//class Name{
//	private String name;
//
//	public Name(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return name;
//	}
//	
//	
//}

class GenericData<T>{
	private T data;

	
	
	public GenericData(T data) {
		super();
		this.data = data;
	}



	public T getData() {
		return data;
	}
	
	
}

public class Main{
	public static void main(String[] args) {
		List<Data<Object>> list = new LinkedList<>();
		list.add(new Data<Object>("Bob"));
		list.add(new Data<Object>("Tom"));
		list.add(new Data<Object>(22));
		list.add(new Data<Object>(20.9));
//		list.add(new Data(new Name("Pam")));
//		System.out.println(list);
		
//		String y = new Data("Hello mars").toString();
//		System.out.println(y);
//		Data x = new Data("Hello earth");
//		System.out.println(x);
//		System.out.println(x.getObject());
		
//		Data data = new Data("Some Data");
//		String s = (String) data.getObject();
//		System.out.println(s);
		
//		GenericData<String> genericData = new GenericData<String>("Some generic data");
//		String y = genericData.getData();
//		System.out.println(y);
		
		for(Object data: list) {
			System.out.println(data);
		}
	}
}