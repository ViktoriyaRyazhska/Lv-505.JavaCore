package lesson5.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	private String name;
	private int departmentNum;
	private int salary;

	public Employee(String name, int departmentNum, int salary) {
		this.name = name;
		this.departmentNum = departmentNum;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getDepartmentNum() {
		return departmentNum;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + departmentNum + ", salary=" + salary + "]";
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int depNum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Employee[] emps = { 
				new Employee("Vasia", 3, 2000),
				new Employee("Lilia", 2, 700),
				new Employee("Bogdan", 3, 1000),
				new Employee("Viktor", 1, 1200),
				new Employee("Anna", 4, 1900) };

		System.out.print("Enter the department number ");
		depNum=Integer.parseInt(br.readLine());

		for (Employee element : emps) {
			if (depNum == element.getDepartmentNum()) {
				System.out.println(element);
			}
		}

	}
}
