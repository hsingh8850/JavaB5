package com.javab5.java.static_concept;

public class Student {

	String name;
//	ID : STUD1 .. STUD2
	static int counter = 0;//sattic are shared among all the opbjcts ofg same type
	String id;

	public Student(String name) {
//		super();
		this.name = name;
		this.id = "STUD" + ++counter;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	

}
