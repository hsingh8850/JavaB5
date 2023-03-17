package com.javab5.java.basics;

public class XORSum {

	public static void main(String[] args) {

		int[] x = { 34, 4, 65, 7, 7, 78, 8 };
		int[] y = { 34, 4, 7, 7, 78, 8 };

		int ans = 0;
		for (int i = 0; i < x.length; i++) {
			ans = ans ^ x[i];
		}

		for (int i = 0; i < y.length; i++) {
			ans = ans ^ y[i];
		}
		System.out.println(ans);

	}

}
