package com.javab5.java.dsa;

import java.util.Scanner;

public class Pattern2 {

//	num = 5
//0	* * * * *  5
//1	* * * *    4
//2	* * *      3  i + j = num => j = num - i
//3	* *        2
//4	*          1
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of rows for the pattern : ");
		int num = scanner.nextInt();// 5

		for (int i = 0; i < num; i++) {// 0 1 2 3 4 [to change the rows]

			for (int j = 0; j < num - i; j++) {// this will control the contents of the individual row

				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
