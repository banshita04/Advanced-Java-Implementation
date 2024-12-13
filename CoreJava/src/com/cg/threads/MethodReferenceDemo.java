package com.cg.threads;

public class MethodReferenceDemo {
	
	public MethodReferenceDemo() {//matches the signature of run method
		System.out.println("I m contructor......... "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t = new Thread(()->hello());
		t.start();
		//method refernce -> to replace lambda....(For static method)
		Thread t2 = new Thread(MethodReferenceDemo::hello);
		t2.start();
		
		MethodReferenceDemo m = new MethodReferenceDemo();
		Thread t3 = new Thread(m::f1);//for non-static method)
		t3.start();
		
		Thread t4 = new Thread(MethodReferenceDemo::new);//constructor reference
		t4.start();
		
		
		
	}
	//this hello() signature is exactly matching the signture of run()
	static void hello() {
		System.out.println("Hey I m a thread....... "+Thread.currentThread().getName());
	}
	void f1()
	{
		System.out.println("I am f1...... "+Thread.currentThread().getName());
	}
}
