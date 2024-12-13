package com.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(5);
		System.out.println(queue.poll());
		try {
			queue.offer(1);
			queue.offer(2);
			queue.offer(3);
			queue.offer(4);
			System.out.println(queue.offer(5));
			System.out.println(queue.offer(6));//offer - adds elements at top to the queue and returns true or false whether element is added or not
			System.out.println(queue.poll());//poll - remove the top element and returns the element removed
			queue.remove();//remove - removes top elements
			queue.add(9);//add - adds element to the queue
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}
		System.out.println(queue.peek());//peek - returns the top element in the queue
		System.out.println(queue);
	}
}
