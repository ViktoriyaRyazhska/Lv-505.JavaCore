package Lesson6HomeWork.HomeWorkLesson6Employee;

public abstract class Employee implements PayCalculation {

    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public int calculatePay() {
        return 0;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                '}';
    }
}

