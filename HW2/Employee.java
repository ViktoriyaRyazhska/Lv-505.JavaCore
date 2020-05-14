public class Employee {

    private String name;
    private int rate;
    private double hours;
    private static double totalSum = 0;

    public Employee(){}

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, double hours) {
        //totalSum = totalSum - this.getSalary();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + this.getSalary();
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

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum = totalSum - getSalary();
        this.hours = hours;
        totalSum = totalSum + getSalary();
    }

    public double getSalary(){
        return this.rate * this.hours;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public void changeRate(int rate){
        totalSum = totalSum - getSalary();
        this.rate = rate;
        totalSum = totalSum + getSalary();
    }

    public void getBonuses(){
        totalSum = totalSum - getSalary();
        double salary = this.getSalary() * 1.1;
        totalSum = totalSum + salary;

    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Valera", 10, 20);
        System.out.println(totalSum);
        Employee emp2 = new Employee("Lola", 100, 1);
        System.out.println(totalSum);
        Employee emp3 = new Employee("Koromislo", 1, 300);
        System.out.println(totalSum);
        System.out.println();
        System.out.println(emp1.getSalary());
        emp1.changeRate(20);
        System.out.println(totalSum);
        System.out.println(emp1.getSalary());
        emp1.setHours(35);
        System.out.println(totalSum);
        System.out.println(emp1.getSalary());
        emp1.getBonuses();

        System.out.println(emp1.getSalary());
        System.out.println(totalSum);
        System.out.println();

        System.out.println(totalSum);
        emp3.getBonuses();

        System.out.println(totalSum);


    }
}
