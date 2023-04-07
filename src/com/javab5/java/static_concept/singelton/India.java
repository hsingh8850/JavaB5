package com.javab5.java.static_concept.singelton;

//DSA

//LLD - Design PAtterns
//System Design

//Polymorphism
public class India {// Singelton - Design Pattern

	private String nationalBird;
	private int noOfStates;
	static private boolean isCreated = false;
	static private India ind;

	private India(String nationalBird, int noOfStates) {
		super();
		this.nationalBird = nationalBird;
		this.noOfStates = noOfStates;
	}

	@Override
	public String toString() {
		return "India [nationalBird=" + nationalBird + ", noOfStates=" + noOfStates + "]";
	}

	static India getObject(String nationalBird, int noOfStates) {
		if (isCreated == false) {
			ind = new India(nationalBird, noOfStates);
			isCreated = true;
			return ind;
		} else {
			return ind;
		}

	}

}
