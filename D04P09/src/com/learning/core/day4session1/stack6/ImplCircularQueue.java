package com.learning.core.day4session1.stack6;

public class ImplCircularQueue {
	private int[] queueArray;
	private int front, rear, size, capacity;

	public ImplCircularQueue(int capacity) {
		this.capacity = capacity;
		queueArray = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue " + item);
			return;
		}
		rear = (rear + 1) % capacity;
		queueArray[rear] = item;
		size++;
		//System.out.println(item + " enqueued to the queue.");
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		}
		int item = queueArray[front];
		front = (front + 1) % capacity;
		size--;
		return item;
	}

	public int front() {
		if (isEmpty()) {
			System.out.println("Queue is empty. No front element.");
			return -1; // or throw an exception
		}
		return queueArray[front];
	}

	public int rear() {
		if (isEmpty()) {
			System.out.println("Queue is empty. No rear element.");
			return -1; // or throw an exception
		}
		return queueArray[rear];
	}

	public int size() {
		return size;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		int i = front;
		System.out.print("Queue: ");
		for (int count = 0; count < size; count++) {
			System.out.print(queueArray[i] + " ");
			i = (i + 1) % capacity;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ImplCircularQueue queue = new ImplCircularQueue(5);

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);

		queue.display();

		queue.dequeue();
		queue.dequeue();

		queue.display();
	}

}
