package com.cg.threads;

public class MainThreadDemo {
	public static void main(String[] args) {
		
		//returns the current running thread reference
		//currentThread() is a static method
		Thread t = Thread.currentThread();
		System.out.println("Current thread name is "+t.getName());
		t.setName("banshita");
		System.out.println("Changed thread name is "+t.getName());
		
		//Priority in java ranges from 1 to 10.
		//1 - min. priority, 10 - max priority
		System.out.println("Current priority is "+t.getPriority());
		t.setPriority(10);
		System.out.println("Changed thread priority is "+t.getPriority());
				
		//IllegalArgumentException is an unchecked exception.
		//t.setPriority(11);
		
		
		/*
		 *if we use Thread.sleep();, it throws unhandled checked exception (InterruptedException),
		 *so, we have to handle it using try catch.
		 */
		try {
			for(int i = 1; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
