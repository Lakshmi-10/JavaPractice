package com.practive.coding;

import java.util.Stack;

public class ValidParanthesis {

	private static boolean bracketValidation(String s) {
		if (s == null || s.equals("") || s.length() == 1) {
			return false;
		} else {
			char[] chars = s.toCharArray();
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < chars.length; i++) {
				char c = chars[i];
				if (c == '(' || c == '{' || c == '[') {
					stack.push(c);
					continue;
				}

				if (stack.isEmpty()) {
					return false;
				}
				if (c == ')') {
					char top = stack.peek();
					if (top == '[' || top == '{') {
						return false;
					}
				} else if (c == ']') {
					char top = stack.peek();
					if (top == '(' || top == '{') {
						return false;
					}
				} else if (c == '}') {
					char top = stack.peek();
					if (top == '[' || top == '(') {
						return false;
					}
				}
				stack.pop();
			}
			return stack.isEmpty();
		}
	}

	public static void main(String[] args) {
		String s = "{ { [ ( [ ) ] } ] }";
		System.out.println(bracketValidation(s));
	}

}
