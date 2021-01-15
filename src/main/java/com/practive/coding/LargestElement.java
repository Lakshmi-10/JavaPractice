package com.practive.coding;

import java.util.Arrays;

public class LargestElement {
	public static void main(String args[]) {
		int[] sampleArray = { 12, 22, 3, 4, 5, 9, 10, 11, 123, 125, 179 };
		System.out.println(findLargest(sampleArray, 1));
	}

	private static int findLargest(int[] nums, int k) {
		Arrays.sort(nums);
		int n = nums.length;
		return nums[n - k];
	}

}
