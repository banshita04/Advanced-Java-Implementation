package com.cg.threads;

public class MultipleThreadDemo2 {
	
	public static void main(String[] args)throws InterruptedException {
		
		MyTask task=new MyTask();
		
		Thread t1=new Thread(task); 
		t1.setName("Thread A");
		Thread t2=new Thread(task);
		t2.setName("Thread B");
		Thread t3=new Thread(task);
		t3.setName("Thread C");
		
		t1.start();t2.start();t3.start();
		
		//join() method makes the current thread to wait till the last thread die.
		t1.join();t2.join();t3.join();
//		System.out.println("Hello its main end...");
		
		System.out.println("Counter : "+task.getCounter());
		
	}
}

class MyTask implements Runnable{
	
	private int counter;
	public int getCounter() {
		return counter;
	}

	public void run() {
		
		for(int i=1;i<=10000;i++) {
			
			//only one thread can enter into this block at a time.
			synchronized (this) {
				counter++;
			}
		}
	}
}