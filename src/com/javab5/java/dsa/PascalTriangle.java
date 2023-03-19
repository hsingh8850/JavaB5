package com.javab5.java.dsa;

import java.util.Scanner;

//			  1
//          1   1
//        1   2   1
//       1   3   3   1
//     1   4   6   4   1

//$$$$$*
//$$$$**
//$$$***
//$$****
//$*****

//$$$$$1
//$$$$11
//$$$1*1
//$$1**1
//$1***1
public class PascalTriangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows for the Pascal Triangle : ");
		int num = sc.nextInt();

		int c = 1;
		for (int i = 0; i < num; i++) {// row control

			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					c = 1;
					System.out.print(c + " ");

				} else {
					
					c = c * (i - j + 1) / j;
					System.out.print(c + " ");
				}

			}

			System.out.println();

		}
	}
}
