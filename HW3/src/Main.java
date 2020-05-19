import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		person1.input(null);
		
		
		person1.output();
		
		person1.changeName("Olya", "Pal");
		
		person1.output();
			
		

	}
}