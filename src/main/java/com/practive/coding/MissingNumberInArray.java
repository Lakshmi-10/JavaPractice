package com.practive.coding;

/*
 * Approach: 
 * The length of the array is n-1. So the sum of all n elements, 
 * i.e sum of numbers from 1 to n can be calculated using the formula n*(n+1)/2.
 *  Now find the sum of all the elements in the array and 
 *  subtract it from the sum of first n natural numbers, it will be the value 
 *  of the missing element.
 *  Algorithm: 
* Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
* Create a variable sum to store the sum of array elements.
* Traverse the array from start to end.
* Update the value of sum as sum = sum + array[i]
* Print the missing number as sumtotal – sum
 */
public class MissingNumberInArray {

	static int getMissingNo(int a[]) {
		int i, total;
		int n = a.length;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 4, 5, 6 };
		int miss = getMissingNo(a);
		System.out.println(miss);
	}
}

/*
 * Complexity Analysis: Time Complexity: O(n). Only one traversal of the array
 * is needed. Space Complexity: O(1). No extra space is needed
 */
