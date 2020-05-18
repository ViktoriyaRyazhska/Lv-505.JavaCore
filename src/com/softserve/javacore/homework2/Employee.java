package com.softserve.javacore.homework2;

public class Employee {

    private String name;
    private double rate;
    private double hours;
    static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }


    public double getSalary() {
        return rate * hours;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public void changeRate(int newRate) {
        rate = newRate;
    }

    public double getBonuses() {
        return (rate * hours) * 0.1;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Roman", 2000, 22 * 8);
        Employee employee2 = new Employee("Khrystyna", 1000, 22 * 8);
        Employee employee3 = new Employee("Illia", 5000, 22 * 8);

        System.out.println(employee1.getSalary() + employee2.getSalary() + employee3.getSalary());

        employee2.changeRate(1300);
        employee3.changeRate(5500);

        System.out.println(employee1.getSalary() + employee2.getSalary() + employee3.getSalary());


    }

}