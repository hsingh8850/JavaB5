package com.javab5.java.basics;

public class BasicDataTypes {

	public static void main(String[] args) {// In Java fn = method

//		Basic Primitive Data Types

//		integer
		byte a = 8;// 1 byte = 8 bits
		short b = 99;// 2 byte = 16 bits
		int c = 678;// 4 byte = 32 bits
		long d = 79789L;// 8 byte = 64 bits

//		keywords are reserved words in Java and they cannot be used for any name (variable/class/method name)

		int dozenOfBanana;// camel case

		dozenOfBanana = 88;
		System.out.println(dozenOfBanana);

		c = a;// = is called assignment operator
		System.out.println(c);

//		c = d;

//		float

		// decimals
		float temperatureInCelcius = 22.6F;// 4 byte
		double weight = 68.5;// 8 byte

//		character
		char z = '#';
		z = '₹';
		System.out.println("Price of apple is 100" + z);

		int z_ = z;
		System.out.println("Unicode value for " + z + " is ==> " + z_);

		int unicodeValueOfA = 'A';
		System.out.println("Unicode value for " + 'A' + " is ==> " + unicodeValueOfA);

//		boolean
		boolean isJavaEasy = false;
		isJavaEasy = true;

		long phNo = 9988877765L;
		float ph = phNo;// IEEE algorithm CORNER CASE
		System.out.println(ph);

		long speedOfLight = 299792458L;// 2.99792458 E8

//		Number Systems
//		Decimal ==> 10 symbols 0->9 base10 
//		Octal ==> 8 symbols 0->7 base8
//		HexaDecimal ==> 16 symbols [0->9 U (A, B, C, D, E, F)]  base16
//		Binary ==> 2 symbols 0->1 base2

		int m = 0777;// octal
		System.out.println(m);// printing will always be in decimal

		int n = 0b101010010;// binary
		System.out.println(n);

		long p = 0x6789ABC6;// hexadecimal
		System.out.println(p);

	}

}

//f(x) = x^3