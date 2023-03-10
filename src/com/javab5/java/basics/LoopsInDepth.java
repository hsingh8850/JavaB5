package com.javab5.java.basics;

public class LoopsInDepth {

	public static void main(String[] args) {

//		Menu Driven Program

		for (int i = 0; i < 100; i++) {
			System.out.print(i + " ");
			if (i >= 80)
				break;
		}

		System.out.println();
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0)
				continue;
			System.out.print(i+" ");
		}
	}

}
