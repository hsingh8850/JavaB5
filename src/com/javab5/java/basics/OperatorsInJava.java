package com.javab5.java.basics;

public class OperatorsInJava {

	public static void main(String[] args) {

//		Assingment
		int x;
		x = 9;// assigmment operator
		System.out.println(x);

//		Mathematical Operators
		x = 9 * 4;
		System.out.println(x);
		x = x + 8;
		System.out.println(x);
		x = x - 9;
		System.out.println(x);
		x = x / 2;
		System.out.println(x);// 17
		System.out.println(x % 5);// 2
		x = x % 5;// modulo is used to calculate remainders
		System.out.println(x);// 2

//		Unary Operators
		x++;// Post Increment = x = x +1
		System.out.println(x);// 3
		System.out.println(++x);// 4 Pre Increment
		System.out.println(x);// 4

		int z = 10;
		z = ++z + --z - z++ + z-- + ++z - --z - z--;
		System.out.println(z);// 10, 13, 9, 10

//		z = 13
//		 11 + 10 - 10 + 11 + 11 - 10 - 10 = 13

//		Shorthand Operators
		z = z + 1;
		++z;
		z++;
		z += 1;// z = z+1 shorthand notation

		z *= 100;// z = z *100
		System.out.println(z);

		z = 0;
//		Comparison Operators
		if (z % 2 == 0) {// the condition must return boolean FONT LIGNATURING [Fira Code]
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}

		if (z >= 1000)
			System.out.println(true);// == > < >= <= !=

//		BitWise Operator
		z = 56;
		System.out.println(z);

		System.out.println(56 << 2);// 56 *2 *2
		System.out.println(56 >> 3);// 56 /2 = /2 = /2
		System.out.println(56 & 20);// 16 56 --> Binary 20 --> binary and apply AND operation

//		56 = 111000
//		20 = 010100
//		& =  010000

		int ans = 0b010000;
		System.out.println(ans);
		System.out.println(ans ^ ans);
		System.out.println(ans);// 16
		System.out.println(~ans);
	}
}
