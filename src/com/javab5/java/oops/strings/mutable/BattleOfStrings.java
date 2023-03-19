package com.javab5.java.oops.strings.mutable;

public class BattleOfStrings {
//	Sir,how to reverse word sequence in a string ?
	public static void main(String[] args) {

//		Tom is a good cat
//		omT si a doog tac

//		String x = "RRR";
//		long start = System.nanoTime();
//
//		for (int i = 0; i < 100000; i++) {
//			x += "NATU ";
//		}
//
//		long end = System.nanoTime();
//		System.out.println("Time : " + (end - start));

		StringBuilder sb = new StringBuilder("RRR");// If you are changing your strinmg too many times, go for String
													// Builde/buffer
		long start = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			sb.append("NATU ");
		}

		long end = System.nanoTime();
		System.out.println("Time : " + (end - start));

	}

}
