package com.softserve.edu.train06;

public class Square implements Formula {

	@Override
	public double calculate(int a) {
		return sqr(a);
	}

	@Override
	public double sqr(int a) {
		return a * a * a;
	}
}
