package com.javab5.java.oops.strings;

public class StringsBasics {

	public static void main(String[] args) {

		// 1st Using String literal
		String x = "java";
		String y = "java";
		System.out.println(x);
		System.out.println(x.length());

		if (x == y)// it is not comparing the content, it is comparing the object address
			System.out.println(true);
		else
			System.out.println(false);

		// Using new keyword
		String m = new String("java");
		String n = new String("java");
		String o = "Java";

		if (m == n)
			System.out.println(true);
		else
			System.out.println(false);

		if (m.equals(o))
			System.out.println("equal");
		else
			System.out.println("unequal");

		if (m.equalsIgnoreCase(o))
			System.out.println("equal");
		else
			System.out.println("unequal");

	}

}
