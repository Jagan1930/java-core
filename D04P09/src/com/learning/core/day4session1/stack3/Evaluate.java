package com.learning.core.day4session1.stack3;

import java.util.Stack;

public class Evaluate {
	public static int evaluateExpression(String expression) {
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			if (ch == ' ') {
				continue;
			} else if (ch == '(') {
				operatorStack.push(ch);
			} else if (Character.isDigit(ch)) {
				StringBuilder operand = new StringBuilder();
				while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
					operand.append(expression.charAt(i));
					i++;
				}
				i--;
				operandStack.push(Integer.parseInt(operand.toString()));
			} else if (ch == ')') {
				while (operatorStack.peek() != '(') {
					int result = applyOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop());
					operandStack.push(result);
				}
				operatorStack.pop(); // Pop the '('
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) {
					int result = applyOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop());
					operandStack.push(result);
				}
				operatorStack.push(ch);
			}
		}

		while (!operatorStack.isEmpty()) {
			int result = applyOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop());
			operandStack.push(result);
		}

		return operandStack.pop();
	}

	public static int precedence(char operator) {
		switch (operator) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		default:
			return -1;
		}
	}

	public static int applyOperation(char operator, int b, int a) {
		switch (operator) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0) {
				throw new ArithmeticException("Division by zero");
			}
			return a / b;
		default:
			return 0;
		}
	}

}
