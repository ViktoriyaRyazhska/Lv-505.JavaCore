package Lesson7Homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {
    public static void main(String[] args) {

        ArrayList<Student> Studentlist=new ArrayList<Student>();
        Studentlist.add(new Student("Ivan",2));
        Studentlist.add(new Student("Petro",2));
        Studentlist.add(new Student("Oleg",3));
        Studentlist.add(new Student("Olya",4));
        Studentlist.add(new Student("Ira",1));
        System.out.println("Sorted list by Course: ");

        Collections.sort(Studentlist,new Student.byCourse());
        System.out.println(Studentlist);

        System.out.println("Sorted list by Name: ");
        Collections.sort(Studentlist,new Student.byName());
        System.out.println(Studentlist);

        System.out.println("Lets check by the name of the student by using his course number: ");

        Student ss = new Student("Oleg",3);
        ss.printStudents(Studentlist,4);
    }
}
