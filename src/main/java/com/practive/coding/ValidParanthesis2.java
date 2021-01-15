package com.practive.coding;

import java.util.Stack;

public class ValidParanthesis2 {
	private static boolean bracketValidation(String s) {
		if (s == null || s.equals("") || s.length() == 1) {
			return false;
		} else {
			char[] chars = s.toCharArray();
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < chars.length; i++) {
				char c = chars[i];
				if (c == '{' || c == '[') {
					stack.push(c);
				}

				if (stack.isEmpty()) {
					return false;
				}
				if (c == ']') {
					char top = stack.peek();
					if (top != '[') {
						return false;
					}
					stack.pop();
				} else if (c == '}') {
					char top = stack.peek();
					if (top != '{') {
						return false;
					}
					stack.pop();
				}

			}
			return stack.isEmpty();
		}
	}

	public static void main(String[] args) {
		String s = "}}";
		System.out.println(bracketValidation(s));
	}

}
