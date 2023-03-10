package com.javab5.java.basics;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your integer");// Even : true ; Odd : false

		int num = sc.nextInt();
//		if (num % 2 == 0)
//			System.out.println(true);
//		else
//			System.out.println(false);

		boolean result = num % 2 == 0 ? true : false;// condn ? "if teh condn is true" : "if false this thing will be
														// used"
		System.out.println(result);// function = methods

	}

}
