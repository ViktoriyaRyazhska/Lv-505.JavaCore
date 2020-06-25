package com.softserve.edu.train14;

import java.util.ArrayList;
import java.util.List;

interface Vehicle1 {
	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}

public class Appl {
	public static void main(String args[]) {
		List<String> names = new ArrayList<>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		// names.forEach(System.out::println);
		names.forEach(x -> System.out.println(x));
		Vehicle1.blowHorn();
	}
}
