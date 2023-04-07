package com.javab5.java.static_concept;

public class Bus {

	String color;
	String brand;// instance variables
	static int safetyStars;// static variable are not instance variables, they are class l;evel variables

	static {//this gets executed even before constructor
		System.out.println("Static block called");
		safetyStars = 1;
		
	}
	@Override
	public String toString() {
		return "Bus [color=" + color + ", brand=" + brand + "]";
	}

	public Bus(String color, String brand) {
//		super();
		System.out.println("Bus(String color, String brand) ==> called");
		this.color = color;
		this.brand = brand;
	}

	int sayMySafetyRaiting() {
		return safetyStars;//static entities can be accessed through non static things
	}
	
	static int sayMySafetyRaitings2() {
		int r = safetyStars;//static things can be accessed via static methods
//		System.out.println(brand);//non static things cannot be DIRECTLY accesed through static things
		return r;
	}

}
