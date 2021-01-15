package com.practive.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrayConcatenate1 {

	// Using Streams

	private static Object[] combine(String[] first, Integer[] second) {
		return Stream.concat(Arrays.stream(first), Arrays.stream(second)).toArray();
	}

	public static void main(String[] args) {
		String[] first = new String[] { "abc" };
		Integer[] second = new Integer[] { 1, 22, 3 };
		System.out.println(Arrays.toString(combine(first, second)));
		System.out.println(Arrays.toString(combine2(first, second)));
	}

	// using collection framework

	private static Object[] combine2(String[] first, Integer[] second) {

		List<Object> list = new ArrayList<>(Arrays.asList(first));
		Collections.addAll(list, second);
		return list.toArray();
	}
}
