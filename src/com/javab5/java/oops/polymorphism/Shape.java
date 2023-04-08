package com.javab5.java.oops.polymorphism;

public class Shape {

	int areaOfSquare(int side) {
		return side * side;
	}

	float areaOfTriangle(int base, int height) {
		return 0.5f * base * height;
	}

	double areaOfCircle(float radius) {
//		return 3.14159f * radius * radius;
		return Math.PI * radius * radius;
	}

}
