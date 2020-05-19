package HW3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dog {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String name;
    private enum breed{ Laika("Laika"), Dog("Dog"), Golden_Retriver("Golden retriver"), Spaniel("Spaniel");

    private final String description;

    private breed(String description){
        this.description = description;
    }
    }

    private int age;
    private breed dogBreed;

    public Dog(String name, breed dogBreed, int age) {
        this.name = name;
        this.dogBreed = dogBreed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dogBreed=" + dogBreed +
                '}';
    }

    //Checking for same names
   public  static void checkSameNames(Dog[] dog) {
       for (int i = 0; i < dog.length - 1; i++) {
           String name = dog[i].getName();
           if (name.toLowerCase().equals(dog[i+1].getName().toLowerCase())){
               System.out.println("We have same names: " + name);
           }
       }

   }

   //Searching for the oldest dog
   public static Dog findOldest(Dog[] dog){
        Dog oldestDog = dog[0];
        int maxAge = dog[0].getAge();
        for (int i = 0; i < dog.length; i++) {
           if (dog[i].getAge() > maxAge){
               maxAge = dog[i].getAge();
               oldestDog = dog[i];
           }
        }
        return oldestDog;
   }


    public static void main(String[] args) {
        Dog[] dogs = new Dog[4];
        dogs[0] = new Dog ("Peter", breed.Laika, 10 );
        dogs[1] = new Dog("Jella", breed.Spaniel, 2 );
        dogs[2] = new Dog("Albert", breed.Golden_Retriver, 5 );
        dogs[3] = new Dog("Albert", breed.Dog, 1 );
        checkSameNames(dogs);
        System.out.println("WE have the elder one! Its: " + findOldest(dogs).getName() + ". And the breed is: " + findOldest(dogs).dogBreed);

    }
}
