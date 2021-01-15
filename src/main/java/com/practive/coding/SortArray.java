package com.practive.coding;

import java.util.Arrays;

public class SortArray {

	private static int[] arraySort(int[] input) {

		int length = input.length;
		int temp = 0;

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (input[i] < input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}

		}
		return input;
	}

	public static void main(String[] args) {

		int[] input = new int[] { 5, 8, 3, 7, 1, 9, 23, 12, 45, 44, 32, 111, 11111 };
		System.out.print(Arrays.toString(arraySort(input)));
	}
}
