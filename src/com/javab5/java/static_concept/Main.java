package com.javab5.java.static_concept;

public class Main {

	public static void main(String[] args) {///public increases visibly to MAX | static enables for a direct call
		
		
		
		say();
		
		Bus b1 = new Bus("Yellow", "Volvo");
		b1.safetyStars = 5;
		
		Bus b2 = new Bus("Red", "Mahindra");
//		b2.safetyStars = 3;
		Bus.safetyStars = 3;//static entities should be accessed via class name
		
		Bus b3 = new Bus("Crimson", "Piaggo");

		b1.color = "Green";
		System.out.println(b2.color);//Red
		System.out.println(b3.safetyStars);//3
//
		Bus.safetyStars = 6;//static variables can be directly accesed via className
		System.out.println(Bus.safetyStars);
		
		System.out.println(b3.safetyStars);//6
//		
		System.out.println(Bus.sayMySafetyRaitings2());

	}

	 static void say() {

	}

}
