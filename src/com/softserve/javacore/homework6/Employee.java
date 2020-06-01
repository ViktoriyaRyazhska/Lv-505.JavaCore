package com.softserve.javacore.homework6;

public abstract class Employee implements CalculatePay {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("101", "01021989", 8.5, 32);
        employees[1] = new SalariedEmployee("102", "06061990", 15, 16);
        employees[2] = new SalariedEmployee("103", "12051992", 5, 48);
        employees[3] = new ContractEmployee("104", "03452305", 1500);
        employees[4] = new ContractEmployee("105", "03452306", 2500);
        employees[5] = new ContractEmployee("106", "03452307", 4200);

        employees[0].calculatePay();
        employees[1].calculatePay();
        employees[2].calculatePay();
        employees[3].calculatePay();
        employees[4].calculatePay();
        employees[5].calculatePay();

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
