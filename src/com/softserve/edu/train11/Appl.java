package com.softserve.edu.train11;

public class Appl {
	
	public static void main(String[] args) {
		DialogTime dt = new DialogTime();
		dt.setVisible(true);
		System.out.println("main(): Thread ID = " + Thread.currentThread().getId());
	}
}
