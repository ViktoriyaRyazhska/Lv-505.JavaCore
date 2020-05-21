package com.softserve.edu.train06;

public class ApplAB {
	public static void main(String[] args) {
		System.out.println("The Start.");
		//
//		ClassA a = new ClassA();
//		System.out.println("Test ClassA.");
//		a.m1();
//		a.m2();
//		a.m3();
//		a.m4();
		//
		ClassA b = new ClassB();			// 1. Polymorphism
		System.out.println("Test ClassB.");
		System.out.println("b.i = " + b.i); // Architecture Error
		b.m1();								// 2. Polymorphism
		b.m2();
		b.m3();								// 3. Polymorphism
		b.m4();
		//
//		ClassB b0 = new ClassB();
//		System.out.println("Test_0 ClassB.");
//		System.out.println("b0.i = " + b0.i);
//		b0.m1();
//		b0.m2();
//		b0.m3();
//		b0.m4();
	}
}
