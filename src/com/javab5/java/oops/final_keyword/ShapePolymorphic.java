package com.javab5.java.oops.final_keyword;

public class ShapePolymorphic {// Compile time polymorphism

	// Return type & name of parameters does not determines polymorphism

//	Here shape is overloaded

	// No of parameters
	// Type of parameters
	// Position of parameters

	int shape(int side) {// Square
		return side * side;
	}

	float shape(int base, float height) {// Trianlgle
		return 0.5f * base * height;
	}

	float shape(float breadth, int length) {// Rectangle
		return length * breadth;
	}

	double shape(float radius) {// Circle
//		return 3.14159f * radius * radius;
		return Math.PI * radius * radius;
	}

}
