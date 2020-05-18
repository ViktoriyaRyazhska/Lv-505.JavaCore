package Lesson4Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Person person1 = new Person("Ivan", "Petrenko");
        Person person2 = new Person("Oleh", "Sidorenko");
        Person person3 = new Person("Pavlo", "Shevchenko");
        Person person4 = new Person("Olya", "Ivanenko");
        Person person5 = new Person("Igor", "Vasylyshyn");
        person1.setBirthYear(1999);
        person2.setBirthYear(1993);
        person3.setBirthYear(1995);
        person4.setBirthYear(1994);
        person5.setBirthYear(1993);


        System.out.println("Person1 age is " + person1.getAge());
        System.out.println("Person2 age is " + person2.getAge());
        System.out.println("Person3 age is " + person3.getAge());
        System.out.println("Person4 age is " + person4.getAge());
        System.out.println("Person5 age is " + person5.getAge());

        person1.output(person1);
        person2.output(person1);
        person3.output(person3);
        person4.output(person4);
        person5.output(person5);

        person1.input(br);
        person1.output(person1);//cкладний поганий варіант(to string)
        person1.output2();//витяну всі характеристики обєкту person1 через this
        person1.changeName();
        person1.output(person1);

    }
}
