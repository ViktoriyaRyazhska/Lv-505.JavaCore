package Lesson7Homework;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonMap {
    public static void main(String[] args) {


        Map<String, String> personMap = new TreeMap<>();
        personMap.put("Melnyk", "Volodymyr");
        personMap.put("Kovalenko", "Vladislav");
        personMap.put("Petrov", "Igor");
        personMap.put("Sudorov", "Orest");
        personMap.put("Kuzmuk", "Taras");
        personMap.put("Bondarenko", "Petro");
        personMap.put("Tokarenko", "Orest");
        personMap.put("Petrenko", "Yaroslav");
        personMap.put("Semenenko", "Olya");
        personMap.put("Ivanenko", "Ira");

        //Output the entities of the map on the screen.
        for (Map.Entry entry : personMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
        }

        //There are at less two persons with the same firstName among these 10 people?

        System.out.println("Is Orest present in the map ? ");
        if (personMap.containsValue("Orest")) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
//This method will remove only first Value Orest
        // personMap.values().remove("Orest");

        System.out.println("Lets remove Orest from here");

        //This method will remove all the same given values
        for (Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> e = it.next();
            if ("Orest".equals(e.getValue())) {
                it.remove();
            }
        }

        System.out.println("Updated map is below: ");

        for (Map.Entry entry : personMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
        }

    }
}
