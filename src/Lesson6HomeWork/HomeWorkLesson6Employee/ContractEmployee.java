package Lesson6HomeWork.HomeWorkLesson6Employee;

public class ContractEmployee extends Employee implements PayCalculation {

    private String sphere;
    private String name;
    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeld, String sphere, String name, String federalTaxIdmember, int fixedMonthlyPayment) {
        super(employeeld);
        this.sphere = sphere;
        this.name = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
    //For employees with a fixed payment the formula is:

    public int calculatePay() {
        return this.fixedMonthlyPayment;
    }

    public String getSphere() {
        return sphere;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +

                ", name='" + name + '\'' +
                '}';
    }
}
