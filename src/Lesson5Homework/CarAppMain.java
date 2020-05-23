package Lesson5Homework;
import java.util.Arrays;
import java.util.Scanner;

public class CarAppMain {
    public static void main(String[] args) {

        Car[] cars = {new Car("BMW", 1999, 200),
                new Car("Audi", 2003, 333),
                new Car("Mercedes", 1997, 250)};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter model year: ");
        int modelYear = sc.nextInt();
        sc.close();

        for (Car current : cars) {
            if (modelYear == current.getYearOfProduction()) {
                System.out.println(current);
            }
        }
        int tmp;

        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {

                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    tmp = cars[i].getYearOfProduction();
                    cars[i].yearOfProduction = cars[j].getYearOfProduction();
                    cars[j].yearOfProduction = tmp;

                }
            }
        }
        System.out.println("Sorted in ascending order " + Arrays.toString(cars));

    }
}
