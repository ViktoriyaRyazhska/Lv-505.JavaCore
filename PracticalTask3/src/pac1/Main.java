package pac1;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Oksana", 20.5, 8);
		Employee e2 = new Employee("Sasha", 21, 9);
		Employee e3 = new Employee("Serhiy", 20, 7.1);
		
		e1.setStavka(10);
		e2.setHourse(100);
		
		
		System.out.println("Our Employees:");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println();
		
		System.out.println(e1.getSalary(e1));
		System.out.println(e2.getSalary(e2));
		System.out.println(e3.getSalary(e3));
			

		System.out.println();	
        
		System.out.println(Employee.getTotalSum());
		
	}

}
