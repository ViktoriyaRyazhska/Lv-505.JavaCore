package homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hm7 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String task = " ";

        while (true) {
            System.out.println("What task do you want to see?\n" +
                    "1 - Union and intersection of sets;\n2 - Map of people;\n" +
                    "3 - list of students;\n0 - exit from application.");
            task = br.readLine();

            switch (task) {
                case "1":
                    unionAndIntersection();
                    break;
                case "2":
                    mapOfPerson();
                    break;
                case "3":
                    listOfStudents();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, no such choice, please repeat.");
            }
        }
    }

    private static void unionAndIntersection() {

        System.out.println("\nTask 1.\n");

        Set<Integer> first = new TreeSet<>();
        first.add(5);
        first.add(7);
        first.add(6);
        first.add(1);
        first.add(9);
        first.add(54);
        first.add(0);

        Set<Integer> second = new TreeSet<>();
        second.add(-7);
        second.add(0);
        second.add(2);
        second.add(5);
        second.add(9);
        second.add(-33);
        second.add(-45);

        System.out.println("First <Integer> set is:" + first);
        System.out.println("Second <Integer> set is:" + second);
        System.out.println("Union is: " + union(first, second));
        System.out.println("Intersection is: " + intersection(first, second));

        Set<String> firstStr = new TreeSet<>();
        firstStr.add("asq");
        firstStr.add("ff");
        firstStr.add("-3");
        firstStr.add("2dhy");
        firstStr.add("93(d");
        firstStr.add("oo");
        firstStr.add("0");

        Set<String> secondStr = new TreeSet<>();
        secondStr.add("rfv");
        secondStr.add("0");
        secondStr.add("vvv");
        secondStr.add("abc");
        secondStr.add("ff");

        System.out.println("\nFirst <String> set is:" + firstStr);
        System.out.println("Second <String> set is:" + secondStr);
        System.out.println("Union is: " + union(firstStr, secondStr));
        System.out.println("Intersection is: " + intersection(firstStr, secondStr));

        System.out.println("\nTask 1 done.\n");

    }

    private static <T> Set<T> union(Set<T> first, Set<T> second) {

        Set<T> union = new TreeSet<>();
        union.addAll(first);
        union.addAll(second);
        return union;
    }

    private static <T> Set<T> intersection(Set<T> first, Set<T> second) {
        Set<T> intersection = new TreeSet<>();
        Iterator iterator = first.iterator();
        while (iterator.hasNext()) {
            T test = (T) iterator.next();
            if (second.contains(test)) {
                intersection.add(test);
            }
        }
        return intersection;
    }

    private static void mapOfPerson() {

        System.out.println("\nTask 2.\n");

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Stolyar", "Petro");
        personMap.put("Gyk", "Igor");
        personMap.put("Altshiller", "Nazar");
        personMap.put("Pron", "Ivan");
        personMap.put("Chuk", "Vasyl");
        personMap.put("Sikorsky", "Stepan");
        personMap.put("Pit", "Volodymyr");
        personMap.put("Grelya", "Igor");
        personMap.put("Ivancho", "Andriy");
        personMap.put("Voronyak", "Oleg");

        System.out.println("Map of persons is:");
        printMap(personMap);
        System.out.println();
        System.out.println(checkValueForUnique(personMap) ?
                "All person's name in map is unique." :
                "We have people with same names.");

        System.out.println("\nDelete people with name Igor.");
        removeValue(personMap, "Igor");
        System.out.println("\nNow map is:");
        printMap(personMap);
        System.out.println();
        System.out.println(checkValueForUnique(personMap) ?
                "All person's name in map is unique." :
                "We have people with same names.");
        System.out.println("\nTask 2 done.\n");
    }

    private static <T, E> void printMap(Map<T, E> map) {
        int i = 1;
        for (Map.Entry<T, E> entry : map.entrySet()) {
            System.out.println(i + ". " + entry.getKey() + " " + entry.getValue());
            i++;
        }
    }

    private static <T, E> boolean checkValueForUnique(Map<T, E> map) {
        Set<E> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }

    private static <T, E> void removeValue(Map<T, E> map, E value) {

        for (Iterator iterator = map.values().iterator(); iterator.hasNext(); ) {
            if (iterator.next().equals(value)) {
                iterator.remove();
            }
        }
    }

    private static void listOfStudents(){

        System.out.println("\nTask 3.\n");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", 3));
        students.add(new Student("Igor", 2));
        students.add(new Student("Stepan", 1));
        students.add(new Student("Orest", 3));
        students.add(new Student("Petro", 4));

        System.out.println("List of student:\n"+students);

        Collections.sort(students, new Student.ByName());
        System.out.println("\nList sorted by name:\n"+students);

        Collections.sort(students, new Student.ByCourse());
        System.out.println("\nList sorted by course:\n"+students);

        System.out.println("\nStudent, which study at 3 course:");
        Student.printStudents(students, 3);
        System.out.println("\nTask 3 done.\n");

    }


}
