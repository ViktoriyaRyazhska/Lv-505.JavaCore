package lesson3.homeWork;

public class Person {
	
	private String firstName;	
	private String lastName;	
	private int birthYear;
	private String infPer = "No info";
	
	public Person(){};
	
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	};
		
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getAge() {
		return 2020-birthYear;
	}
	
	public String output() {
		return infPer;
	}

	public void input(String infPer) {
		this.infPer = infPer;
	}

	public void changeName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void changeName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + ", info="
				+ infPer + "]";
	}

	
}
