package com.learning.core.day4session1.stack4;

public class TestQueue {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		queue.displayQueue();

		System.out.println("Dequeued element: " + queue.dequeue());
		queue.displayQueue();
		System.out.println("Front element: " + queue.peek());
	}

}
