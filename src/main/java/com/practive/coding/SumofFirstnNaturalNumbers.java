package com.practive.coding;

/**
 * n*(n+1)/2
 * 
 * @author Neha
 *
 */
public class SumofFirstnNaturalNumbers {
	public static void main(String args[]) {
		System.out.println("sum of 5 natural numbers" + calculateSum(3));
	}

	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
