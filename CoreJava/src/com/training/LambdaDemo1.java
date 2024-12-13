package com.training;

public class LambdaDemo1 {
	public static void main(String[] args) {
		//		doWish(new GreetingImp1(),"Banshita");
		Greet g =(name)->{return "Hi "+name+" Happy Birthday!";};
		//		Greet g1 = (a)->{return 1;};

		doWish(g, "Banshita");
	}

	static void doWish(Greet g, String name) {
		System.out.println(g.wish(name));
		//		System.out.println(g.wish1(100));
	}
}

@FunctionalInterface //this annotation will not allow more than one abstract method in te 
interface Greet{
	String wish(String name);
	//	String wish1(int a);
}

//	class GreetingImp1 implements Greet{
//		public String wish(String name) {
//			return "Hi "+name+" Happy Birthday";
//		}
//	}

