package com.softserve.javacore.homework3;

import java.util.Objects;

public class Dog {
    String name;
    String breed;
    int age;

    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }


    public enum Breed {
        BORDERCOLLIE("Border Collie"),
        POODLE("Poodle"),
        GERMANSHEPHERD("German Shepherd"),
        GOLDENRETRIEVER("Golden Retriever"),
        LABRADORRETRIEVER("Labrador Retriever"),
        ROTTWEILER("Rottweiler");

        String enumName;

        Breed(String enumName) {
            this.enumName = enumName;
        }

        public static void main(String[] args) {
            Dog dog1 = new Dog("Oscar", Breed.POODLE.enumName, 3);
            Dog dog2 = new Dog("Charlie", Breed.GOLDENRETRIEVER.enumName, 10);
            Dog dog3 = new Dog("Oscar", Breed.BORDERCOLLIE.enumName, 1);


            if (dog1.equals(dog2) || dog2.equals(dog3) || dog3.equals(dog1)) {
                System.out.println("Some dogs have the same name");
            } else System.out.println("All dogs have different names");

            Dog theOldestDog;

            if (dog1.getAge() > dog2.getAge()) {
                theOldestDog = dog1;
            } else theOldestDog = dog2;

            if (theOldestDog.getAge() < dog3.getAge()) {
                theOldestDog = dog3;
            }

            System.out.println(theOldestDog.getName() + " " + theOldestDog.getAge());
        }
    }
}
