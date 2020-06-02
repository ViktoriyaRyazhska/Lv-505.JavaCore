package HW_5;
import java.util.Scanner;
import java.util.Arrays;
public class MainCar {
	public enum Type{Tesla, BMW, Audi}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Car c1 = new Car();
		c1.setType("Tesla Model S");
		c1.setYear(2018);
        c1.setCapacity(0);
        
        Car c2 = new Car();
		c2.setType("BMW M4");
		c2.setYear(2016);
        c2.setCapacity(425);
        
        Car c3 = new Car();
		c3.setType("Audi A7");
		c3.setYear(2014);
        c3.setCapacity(340);
		
		System.out.println("Enter the model year: ");
		int year = scan.nextInt();
		switch(year) {
		case 2018:
			System.out.println(Type.Tesla);
			break;
		case 2016:
			System.out.println(Type.BMW);
			break;
		case 2014:
			System.out.println(Type.Audi);
			break;
		}
		
		
	}

}
