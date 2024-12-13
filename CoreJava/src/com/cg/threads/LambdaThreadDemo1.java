package com.cg.threads;

public class LambdaThreadDemo1 {
	public static void main(String[] args) {
		System.out.println("Main Thread starts");
//		MyTask3 task = new MyTask3();
		Thread t = new Thread(()->System.out.println("I am a child thread"));
		t.start();
		System.out.println("Main thread ends...");
	}

}

//class MyTask3 implements Runnable{
//	public void run() {
//		System.out.println("I am a child thread");
//	}
//}

