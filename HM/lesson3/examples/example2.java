package lesson3.examples;

public class example2 {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Bogdan");
		emp1.setHours(4);
		emp1.setRate(1);
		
		Employee emp2 = new Employee();
		emp2.setName("Anna");
		emp2.setHours(8);
		emp2.setRate(2);
		
		Employee emp3 = new Employee();
		emp3.setName("Roman");
		emp3.setHours(16);
		emp3.setRate(3);
		
		emp2.setRate(3);
		emp3.setHours(10);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp3.getName()+" salary = "+emp3.getSalary());
		
		Employee.totSum();
	}
}
