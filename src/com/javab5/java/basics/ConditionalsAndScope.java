package com.javab5.java.basics;

import java.util.Scanner;

public class ConditionalsAndScope {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your run in integer form");

		int x = 9;
		int run = sc.nextInt();// 1,2,3,4,5,6

		if (run == 1)
			System.out.println("You have scored 1 run");
		else if (run == 2)
			System.out.println("You have scored 2 runs");
		else if (run == 3) {
//			boolean x = true;
			System.out.println("You have scored 3 runs");
		} else if (run == 4)
			System.out.println("You have scored  fours ");
		else if (run == 5)
			System.out.println("You have scored 5 runs");
		else if (run == 6)
			System.out.println("You have scored a sixer");
		else
			System.out.println("Invalid Runs CHEATER ");

		System.out.println(x);

	}
}
