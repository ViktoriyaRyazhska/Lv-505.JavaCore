package Lesson6HomeWork.HomeWorkLesson6Employee;

import java.util.Arrays;

public class EmployeeAppMain {

    public static void main(String[] args) {

        Employee emp1 = new SalariedEmployee("qwert", "Medicine", 10, "John", "Johngasfgsa323", 8);
        Employee emp2 = new SalariedEmployee("abcdef", "Bank manager", 12, "Susan", "Susaneuyeeye434", 7);
        Employee emp3 = new SalariedEmployee("hedhe", "Accounting", 13, "Rachel", "Rachel4141jk", 12);
        Employee emp4 = new ContractEmployee("ggsg", "Programming", "Malcolm", "Malcolmgsdggws859", 1000);
        Employee emp5 = new ContractEmployee("hdh", "Sports", "Mike", "Mikehdhjfj45", 2000);
        Employee emp6 = new ContractEmployee("jrfjd3", "Customs", "Patrick", "Patrickhdh34", 3000);

        //Employee []employees = {new SalariedEmployee("qwert","Medicine",10,"John","Johngasfgsa323",8),
        // new SalariedEmployee("abcdef","Bank manager",12,"Susan","Susaneuyeeye434",7),
        // new SalariedEmployee("hedhe","Accounting",13,"Rachel","Rachel4141jk",12),
        // new ContractEmployee("ggsg","Programming","Malcolm","Malcolmgsdggws859",1000),
        //new ContractEmployee("hdh","Sports","Mike","Mikehdhjfj45",2000),
        //  new ContractEmployee("jrfjd3","Customs","Patrick","Patrickhdh34",3000)};

        //Create an array of employees and add the employees with different form of payment.
        Employee[] employees = {emp1, emp2, emp3, emp4, emp5, emp6};

//Output the employee ID, name, and the average monthly wage for all elements of the list.
        int totalSalarySum = 0;
        for (Employee current : employees) {
            int currentSalary = current.calculatePay();
            System.out.println("Employee salary is " + currentSalary + " Employee description: " + current.toString());
            totalSalarySum = totalSalarySum + currentSalary;
        }
        System.out.println("Average monthly salary is " + totalSalarySum / employees.length);

//Created temporary employee
        Employee tmp;
//Arrange the entire sequence of workers descending the average monthly wage
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1; j++) {

                if (employees[j].calculatePay() < employees[j + 1].calculatePay()) {
                    tmp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = tmp;

                }
            }
        }

        System.out.println("Descending list of Employees is: ");
        System.out.println(Arrays.toString(employees));

        for (Employee current : employees) {
            System.out.println(current.toString() + " Employee Id is " + current.getEmployeeld()  +  " Employee salary is " +  current.calculatePay());
        }
    }
}
