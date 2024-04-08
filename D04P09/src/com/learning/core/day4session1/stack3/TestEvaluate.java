package com.learning.core.day4session1.stack3;

public class TestEvaluate extends Evaluate {
	public static void main(String[] args) {
		String expression = "10 + 2 * 6";
		System.out.println("Expression: " + expression);
		try {
			int result = evaluateExpression(expression);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
