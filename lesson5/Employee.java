package lesson5;

public class Employee {
    private String name;
    private int depNum;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepNum() {
        return depNum;
    }

    public void setDepNum(int depNum) {
        this.depNum = depNum;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int depNum, double salary) {
        this.name = name;
        this.depNum = depNum;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name +
                ", department number: " + depNum +
                ", salary = " + salary +
                '.';
    }

    public static void departColl(Employee[] employees, int depNum) {
        for (Employee employee : employees) {
            if (employee.depNum == depNum) {
                System.out.println(employee.getName());
            }
        }
    }

    public static Employee[] descSort(Employee[] employees){
        Employee testEmployee;
        for (int i=0;i<employees.length; i++){
            for (int j=0;j<employees.length-1; j++){
                if (employees[j].salary<employees[j+1].salary){
                    testEmployee = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = testEmployee;
                }
            }
        }
        return employees;
    }
}
