package com.softserve.edu.train06;

public abstract class A {
	private int i;

	public A(int i) {
		this.i = i;
		System.out.println("public A()");
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
