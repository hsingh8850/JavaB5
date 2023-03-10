package com.javab5.java.basics;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");

		menu: while (true) {
			System.out.println("Options : \n 1 : CocaCola \n 2 : Pepsi \n 3 : Mountain Dew \n 4 : Sprite \n 0 : EXIT");
			int option = sc.nextInt();

			switch (option) {
			case 0:
				System.out.println("Thanks for your Purchase !!");
//				System.exit(9998);
				break menu;
			case 1:
				System.out.println("CocaCola");
				break;
			case 2:
				System.out.println("Pepsi");
				break;
			case 3:
				System.out.println("Mountain Dews");
				break;
			case 4:
				System.out.println("Sprite");
				break;
			default:
				System.out.println("Sorry for your inconvenience");
				break;
			}

		}

	}

}
