package Topic3;

public class Employee {
	private String name;
	private int rate;
	private int hours;

	public static double totalSum;
	
	public Employee() {
		this.name = "";
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return "name is " + this.name +
				" my rate is " + this.rate + 
				" i warked " + this.hours +
				" I earned "+ this.getSalary();
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
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getSalary() {
		return this.rate * this.hours;
	}

	public int changeRate(int rate) {
		return this.rate = rate;
	}

	public double getBonuses() {
		return this.getSalary() * 0.1;
	}
}
