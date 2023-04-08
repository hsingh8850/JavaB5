package com.javab5.java.oops.final_keyword;

public class Student {

	final int ID;//final at instance variables
	String name;
	
	//Constructor iws overlaoded
	public Student(String name, int id) {//initializing the final var in constructor its fine
		this.ID = id;
//		super();
		this.name = name;
	}
	
	public Student( ) {//initializing the final var in constructor its fine
		this.ID = 0000;
	}


	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + "]";
	}
	
	

}
