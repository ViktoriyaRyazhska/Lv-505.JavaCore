package Topic3;

public class Person {

	@Override
	public String toString() {
		return "Person [firstName="
	+ firstName +
	", lastName = "
	+ lastName +
	", birthYear = "
	+ (2020 - birthYear) + "]";
	}

	private String firstName;
	private String lastName;
	private int birthYear;

	public Person() {

	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;

	}

	public int getAge() {
		return birthYear;
	}

	public String input() {
		return "firstName = " + this.firstName + "lastName= " + this.lastName;
	}

	public String output() {
		return "firstName = " + this.firstName + "lastName= " + this.lastName;
	}

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
}