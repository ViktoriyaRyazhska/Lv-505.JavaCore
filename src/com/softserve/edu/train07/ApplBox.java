package com.softserve.edu.train07;

public class ApplBox {

	public <E> E last(E... arg) {
		int count = arg.length;
		return arg[count - 1];
	}

	public static void main(String[] args) {
		/*-
		Box box = new Box();
		box.set(1234);
		// Code
		box.set("1234");
		int num = (int) box.get(); // Code Smell // Runtime Error
		System.out.println("num = " + num);
		//
		BoxWrapper box = new BoxWrapper();
		box.set(1234);
		// Code
		// box.set("1234");  // Compie Error
		int num = box.get();
		System.out.println("num = " + num);
		*/
		BoxGen<Integer> box = new BoxGen<>();
		box.set(1234);
		// Code
		// box.set("1234"); // Compie Error
		int num = box.get();
		System.out.println("num = " + num);
		//
		ApplBox appl = new ApplBox();
		String s = appl.last("111", "222", "555");
		System.out.println("s = " + s);
		//
		Integer k = appl.last(111, 222, 55577);
		System.out.println("k = " + k);
	}

}
