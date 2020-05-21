package com.softserve.edu.train06;

public interface Formula {
	double calculate(int a);

	default double sqr(int a) {
		return a * a;
	}
}
