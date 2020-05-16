package lesson3.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonInfo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		Person person1 = new Person();
		person1.setFirstName("Ostap");
		person1.setLastName("Malyu");
		person1.setBirthYear(2002);

		Person person2 = new Person();
		person2.setFirstName("Nazar");
		person2.setLastName("Der");
		person2.setBirthYear(2000);
		person2.input("Mechanic");
		
		Person person3 = new Person();
		person3.setFirstName("Lena");
		person3.setLastName("Mark");
		person3.setBirthYear(1995);
		person3.input("Pianist");
		
		Person person4 = new Person();
		person4.setFirstName("Ostap");
		person4.setLastName("Malyu");
		person4.setBirthYear(2003);
		
		Person person5 = new Person();
		person5.setFirstName("Roman");
		person5.setLastName("Ter");
		person5.setBirthYear(2002);
		person5.input("Dancer");
		
		System.out.println("Change first name for " + person4.getFirstName());
		person4.changeName(br.readLine());
		
		System.out.println(person3);
		System.out.println(person4);
		
		}

}
