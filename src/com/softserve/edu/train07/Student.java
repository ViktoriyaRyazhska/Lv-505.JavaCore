package com.softserve.edu.train07;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	
	public static class ByName implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return -st1.getName().compareTo(st2.getName());
		}
	}
	
	public static class ById implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getId() - st2.getId();
		}
	}
	
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student student) {
		//return name.compareTo(student.getName());
		return id - student.getId();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
