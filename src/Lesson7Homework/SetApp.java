package Lesson7Homework;

import java.util.HashSet;
import java.util.Set;

import static Lesson7Homework.SetUnionAndSetintersection.intersection;
import static Lesson7Homework.SetUnionAndSetintersection.union;

public class SetApp {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(0);
        set1.add(5);
//Union of sets
        Set<Integer> a = union(set1, set2);
        System.out.println("Union of sets is: ");
        System.out.println(a);

        HashSet<Integer> set4 = new HashSet<>();
        set4.add(1);
        set4.add(2);
        set4.add(3);
        set4.add(4);

        HashSet<Integer> set5 = new HashSet<>();
        set5.add(1);
        set5.add(2);
        set5.add(0);
        set5.add(5);
//Intersection of sets
        Set<Integer> c = intersection(set4, set5);
        System.out.println("Intersection of sets is: ");
        System.out.println(c);
    }
}
