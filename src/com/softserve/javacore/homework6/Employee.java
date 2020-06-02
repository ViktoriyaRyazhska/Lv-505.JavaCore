package com.softserve.javacore.homework6;

import com.softserve.javacore.homework5.Car;

import java.util.Arrays;

public abstract class Employee implements CalculatePay {
    String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    private static void sort(Employee[] arrayToSort) {
        int j = 0;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            putTheMaxPayAtTheEnd(arrayToSort, arrayToSort.length - j);
            j++;
        }
    }

    private static void putTheMaxPayAtTheEnd(Employee[] employees, int countOfElementsToConsider) {
        Employee temp;
        for (int i = 0; i < countOfElementsToConsider - 1; i++) {
            if (employees[i].calculatePay() < employees[i + 1].calculatePay()) {
                temp = employees[i + 1];
                employees[i + 1] = employees[i];
                employees[i] = temp;
            }
        }
    }

    private static Employee[] returnEmployees() {
        Employee[] employees = new Employee[6];
        employees[0] = new SalariedEmployee("101", "01021989", 8.5, 200);
        employees[1] = new SalariedEmployee("102", "06061990", 15, 50);
        employees[2] = new SalariedEmployee("103", "12051992", 5, 168);
        employees[3] = new ContractEmployee("104", "03452305", 4200);
        employees[4] = new ContractEmployee("105", "03452306", 2500);
        employees[5] = new ContractEmployee("106", "03452307", 1000);

        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = returnEmployees();
        sort(employees);

        System.out.println("Arranged the entire sequence of workers descending the average monthly wage: " + Arrays.toString(employees));
        System.out.println();

        for (Employee employee : employees) {
            System.out.println("Employee: " + "EmployeeID: " + employee.getEmployeeId() + " " + "Employee average monthly wage :" + employee.calculatePay());
        }


    }
}

interface CalculatePay {
    double calculatePay();
}

class SalariedEmployee extends Employee implements CalculatePay {

    String socialSecurityNumber;
    double hourlyRate;
    double numberOfHoursWorked;


    public SalariedEmployee(String employeeId, String socialSecurityNumber, double hourlyRate, double numberOfHoursWorked) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeId='" + employeeId + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                '}';
    }

    @Override
    public double calculatePay() {
        double salary = hourlyRate * numberOfHoursWorked;
        return salary;
    }
}

class ContractEmployee extends Employee implements CalculatePay {

    String federalTaxIdNumber;
    double fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String federalTaxIdNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.federalTaxIdNumber = federalTaxIdNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeId='" + employeeId + '\'' +
                ", federalTaxIdNumber='" + federalTaxIdNumber + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }

    @Override
    public double calculatePay() {
        double salary = fixedMonthlyPayment;
        return salary;
    }

}
