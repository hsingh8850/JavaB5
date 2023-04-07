package com.javab5.java.static_concept;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("Marrie");
		Student s2 = new Student("James");
		Student s3 = new Student("Chris");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(Student.counter);



	}

}
