package com.javab5.java.basics;

public class LoopsInJava {

	public static void main(String[] args) {

		int x = 100;// 51
		// Even nos till 0 - x

//		System.out.println(0);
//		System.out.println(2);
//		System.out.println(4);
//		System.out.println(6);

		int i = 1;
		for (; i <= 1000; i += 2) {// intiatlisation ; condn; updation
			System.out.print(i + " ");
		}
		System.out.println(i);

		i = 0;
		while (i <= 100) {
			System.out.print(i + " ");
			i += 3;
		}

		System.out.println();
		do {
			System.out.println("DO");
		} while (i == 0);// Atleast execute for one time

	}

}
