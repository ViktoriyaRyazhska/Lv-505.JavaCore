package com.softserve.edu.train07;

//public class BoxGen<T extends MyEquals> {
public class BoxGen<T> {
	private T obj;

	public BoxGen() {
		//obj = T(); // Error
	}
	
	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}
	
//	public int getMyId() {
//		return obj.getId();
//	}
}
