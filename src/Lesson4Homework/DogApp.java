package Lesson4Homework;

public class DogApp {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Barsik", 2, Dog.breed.AmericanBulldog);
        Dog dog2 = new Dog("Tusik", 3, Dog.breed.AustralianShepherd);
        Dog dog3 = new Dog("Pupsik", 4, Dog.breed.AustralianTerrier);

        if (dog1.name.equals(dog2.name) || dog2.name.equals(dog3.name) || dog1.name.equals(dog3.name)) {
            System.out.println("There are dogs with the same name");
        } else
            System.out.println("There are no dogs with the same name");


        if (dog1.age > dog2.age && dog1.age > dog3.age) {
            System.out.println("Oldest dog name is " + dog1.name + " and his breed is " + Dog.breed.AmericanBulldog);
        }
        if (dog2.age > dog1.age && dog2.age > dog3.age) {
            System.out.println("Oldest dog name is " + dog2.name + " and his breed is " + Dog.breed.AustralianShepherd);
        }
        if (dog3.age > dog1.age && dog3.age > dog2.age) {
            System.out.println("Oldest dog name is " + dog3.name + " and his breed is " + Dog.breed.AustralianTerrier);
        }
    }
}

