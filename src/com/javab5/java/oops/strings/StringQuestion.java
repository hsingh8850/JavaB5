package com.javab5.java.oops.strings;

public class StringQuestion {

	public static void main(String[] args) {

		String str = "";
		System.out.println(notString(str));

	}

	static public String notString(String str) {
		String result = "not ";
		if (str.length() < 3) {
			result += str;
			return result;
		} else if (str.substring(0, 3).equals("not")) {
			return str;
		} else {
			result += str;
			return result;
		}
	}

	public boolean nearHundred(int n) {
		if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10)
			return true;
		return false;

	}

}
