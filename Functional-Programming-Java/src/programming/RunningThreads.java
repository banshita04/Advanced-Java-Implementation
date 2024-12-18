package programming;

import java.util.stream.IntStream;

public class RunningThreads {

	public static void main(String[] args) {
		
		//		Runnable runnable = new Runnable() {
		//
		//			@Override
		//			public void run() {
		//				// TODO Auto-generated method stub
		//				for(int i=0; i < 10000; i++) {
		//					System.out.println(Thread.currentThread().getId()+" : "+ i);
		//				}
		//			}
		//		};

		//		Runnable runnable1 = () -> {
		//
		//				for(int i=0; i < 10000; i++) {
		//					System.out.println(Thread.currentThread().getId()+" : "+ i);
		//				}
		//			
		//		};

		Runnable runnable2 = () -> 
		IntStream
		.rangeClosed(0, 100)
		.forEach(i->System.out.println(Thread.currentThread()+" : "+i));

		Thread thread = new Thread(runnable2);
		thread.start();
		Thread thread1 = new Thread(runnable2);
		thread1.start();
		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}

}
