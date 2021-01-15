package com.practive.coding;

public class SwapNumbers {

	public static void swapPairs(int[] arr) {
		int length = arr.length % 2 == 0 ? arr.length : arr.length - 1;

		for (int i = 0; i < length; i = i + 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		// print the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
		// 16, 17, 18, 19, 20};
		int[] arr = new int[] { 1, 2, 3 };
		swapPairs(arr);
	}

}
