package com.cg.threads;

public class SynchronizationDemo {
	public static void main(String[] args) throws InterruptedException {

		Banking bank=new Banking();

		Thread t1=new Thread(bank);
		t1.setName("ATM");

		Thread t2=new Thread(bank);
		t2.setName("Gpay");

		t1.start();t2.start();
		t1.join();t2.join();

		System.out.println("Balance Amt is "+bank.bankBalance);
	}
}
class Banking implements Runnable{

	float bankBalance=4000;

	public void run() {
		debit(3000);
	}

	private synchronized void debit(float amtToDebit) {

		Thread t=Thread.currentThread();

		if(bankBalance>=amtToDebit) {
			System.out.println(t.getName()+" ready for debit");
			bankBalance=bankBalance-amtToDebit;
			System.out.println(t.getName()+" transaction success");
		}

		else {
			System.out.println(t.getName()+" Insufficient funds");
		}

	}
}


