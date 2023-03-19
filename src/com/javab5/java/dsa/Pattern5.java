package com.javab5.java.dsa;

import java.util.Scanner;

public class Pattern5 {

//	num = 5
//	      *
//	     **
//	     ***
//	    ****
//	   *****
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of rows for the pattern : ");
		int num = scanner.nextInt();// 5

		for (int i = 0; i < num; i++) {// 0 1 2 3 4 [to change the rows]

			for (int j = 0; j < num - i; j++) {// this will control the contents of the indvidula rows
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {// this will control the contents of the indvidula row
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
