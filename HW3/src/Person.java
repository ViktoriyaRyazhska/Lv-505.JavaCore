import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person () {}
	

	public Person(String firstName, String lastName) {
	 	this.firstName = firstName;
	 	this.lastName = lastName;
	 }
	
	public int getAge() {
		return 2020 - birthYear;
	}
	
	public void input(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name:");
		this.firstName = br.readLine();
		System.out.println("Enter your lastName:");
		this.lastName = br.readLine();
		System.out.println("Enter your birthYear:");
		this.birthYear = Integer.parseInt(br.readLine());
	}
	
	public void output() {
		System.out.println("Name:" + firstName + "lastName:" + lastName + "Age:" + getAge() + "birthYear:" + birthYear);
	}
	
	public void changeName(String ... strings) {

		for(String str1: strings) {
		this.firstName = str1;
		this.lastName=str1;
		};
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
