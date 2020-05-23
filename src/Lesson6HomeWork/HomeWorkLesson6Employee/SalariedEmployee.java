package Lesson6HomeWork.HomeWorkLesson6Employee;

public class SalariedEmployee extends Employee implements PayCalculation {

    private String sphere;
    private int hourlyRate;
    private String name;
    private String socialSecurityNumber;
    private int numberOfHours;

    public SalariedEmployee(String employeeld, String sphere, int hourlyRate, String name, String socialSecurityNumber, int numberOfHours) {
        super(employeeld);
        this.sphere = sphere;
        this.hourlyRate = hourlyRate;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +

                ", name='" + name + '\'' +

                '}';
    }
    //The calculation formula for the "time-worker“ is
    public int calculatePay() {

        return this.numberOfHours * this.hourlyRate;

    }
    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getSphere() {
        return sphere;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }

    public int getHourRate() {
        return hourlyRate;
    }

    public void setHourRate(int hourRate) {
        this.hourlyRate = hourRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }
}
