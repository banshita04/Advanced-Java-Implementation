package com.cg.threads;

public class MultipleThreadDemo {
	public static void main(String[] args) {
		System.out.println("Main thread started...");
		FileDownloader fileDownloader = new FileDownloader();
		
		//new thread has been created...
		Thread t = new Thread(fileDownloader);
		t.start();
//		fileDownloader.run();
		//can't predict the flow of the process
		
		for(int i = 1; i < 10; i++) {
			System.out.println("Main : "+i);
		}
		
		System.out.println("Main thread ends...");
	}
}

class FileDownloader implements Runnable{

	
	public void run() {
		System.out.println("I m file downloader thread...");
		for(int i = 1; i < 10; i++) {
			System.out.println("Child : "+i);
		}
	}
	
}
