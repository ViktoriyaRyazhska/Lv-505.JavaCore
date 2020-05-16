package lesson1.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {


	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter the radius (cm)");
		double radius = Double.parseDouble(br.readLine());
		double perimeter = 2 * Math.PI * radius;
		double area = 0.5  * Math.PI * radius;
		System.out.println("Perimeter "+perimeter);
		System.out.println("Area "+area);
		
	}

	

}
