package com.learning.core.day4session1.stack5;

public class Queue1 {
	Queue front, rear;

	Queue1() {
		this.front = this.rear = null;
	}

	void enqueue(int data) {
		Queue newNode = new Queue(data);

		if (this.rear == null) {
			this.front = this.rear = newNode;
			return;
		}

		this.rear.next = newNode;
		this.rear = newNode;
	}

	int dequeue() {
		if (this.front == null)
			return -1;

		int data = this.front.data;
		this.front = this.front.next;

		if (this.front == null)
			this.rear = null;

		return data;
	}

	boolean isEmpty() {
		return this.front == null;
	}

	int peek() {
		if (this.front == null)
			return -1;
		return this.front.data;
	}

}
