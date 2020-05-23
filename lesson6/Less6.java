package lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less6 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String task = " ";

        while (true) {
            System.out.println("What task do you want to see?\n" +
                    "1 - Animals;\n2 - university people;\n0 - exit from application.");
            task = br.readLine();

            switch (task) {
                case "1":
                    Less6.arrayOfAnimals();
                    break;
                case "2":
                    Less6.universityPeople();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, no such choice, please repeat.");
            }
        }

    }

    private static void arrayOfAnimals() {

        Animal[] animals = {new Dog("Marsel"),
                new Cat("Keks"), new Dog("Lana"),
                new Cat("Pusya"), new Dog("Rex"),
                new Dog("Lada")};

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }

    private static void universityPeople() {

        Person[] people = {new Student("Igor", 3),
                new Student("Oleg", 2),
                new Student("Ivan", 3),
                new Teacher("Ivan Petrovich", 10),
                new Teacher("Larusa Mukolayivna", 7),
                new Teacher("Igor Viktorovich", 18),
                new Cleaner("Mariya Petrivna", 22),
                new Cleaner("Taisiya Pavlivna", 6)};

        for (Person person : people) {
            person.print();
            if (person.getClass()==Teacher.class||person.getClass()==Cleaner.class){
                ((Staff) person).salary();
            }
            System.out.println();
        }
    }

}

