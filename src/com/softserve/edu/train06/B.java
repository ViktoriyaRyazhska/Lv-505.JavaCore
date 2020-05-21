package com.softserve.edu.train06;

public class B extends A implements I1, I2 {
	public int j;

	public B() {
		super(321);
		System.out.println("public B()");
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

}
