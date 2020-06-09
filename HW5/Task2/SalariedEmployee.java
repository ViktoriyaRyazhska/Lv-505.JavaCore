package HW5.Task2;

public class SalariedEmployee extends Employee implements CalculatePay {
    private String socialSecurityNumber;
    private double Salary;

    public SalariedEmployee(){};

    public SalariedEmployee(String employeeId, String name, String position, String socialSecurityNumber, double salary) {
        super(employeeId, name, position);
        this.socialSecurityNumber = socialSecurityNumber;
        this.Salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    @Override
    public double calculatePay() {
        return this.Salary;
    }
}
