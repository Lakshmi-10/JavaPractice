package com.practive.coding;

import java.util.Arrays;

public class ArrayConcatenate2 {

	// Without inbuilt methods
	private static int[] combine(int[] array1, int[] array2) {

		int length = array1.length + array2.length;

		int[] result = new int[length];
		int pos = 0;
		for (int element : array1) {
			result[pos] = element;
			pos++;
		}

		for (int element : array2) {
			result[pos] = element;
			pos++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6, 7, 8, 9 };

		System.out.println(Arrays.toString(combine(array1, array2)));
		System.out.println(Arrays.toString(combine2(array1, array2)));

	}

	// using arraycopy()
	private static int[] combine2(int[] array1, int[] array2) {

		int aLen = array1.length;
		int bLen = array2.length;
		int[] result = new int[aLen + bLen];

		System.arraycopy(array1, 0, result, 0, aLen);
		System.arraycopy(array2, 0, result, aLen, bLen);

		return result;
	}

}
