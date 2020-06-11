package com.softserve.edu.train10;

import java.io.EOFException;
import java.io.IOException;

class Base {
	public void doSomething() throws IOException {
	}
}

class Child extends Base {
	// public void doSomething() throws ArithmeticException {
	public void doSomething() throws EOFException {
		int i = 1;
		if (i < 2) {
			// throw new EOFException("hahaha");
		}
	}
}

class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	// Classic constructor with a message of error
	public MyException(String msg) {
		super(msg);
	}

	// Empty constructor
	public MyException() {
	}
}

public class App {

	public static void method1() throws MyException {
		method2();
	}

	public static void method2() throws MyException {
		method3();
	}

	public static void method3() throws MyException {
		throw new MyException("Exception thrown in method3");
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			//System.err.println(e.getMessage() + "\n");
			System.out.println(e.getMessage() + "\n");
			e.printStackTrace();
		}

	}
}
