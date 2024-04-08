package com.learning.core.day4session1.stack1;

public class ImplStack {
	private int maxSize;
	private int[] stackArray;
	private int top;

	public ImplStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full. Cannot push " + value);
			return;
		}
		top++;
		stackArray[top] = value;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return -1; // Or you can throw an exception
		}
		int value = stackArray[top];
		top--;
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return -1; // Or you can throw an exception
		}
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		ImplStack stack = new ImplStack(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());

		System.out.println("Element at top: " + stack.peek());

		stack.push(60);
		stack.push(70);

		System.out.println("Element at top after pushing: " + stack.peek());
	}

}
