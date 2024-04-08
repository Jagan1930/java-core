package com.learning.core.day4session1.stack2;

public class TestStack {
	public static void main(String[] args) {
        StackImpl simpl = new StackImpl();

        simpl.push(10);
        simpl.push(20);
        simpl.push(30);

        System.out.println("Stack elements:");
        simpl.display();

        System.out.println("Top element: " + simpl.peek());

        System.out.println("Popped element: " + simpl.pop());
        System.out.println("Popped element: " + simpl.pop());

        System.out.println("Stack elements:");
        simpl.display();
    }

}
