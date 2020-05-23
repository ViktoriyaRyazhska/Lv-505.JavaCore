package study.homework6;

public class ContractEmployee extends Employee implements Calculable{

    private final int RATE = 25;

    private String federalTaxIdMember;
    private int hours;

    public ContractEmployee(String id, String name, String federalTaxIdMember, int hours){
        this.setEmployeeId(id);
        this.setName(name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hours = hours;
    }

    @Override
    public int calculatePay() {
        return RATE*hours;
    }


}
