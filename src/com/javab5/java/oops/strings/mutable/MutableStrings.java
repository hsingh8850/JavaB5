package com.javab5.java.oops.strings.mutable;

public class MutableStrings {

	public static void main(String[] args) {

		String x = "Larry";// Immutable
		String m = x.toLowerCase();
		System.out.println(m);

		// Mutable
		StringBuilder sb = new StringBuilder("Larry");
		sb.append(" is a good ");
		sb.append("boy");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(0, 'X');
		System.out.println(sb);

		String s = "RRR";
		StringBuilder sb1 = new StringBuilder("RRR");
		StringBuilder sb2 = new StringBuilder("RRR");

//		if (sb1.equals(sb2))// compare the addreess
//			if (sb1 == sb2)// compare the addreess
		if (sb1.toString().equals(sb2.toString()))
			System.out.println(true);
		else
			System.out.println(false);

//		Monkey and fish
//		Brick or Momo

		StringBuffer sbuf = new StringBuffer("RRR");// prferred in MT env
		if (s.equals(sbuf.toString()))
			System.out.println(true);
//		sbuf.append(" is a bad ");
//		sbuf.append("boy");
//		System.out.println(sbuf);

	}

}
