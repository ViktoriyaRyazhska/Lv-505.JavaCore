package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Less7 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String task = " ";

        while (true) {
            System.out.println("What task do you want to see?\n" +
                    "1 - Lists;\n2 - Map;\n0 - exit from application.");
            task = br.readLine();

            switch (task) {
                case "1":
                    Less7.doLists();
                    break;
                case "2":
                    Less7.doMap();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, no such choice, please repeat.");
            }
        }
    }

    //Method for practical task 1
    private static void doLists() throws IOException {
        List<Integer> myCollection = new LinkedList<>();

        String choice = "";

        System.out.println("\nDo you want to fill the collection of integers yourself or fill it randomly:");

        while (myCollection.isEmpty()) {
            System.out.println("1 - to fill yourself;\n2 - to fill random.");
            choice = br.readLine();
            switch (choice) {
                case "1":
                    fillCollection(myCollection, 10);
                    break;
                case "2":
                    fillCollectionRandom(myCollection, 10, 30);
                    break;
                default:
                    System.out.println("Wrong input, please repeat.");
            }
        }

        System.out.println("\nCollection is:\n" + myCollection);

        List<Integer> newCollection = new ArrayList<>(
                positionsOfValuesGreaterThan(myCollection, 5));
        System.out.println("\nPositions of element >5 of previous collection:\n"
                + newCollection);

        removeFromCollectionGreaterThan(myCollection, 20);
        System.out.println("\nCollection without elements >20:\n"
                + myCollection);

        addToCollectionWithPosition(myCollection, new int[]{1, -3, -4}, new int[]{2, 8, 5});
        System.out.println("\nAdded to collection values 1, -3, -4 to positions 2, 8, 5:");
        printCollection(myCollection);

        Collections.sort(myCollection);
        System.out.println("\nSorted collection:\n" + myCollection);
        System.out.println("\nTask 1 done!\n");

    }

    //Additional methods for practical task 1
    private static void fillCollection(Collection collection, int amount) throws IOException {
        System.out.println("Enter " + amount + " integer numbers:");
        for (int i = 0; i < amount; i++) {
            System.out.print((i + 1) + ": ");
            collection.add(Integer.parseInt(br.readLine()));
        }
    }

    private static void fillCollectionRandom(Collection collection, int amount, int maxValueFromZero) {
        for (int i = 0; i < amount; i++) {
            collection.add((int) (Math.random() * maxValueFromZero));
        }
    }

    private static Collection<Integer> positionsOfValuesGreaterThan(List<Integer> collection, int greaterThan) {
        Collection positionCollection = new ArrayList();
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) > greaterThan)
                positionCollection.add(i);
        }
        return positionCollection;
    }

    private static void removeFromCollectionGreaterThan(Collection collection, int value) {
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            if ((int) iterator.next() > value) {
                iterator.remove();
            }
        }
    }

    private static void addToCollectionWithPosition(List collection, int[] values, int[] positions) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < values.length || i < positions.length; i++) {
            map.put(positions[i], values[i]);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() > collection.size()) {
                collection.add(entry.getValue());
                continue;
            }
            collection.add(entry.getKey(), entry.getValue());
        }
    }

    private static void printCollection(List collection) {
        Iterator iterator = collection.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println("position - " + i + ", value of element – " + iterator.next());
            i++;
        }
    }

    //Method for practical task 2
    private static void doMap() throws IOException {

        Map<Integer, String> employeeMap = new LinkedHashMap<>();
        employeeMap.put(12, "Vasyl");
        employeeMap.put(1, "Orest");
        employeeMap.put(7, "Ivan");
        employeeMap.put(43, "Stepan");
        employeeMap.put(60, "Vasyl");
        employeeMap.put(33, "Sergiy");
        employeeMap.put(9, "Vasyl");

        printMapIdName(employeeMap);

        System.out.print("\nEnter Id, which you want to find: ");
        System.out.println("This Id has " + findNameByID(employeeMap, Integer.parseInt(br.readLine())));

        System.out.print("\nEnter name, whose id you want to find: ");
        String testName = br.readLine();
        int[] test = findIdByName(employeeMap, testName);
        System.out.print("Id with this name: ");
        printArrayOfInteger(test);
        System.out.println("\nTask 2 done!\n");

    }

    //Additional methods for practical task 2

    private static void printMapIdName(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Id: " + entry.getKey() + "\tname: " + entry.getValue());
        }
    }

    private static String findNameByID(Map<Integer, String> map, int Id) throws IOException {
        if (map.containsKey(Id)) {
            return map.get(Id);
        }
        System.out.print("Can't find such Id, please repeat: ");
        return findNameByID(map, Integer.parseInt(br.readLine()));
    }

    private static int[] findIdByName(Map<Integer, String> map, String name) throws IOException {

        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        if (map.containsValue(name)) {
            int[] idTest = new int[map.size()];
            int i = 0;
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(name)) {
                    idTest[i] = entry.getKey();
                    i++;
                }
            }
            int[] id = new int[i];
            for (int j = 0; j < id.length; j++) {
                id[j] = idTest[j];
            }
            return id;
        }
        System.out.print("Can't find such Id, please repeat: ");
        String testName = br.readLine();
        return findIdByName(map, testName);
    }

    private static void printArrayOfInteger(int[] array) {
        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
    }
}