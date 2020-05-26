package HW4;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {


        Car[] cars = {new Car("Fiat", 1988, 500),
                new Car("Opel", 1970, 600),
                new Car("Ferrari", 2005, 300),
                new Car("Volvo", 2020, 700)};
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter year of production: ");
        int year = Integer.parseInt(sc.nextLine());
        sc.close();

        // Select cars by year

        for (
                Car current : cars) {
            if (year == current.getYearOfProduction()) {
                System.out.println(current);
            }
        }
        System.out.println();
        System.out.println("Array before sort: ");

        for (
                Car current : cars) {
            System.out.println(current);
        }

        System.out.println();
//        Calling sorting here
        Car.sortYear(cars);

        System.out.println();
        System.out.println("Array after sort by year: ");

        for (
                Car current : cars) {
            System.out.println(current);
        }
    }
}
