package com.javab5.java.basics;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {

		// if elseif elseif elseif else
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your run in integer form");

		int x = 9;
		int run = sc.nextInt();// 1,2,3,4,5,6s
		switch (run) {
		case 1:
			System.out.println("Scored 1 run");
//			break;
		case 2: {
			System.out.println("Scored 2 runs");
			break;
		}
		case 3:
			System.out.println("Scored 3 runs");
			break;
		case 4:
			System.out.println("Scored fours");
			break;
		case 5:
			System.out.println("Scored 5 runs");
			break;
		case 6:
			System.out.println("Hit a sixer");
			break;
		default:
			System.out.println("CHEATER");
			break;
		}

	}

}
