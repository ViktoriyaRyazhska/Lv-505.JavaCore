package homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hm6 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String task = " ";

        while (true) {
            System.out.println("What task do you want to see?\n" +
                    "1 - birds;\n2 - employee;\n0 - exit from application.");
            task = br.readLine();

            switch (task) {
                case "1":
                    Hm6.birds();
                    break;
                case "2":
                    Hm6.employee();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, no such choice, please repeat.");
            }
        }
    }

    private static void birds() {

        Bird[] birds = {
                new Eagle(2, "brown and white", 3, 12),
                new Penguin(4, "black & white", 1),
                new Swallow(3, "blue, orange and white", 2, 4),
                new Chicken(2, "brown", 14)};

        for (Bird bird : birds) {
            bird.output();
            bird.fly();
            System.out.println();
        }
    }

    private static void employee() {

        Object[] employees = {
                new SalariedEmployee("1001", "John", "023-02-1233", 1200),
                new SalariedEmployee("1022", "Jack", "045-01-749", 900),
                new ContractEmployee("2045", "Jimmy", "142-533-6371", 38),
                new ContractEmployee("2011", "Bob", "044-560-3991", 30),
                new ContractEmployee("2082", "Fred", "047-331-8834", 41)};

        Calculable testEmployee;
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (((Calculable) employees[j]).calculatePay() < ((Calculable) employees[j + 1]).calculatePay()) {
                    testEmployee = ((Calculable) employees[j]);
                    employees[j] = employees[j + 1];
                    employees[j + 1] = testEmployee;
                }
            }
        }

        for (Object empl : employees) {
            System.out.println("ID: " + ((Employee) empl).getEmployeeId() + ", " + ((Employee) empl).getName() +
                    " has weekly salary: "+ ((Calculable) empl).calculatePay());
        }

        System.out.println();
    }

}