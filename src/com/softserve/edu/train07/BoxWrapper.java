package com.softserve.edu.train07;

public class BoxWrapper {
	private Box box;
	
	public BoxWrapper() {
		box = new Box();
	}
	
	public Integer get() {
		return (Integer) box.get();
	}

	public void set(Integer obj) {
		box.set(obj);
	}
}
