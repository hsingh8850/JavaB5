package com.javab5.java.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int size = scanner.nextInt();
		
		int [] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements for "+i+" th index:");
			arr[i] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
