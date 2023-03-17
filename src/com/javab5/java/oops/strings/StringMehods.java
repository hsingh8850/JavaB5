package com.javab5.java.oops.strings;

public class StringMehods {

	public static void main(String[] args) {

		String x = "   Natu Natu-RRR   ";
		System.out.println(x.length());
		// Indexing starts form 0

		char charAt = x.charAt(1);
		System.out.println(charAt);

		System.out.println(x.substring(4, 9));
		System.out.println(x.substring(8, x.length()));

		x = x.toUpperCase();
		System.out.println(x);
		
		x =x.toLowerCase();
		System.out.println(x);
		
		x= x.trim();
		System.out.println(x);
	
		
		String ss = "";//0
//		if(ss.length() == 0)
		if(ss.isEmpty())
			System.out.println("EMPTY STRING");

		
			System.out.println(x.lastIndexOf('u'));
//		if(ss.isBlank())
//			System.out.println("EMPTY STRING");
	}

}
