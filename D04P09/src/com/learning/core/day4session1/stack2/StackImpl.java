package com.learning.core.day4session1.stack2;

public class StackImpl {
	private Stack top;

    public StackImpl() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Stack newStack = new Stack(data);
        if (isEmpty()) {
            top = newStack;
        } else {
        	newStack.next = top;
            top = newStack;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
        	Stack temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}
