package Lesson7Homework;

import java.util.*;

public class PracticalTask2 {

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new TreeMap<>();

        employeeMap.put(1242, "Volodymyr");
        employeeMap.put(2321, "Bogdan");
        employeeMap.put(42, "Vasyl");
        employeeMap.put(52, "Kolya");
        employeeMap.put(121, "Viktor");
        employeeMap.put(53, "Mykhailo");
        employeeMap.put(34, "Ira");
        System.out.println(employeeMap);
        Scanner sc = new Scanner(System.in);
        System.out.println("User please enter the ID : ");

        //Ask user to enter ID, then find and write corresponding name from your map.
        // If you can't find this ID - say about it to user (use function containsKey()).

        int ID = sc.nextInt();

        if (employeeMap.containsKey(ID)) {
            System.out.println("User name according to entered ID is  :: " + employeeMap.get(ID));

        } else {
            System.out.println("There is no User with such ID");

        }

        //Ask user to enter name, verify than you have name in your map and write corresponding ID.

        System.out.println("User please enter the Name : ");
        Scanner sc2 = new Scanner(System.in);
        String name = sc2.nextLine();

        if (employeeMap.containsValue(name)) {
            System.out.println(" The value " + name + " is present ");
        } else {

            System.out.println(" The value " + name + " is not present ");

        }

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println("Corresponding key is " + entry.getKey());
            }

            //  If you can't find this name - say about it to user (use function containsValue()).

            else
                System.out.println("There is no such name");
                break;

        }

    }

}





