package HW5.Task2;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee[] employees = {new ContractEmployee("01", "Valera", "devops", "13132131", 50, 160),
                new ContractEmployee("02", "Volodya", "PM", "4654131", 25, 50),
                new ContractEmployee("03", "Valdemar", "BA", "34649984", 30, 3),
                new SalariedEmployee("04", "Gena", "develpoer", "5454454545", 50000),
                new SalariedEmployee("05", "Petya", "cleaning service", "7777777", 500),
                new SalariedEmployee("06", "Filip", "delivery courier", "9988445", 250),};


        System.out.println("Unsorted massive is");

        for (Employee current : employees){
            System.out.println("Person " + current.getName() + " Have a salary of: " + current.calculatePay());
        }

        // Sorting a massive

        Employee tmp;
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[i].calculatePay() > employees[j].calculatePay()){
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
        System.out.println("Sorted massive is: ");
        //Calculating avg salary and printing out array
        double totalSalarySum = 0;
        for (Employee current : employees){
            System.out.println("Person " + current.getName() + " Have a salary of: " + current.calculatePay());
            totalSalarySum += current.calculatePay();
        }
        System.out.println("Total salary sum :" + totalSalarySum);
        System.out.println("Avg salary is : " + (totalSalarySum/employees.length));
    }
}
