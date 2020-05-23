package lesson5.homeWork;

import java.util.Scanner;

public class Car {
	private String type;
	private int year;
	private double engine;

	Car() {
	}

	Car(String type, int year, double engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}

	public int getYear() {
		return year;
	}

	public double getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engine=" + engine + "]";
	}

	public static void main(String[] args) {
		int modelYear = 0;
		boolean modelYearN=true;
		Car tmp = new Car();

		Car[] car = { new Car("jeep", 2016, 3.4), new Car("sports car", 2007, 4.0), new Car("jeep", 2007, 2.0),
				new Car("crossover", 2018, 3.6) };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the model year");
		modelYear = sc.nextInt();
		for (int i = 0; i < car.length; i++) {
			if (modelYear == car[i].getYear()) {
				System.out.println(car[i]);
				modelYearN=false;
			} 
		}
		if (modelYearN) {
			System.out.println("There are no models this year");
		}
		
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear() > car[j].getYear()) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		
		System.out.println("\nAll cars are sorted by year");
		
		for(Car element : car) {
			System.out.println(element);
		}
	}
}
