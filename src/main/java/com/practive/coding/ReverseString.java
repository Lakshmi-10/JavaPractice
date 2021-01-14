package com.practive.coding;

public class ReverseString {

	private byte[] reverseString(String s) {

		// getBytes() method to convert string into bytes[].
		byte[] strAsByteArray = s.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		// Store result in reverse order into the result byte[]
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		System.out.println(new String(result));
		return result;
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		String input = "GeeksforGeeks";
		rs.reverseString(input);

	}
}
