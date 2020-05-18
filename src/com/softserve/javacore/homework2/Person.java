package com.softserve.javacore.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName);
    }

    public int getAge() {
        return LocalDate.now(ZoneId.of("Europe/London")).getYear() - birthYear;
    }

    private int getCurrentYear() {
        return LocalDate.now().getYear();
    }

    public void input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please, enter your First Name:");
            firstName = br.readLine();
            System.out.println("Please, enter your Last Name:");
            lastName = br.readLine();
            System.out.println("Please, enter your Year of Birth:");
            birthYear = Integer.parseInt(br.readLine());
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void output() {
        System.out.println(toString());
    }

    public void chageFullName(String newFirstName, String newLastName){ firstName = newFirstName; lastName = newLastName;
    }

    public void changeFirstName(String newFirstName){ firstName = newFirstName;
    }

    public void changeLastName(String newLastName){ lastName = newLastName;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input();
        person1.output();

        person2.input();
        person2.output();

        person3.input();
        person3.output();

        person4.input();
        person4.output();

        person5.input();
        person5.output();

        person1.changeLastName("Ivanyshyn");
        System.out.println(person1.lastName);
    }
}