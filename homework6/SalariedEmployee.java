package homework6;

public class SalariedEmployee extends Employee implements Calculable {

    private String socialSecurityNumber;
    private int salary;

    public SalariedEmployee(String id, String name, String socialSecurityNumber, int salary){
        this.setEmployeeId(id);
        this.setName(name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    @Override
    public int calculatePay() {
        return salary;
    }
}
