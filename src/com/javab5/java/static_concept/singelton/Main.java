package com.javab5.java.static_concept.singelton;

public class Main {

	public static void main(String[] args) {

//		India india = new India("Peacock",30);
//		india.nationalBird = "Peacock";
//		india.noOfStates = 30;
//		System.out.println(india.hashCode());
		
//		India india2 =new India("Peacock",30);
//		System.out.println(india2.hashCode());
		
		India ind = India.getObject("Peacock", 30);
		System.out.println(ind);
		System.out.println(ind.hashCode());

		
		India ind2 = India.getObject("Parrot", 30);
		System.out.println(ind2);
		System.out.println(ind2.hashCode());

	}

}
