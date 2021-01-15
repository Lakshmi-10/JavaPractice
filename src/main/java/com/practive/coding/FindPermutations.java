package com.practive.coding;

import java.util.HashSet;
import java.util.Set;

/**
 * ALGORITHM EG String "ABC" First Char A and remaining chars permutations are
 * BC and CB Insert first char in available positions BC --> ABC,BAC,BCA CB -->
 * CBA,CAB,ACB
 */
public class FindPermutations {

	public static Set<String> permutationFinder(String str) {
		Set<String> perm = new HashSet<String>();
		// Handling error scenarios
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0);// first Character
		String rem = str.substring(1);// full String without first character
		Set<String> words = permutationFinder(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;
	}

	public static String charInsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;

	}

	public static void main(String[] args) {
		String s = "AAC";
		String s1 = "ABC";
		String s2 = "ABCD";
		System.out.println("AAC permutations **" + permutationFinder(s));
		System.out.println("ABC permutations **" + permutationFinder(s1));
		System.out.println("ABCD permutations **" + permutationFinder(s2));
	}

}
