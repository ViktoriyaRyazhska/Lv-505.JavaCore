package pac1;

public class Employee {
	private String name;
	private double stavka;
	private double hourse;
	
	private double salary;
	
	private static double totalSum=0;
	// Constructors
	
	public Employee() {};
	
	
	public Employee(String name, double stavka) {
		super();
		this.name = name;
		this.stavka = stavka;
		totalSum = totalSum + getSalary(null);
	
	}
	
	
    public Employee(String name, double stavka, double hourse) {
		super();
		this.name = name;
		this.stavka = stavka;
		this.hourse = hourse;
		totalSum = totalSum + getSalary(null)+ getBonuses(null);
	
	}



	//Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStavka() {
		return stavka;
	}

	public void setStavka(double stavka) {
		this.stavka = stavka;
		totalSum = totalSum + getSalary(null)+getBonuses(null);
	}

	public double getHourse() {
		return hourse;
	}

	public void setHourse(double hourse) {
		this.hourse = hourse;
		totalSum = totalSum + getSalary(null);
	}

	public static double getTotalSum() {
		return totalSum;
	}
	
	public double getSalary(Employee a) {
		return salary = hourse * stavka;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", stavka=" + stavka + ", hourse=" + hourse + "]";
	}
	
	/*public double changeStavka(Employee e) {
		return ;
	}
	*/
	
	public double getBonuses(Employee e) {
		return this.salary=salary*0.1;
	}


}
