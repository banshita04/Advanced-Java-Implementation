package com.ds;

public class LinkedListDemo {
	Employee start = null;
	public static void main(String[] args) {
		LinkedListDemo demo = new LinkedListDemo();
		
		demo.add("abc");
		demo.add("cde");
		demo.add("fgh");
		demo.displayAll();
		
		System.out.println("\n---------------");
		
		demo.addElement("ijk",0);
		demo.displayAll();
		
		
		System.out.println("\n---------------");

		demo.addElement("lmn", 1);
		demo.displayAll();
		
		System.out.println("\n---------------");
		demo.search("xyz");
		demo.search("abc");
		
		System.out.println("\n---------------");
		demo.remove(1);
		demo.displayAll();
	}
	
	void search(String name) {
		Employee e = start;
		int pos = 1;
		if(start == null) {
			System.out.println("Object not found");
		}else {
			while(e != null) {
				if(e.name.equals(name)) {
					System.out.println("Object found at position "+pos);
					break;
				}else {
					pos++;
					e = e.next;
				}
			}
			if(e==null)
				System.out.println("Object not found");
			
		}
				
	}
	
	void add(String name) {
		Employee e = new Employee(name);
		if(start == null) { //if the list is empty
			start = e;
		}else {
			Employee q = start;
			while(q.next != null) { //to find the last element
				q = q.next;
			}
			q.next = e; //added @ the end
		}
	}
	
	void addElement(String name, int index) {
		Employee e = new Employee(name);
		if(index == 0) { //to add element at index 0
			e.next = start;
			start = e;
		}else {
			Employee q = start;
			for(int i = 1; i < index; i++) {
				q = q.next;
			}
			e.next = q.next;
			q.next = e;
		}
	}
	
	void remove(int index) {
		Employee e = start;
		int pos = 1;
		if(index == 1) {
			start = e.next;
		}else {
			while(e!=null) {
				if(pos == (index-1)) {
					e.next = e.next.next;
					break;
				}
				e = e.next;
				pos++;
			}
		}
	}
	
	void displayAll() {
		if(start == null) {
			System.out.println("The list is empty");
		}
		else {
			Employee q = start;
			while(q != null) {
				System.out.print(q.name+" ");
				q = q.next;
			}
		}
	}
}

class Employee{
	String name;
	Employee next;
	Employee(String name){
		this.name = name;
		this.next = null;
	}
	
	
}
