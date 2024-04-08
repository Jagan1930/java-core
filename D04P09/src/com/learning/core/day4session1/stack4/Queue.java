package com.learning.core.day4session1.stack4;

public class Queue {
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int currentSize;

	public Queue(int size) {
		maxSize = size;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		currentSize = 0;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue.");
			return;
		}
		rear = (rear + 1) % maxSize;
		queueArray[rear] = data;
		currentSize++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		}
		int removedItem = queueArray[front];
		front = (front + 1) % maxSize;
		currentSize--;
		return removedItem;
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public boolean isFull() {
		return currentSize == maxSize;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty. No element to peek.");
			return -1;
		}
		return queueArray[front];
	}

	public void displayQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Queue: ");
		int count = 0;
		int index = front;
		while (count < currentSize) {
			System.out.print(queueArray[index] + " ");
			index = (index + 1) % maxSize;
			count++;
		}
		System.out.println();
	}

}
