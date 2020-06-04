package com.softserve.edu.train08;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable<Student> {

	public static class ByName implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getName().compareTo(st2.getName());
		}
	}

	public static class ById implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getId() - st2.getId();
		}
	}

	private String name;
	private int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Student other) {
		return getName().compareTo(other.getName());
		// return getId() - other.getId();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Student other = (Student) obj;
		if ((id != other.id) || ((name == null) && (other.name != null)) || ((name != null) && (other.name == null))) {
			return false;
		} else if ((name == null) && (other.name == null)) {
			return true;
		}
		return name.equals(other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}

public class Appl {
	public static void main(String[] args) {
		/*-
		Map<Object, String> map = new HashMap<>();
		map.put(1, "Ivan");
		map.put(2.2, "Petro");
		map.put("Ivan", "Ira");
		map.put(1, "Super_Ivan");
		//
		System.out.println("map.get(0) = " + map.get(0));
		System.out.println("map.get(1) = " + map.get(1));
		System.out.println("map.get(2.2) = " + map.get(2.2));
		System.out.println("map.get(Ivan) = " + map.get("Ivan"));
		//Queue q;
		//
		ArrayList<Integer> list = new ArrayList<>(10);
		for (int i = 0; i < 16; i++) {
			list.add(i);
		}
		System.out.println("list = " + list);
		list.ensureCapacity(10);
		System.out.println("list = " + list);
		//
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		System.out.println("list = " + list);
		list.add(0, "One more first element");
		System.out.println("list = " + list);
		//
		List<String> list = Arrays.asList("bb", "cc", "aa");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.print(element + "  ");
		}
		//
		//		String[] arr = {"stepan", "roman", "ivan", "petro", "ivan", "ira", "stepan"};
		//		System.out.println("Origin = " + Arrays.toString(arr));
		//		Arrays.sort(arr);
		//		System.out.println("Sorted = " + Arrays.toString(arr));
		// Integer[] arr = { 4, 1, 2, 1, 3, 4, 2 };
		Student[] arr = { new Student("ivan", 23), new Student("petro", 25), new Student("ivan", 23),
				 new Student("ira", 24),  new Student("stepan", 21),  new Student("roman", 26)};
		//
		System.out.println("Origin = " + Arrays.toString(arr));
		Arrays.sort(arr, new Student.ById());
		System.out.println("Sorted = " + Arrays.toString(arr));
		//		for (Student current : arr) {
		//			System.out.println("current = " + current + " hash = " + current.hashCode());
		//		}
		//
		// Set<String> set = new HashSet<>();
		// Set<Integer> set = new HashSet<>();
		// Set<Student> set = new HashSet<>();
		Set<Student> set = new TreeSet<>(new Student.ById());
		//Set<String> set = new TreeSet<>();
		//
		// List<String> list = new ArrayList<>();
		// for (int i = 0; i < args.length; i++) {
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				System.out.println("Duplicate detected: " + arr[i]);
			}
		}
		System.out.println("Set = " + set);
		//
		Student[] arr = { new Student("ivan", 23), new Student("petro", 25), new Student("ivan", 23),
				 new Student("ira", 24),  new Student("stepan", 21),  new Student("roman", 26)};
		List<Student> list = Arrays.asList(arr);
		list.add(new Student("igor", 28)); // error
		//
		List<Student> list = new ArrayList<>();
		list.add(new Student("ivan", 23));
		list.add(new Student("ira", 24));
		list.add(new Student("petro", 25));
		list.add(new Student("stepan", 21));
		list.add(new Student("ivan", 23));
		list.add(new Student("roman", 26));
		list.add(new Student("igor", 28));
		System.out.println("Origin = " + list);
		//list.sort(new Student.ByName());
		Collections.sort(list, new Student.ById());
		System.out.println("Sorted = " + list);
		//
		//Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>();
		Map<String, String> map = new LinkedHashMap<>();
		map.put("1", "Ivan");
		map.put("2.2", "Petro");
		map.put("Ivan", "Ira");
		map.put("12", "Super_Ivan");
		System.out.println(map);
		*/
		// Map<Student, String> map = new LinkedHashMap<>();
		Map<Student, String> map = new TreeMap<>(new Student.ById());
		map.put(new Student("ivan", 23), "ivan");
		map.put(new Student("ira", 24), "ira");
		map.put(new Student("petro", 25), "petro");
		map.put(new Student("stepan", 21), "stepan");
		map.put(new Student("roman", 26), "roman");
		map.put(new Student("igor", 28), "igor");
		map.put(new Student("igor", 29), "igor2");
		System.out.println(map);
		//
		for (Map.Entry<Student, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " \t" + entry.getValue());
		}
		//
		map.remove(new Student("igor", 28));
		//
		for (Iterator<Map.Entry<Student, String>> i = map.entrySet().iterator(); i.hasNext();) {
			Map.Entry<Student, String> entry = (Map.Entry<Student, String>) i.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
