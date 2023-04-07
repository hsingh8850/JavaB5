package com.javab5.java.static_concept;

import java.util.Scanner;

public class JVM {

	public static void main(String[] args) {
//		new Main().main(null);
		
//		Main.main(null);
		
		Xerox x1 = new Xerox();
//		x1.c=  new Copier();
		Xerox.c = new Copier();
		Xerox.sc = new Scanner(System.in);
		
		
		Xerox x2 = new Xerox();
		x2.c = new Copier();
	}

}
