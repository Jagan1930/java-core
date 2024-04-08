package com.learning.core.day4session1.stack5;

public class TestQueue {
	public static void main(String[] args) {
        Queue1 queue = new Queue1();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Elements in Queue: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }

}
