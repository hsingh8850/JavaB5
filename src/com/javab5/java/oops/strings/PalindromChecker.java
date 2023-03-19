package com.javab5.java.oops.strings;

public class PalindromChecker {

	public static void main(String[] args) {

//		Logic 1
		String x = "MADAM";
		String xReversed = "";// ELPPA
		for (int i = x.length() - 1; i >= 0; i--) {
			xReversed += x.charAt(i);
		}

		System.out.println(xReversed);

		if (x.equals(xReversed))
			System.out.println(true);
		else
			System.out.println(false);

//		Logic 2
		int i = 0, j = x.length() - 1;
		boolean flag = true;
		while (i <= j) {
			if (x.charAt(i) == x.charAt(j)) {
				i++;
				j--;
				continue;
			} else {
				flag = false;
				System.out.println("Not a Plaindrome");
				break;
			}

		}
		if (flag)
			System.out.println("palindrome");

//		Logic 3
		System.out.println(new StringBuilder(x).reverse().toString().equals(x));

	}

}
