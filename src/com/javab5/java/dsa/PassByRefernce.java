package com.javab5.java.dsa;

import java.util.Arrays;

public class PassByRefernce {

	public static void main(String[] args) {

		int[] arr = { 43, 54, 775, 876, 8734, 1, 34, 645, 67, 88 };// ascending order
//		arr is a obkect ?  : YES

		int x = 20;// x is not a object

//		Integer m= new Integer(x);//deprecated
		Integer y = x;
		modify(x);// passing the value
		System.out.println(x);

		change(arr);// you are passing the reference
		System.out.println(Arrays.toString(arr));//

	}

	static void modify(int x) {
		x = 99;

	}

	static void change(int[] arr) {
		arr[0] = -1;
	}

}
