package com.practive.coding;

import java.util.Arrays;

public class LargestElement {
	public static void main(String args[]) {
		int[] sampleArray = { 12, 22, 3, 4, 5, 9, 10, 11, 123, 125, 179 };
		System.out.println(findLargest(sampleArray, 5));
	}

	private static int findLargest(int[] nums, int k) {
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
		return nums[nums.length - k];
	}

}
