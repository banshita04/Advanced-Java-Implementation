package com.training;

public class Demo {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.getVal());
		System.out.println(p.x);
		Child c = (Child)p;
		System.out.println(c.y);
	}
}
	
	class Parent{
		int x = getVal();
		int y = 9;
		int getVal() {
			return 10;
		}
	}
	
	class Child extends Parent{
		int y = 18;
		int getVal() {
			return 99;
		}
	}
