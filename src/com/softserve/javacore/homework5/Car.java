package com.softserve.javacore.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    String type;
    int yearOfProduction;
    double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    private static int readCarYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter car year: ");
        return scanner.nextInt();
    }


    private static Car[] returnCars() {
        Car[] cars = new Car[4];
        cars[0] = new Car("crossover", 2016, 2.5);
        cars[1] = new Car("four-wheel drive", 1989, 3.7);
        cars[2] = new Car("crossover", 2018, 1.2);
        cars[3] = new Car("cabriolet", 2016, 2.0);

        return cars;
    }


    private static Car[] returnCertainCar(Car[] cars, int certainModelYear) {
        Car[] filteredCars = new Car[cars.length];
        int count = 0;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProduction() == certainModelYear) {
                filteredCars[i] = cars[i];
                count++;
            }
        }

        Car[] result = new Car[count];

        int j = 0;
        for (int i = 0; i < filteredCars.length; i++) {
            if (filteredCars[i] != null) {
                result[j] = filteredCars[i];
                j++;
            }
        }

        return result;
    }

    private static void sort(Car[] arrayToSort) {
        int j = 0;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            putTheMaxNumberAtTheEnd(arrayToSort, arrayToSort.length - j);
            j++;
        }
    }

    private static void putTheMaxNumberAtTheEnd(Car[] cars, int countOfElementsToConsider) {
        Car temp;
        for (int i = 0; i < countOfElementsToConsider - 1; i++) {
            if (cars[i].getYearOfProduction() > cars[i + 1].getYearOfProduction()) {
                temp = cars[i + 1];
                cars[i + 1] = cars[i];
                cars[i]= temp;
            }
        }
    }


    public static void main(String[] args) {

        Car[] cars = returnCars();

        System.out.println("Cars: " + Arrays.toString(cars));

        Car[] filteredCars = returnCertainCar(cars, readCarYear());

        System.out.println("Certain model year cars: " + Arrays.toString(filteredCars));

        sort(returnCars());

        System.out.println("Sortered cars by the field yesr: " + Arrays.toString(cars));
    }
}