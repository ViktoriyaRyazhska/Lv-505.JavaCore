package lesson3.examples;

public class Employee {
	private String name = " ";
	private int rate = 1;
	private int hours = 1;
	private double bonus = 0;
	
	static public double totalSum=0;
	
	 public Employee() {}
	 
	 public Employee(String name, int rate) {
		 this.name = name;
		 this.rate = rate;
	 }
	 
	 public Employee(String name, int rate, int hours) {
		 this.name = name;
		 this.rate = rate;
		 this.hours = hours;
	 }
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
		getSalary();
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
		getSalary();
	}

	public double getSalary() {
		totalSum-=this.bonus;
		this.bonus = this.rate * this.hours;
		this.bonus *= 1.1;
		totalSum+=this.bonus;
		return this.bonus;
	 }

	 public void changeRate(int rate){
		 this.rate = rate;
		 getSalary();
		 
	 }
	 
	
	 public static void totSum() {
		 System.out.println("Total salary = "+totalSum);
	 }
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	 
	 
}
