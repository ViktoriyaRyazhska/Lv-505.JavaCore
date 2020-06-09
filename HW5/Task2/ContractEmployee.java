package HW5.Task2;

public class ContractEmployee extends Employee implements CalculatePay{
    private String federalTaxIdmember;
    private double hourRate;
    private int workingHours;

    public ContractEmployee(){};

    public ContractEmployee(String employeeId, String name, String position,String federalTaxIdmember, double hourRate, int workingHours) {
        super(employeeId, name, position);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourRate = hourRate;
        this.workingHours = workingHours;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", hourRate=" + hourRate +
                ", workingHours=" + workingHours +
                '}';
    }

    @Override
    public double calculatePay() {
        return this.getWorkingHours() * this.hourRate;
    }

}
