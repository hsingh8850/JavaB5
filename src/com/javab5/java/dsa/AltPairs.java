package com.javab5.java.dsa;

public class AltPairs {

	public static void main(String[] args) {
		System.out.println(altPairs("ABCDEFGHI"));
	}

//	ABCD EFGH I
	public static String altPairs(String str) {
		// 0,1,[2,3], 4,5, [6,7], 8,9 ... so
		String result = "";
		int i = 0;
//		AB	[CD]	EF	GHI
		// Loop through the string by 4, grabbing pairs of characters
		while (i < str.length()) {
			int end = i + 2;
			if (end > str.length()) {
				end = str.length();
			}
			result += str.substring(i, end);
			i += 4;
		}
		return result;
	}

}
