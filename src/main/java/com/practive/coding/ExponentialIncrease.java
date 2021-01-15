package com.practive.coding;

public class ExponentialIncrease {

	private static boolean isExponential(int[] a) {

		int breakpoint = 0;
		int temp = a[0];
		boolean flag = false;

		for (int i = 1; i < a.length; i++) {

			if (a[i] < temp) {
				breakpoint = i;
				flag = true;
				break;
			}
			temp = a[i];
		}

		if (!flag) {
			return false;
		}

		temp = a[breakpoint];
		for (int k = breakpoint + 1; k < a.length; k++) {

			if (a[k] > temp) {
				return false;
			}

			temp = a[k];
		}
		return true;

	}

	public static void main(String[] args) {

		System.out.println(isExponential(new int[] { 1, 7, 6, 5, 4, 3, 2, 1, 7 }));
	}

}
