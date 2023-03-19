package com.javab5.java.dsa;

import java.util.Scanner;

public class Pattern3 {

//	num = 5
//	1
//	2 3
//	4 5 6
//	7 8 9 10
//	11 12 13 14 15
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of rows for the pattern : ");
		int num = scanner.nextInt();// 5
		int count = 1;

		for (int i = 0; i < num; i++) {// 0 1 2 3 4 [to change the rows]

			for (int j = 0; j <= i; j++) {// this will control the contents of the indvidula row

				System.out.print(count++ + " ");
			}
			System.out.println();
		}

	}

}
