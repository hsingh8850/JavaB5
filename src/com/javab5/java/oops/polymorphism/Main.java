package com.javab5.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape.areaOfSquare(10));
		System.out.println(shape.areaOfTriangle(10, 5));
		System.out.println(shape.areaOfCircle(10));

		System.out.println("-----------------------------------------------------");

		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.shape(10));
		System.out.println(shapePolymorphic.shape(10, 5.0f));
		System.out.println(shapePolymorphic.shape(10.0f));
		System.out.println(shapePolymorphic.shape(5.0f, 10));

	}

}
