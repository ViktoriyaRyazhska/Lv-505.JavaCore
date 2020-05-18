package Lesson4Homework;

import org.junit.Test;

public class DogApp {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Barsik", 2, Dog.breed.AmericanBulldog);
        Dog dog2 = new Dog("Tusik", 3, Dog.breed.AustralianShepherd);
        Dog dog3 = new Dog("Tusik", 4, Dog.breed.AustralianTerrier);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        if (dog1.name.equals(dog2.name) || dog2.name.equals(dog3.name) || dog1.name.equals(dog3.name)) {
            System.out.println("There are dogs with the same name");
        } else
            System.out.println("There are no dogs with the same name");

        //dog1.CheckTheSameNames(dog2);
        // dog2.CheckTheSameNames(dog3);
        //dog1.CheckTheSameNames(dog3);


        if (dog1.age > dog2.age && dog1.age > dog3.age) {
            System.out.println("Oldest dog name is " + dog1.name + " and his breed is " + Dog.breed.AmericanBulldog);
        }
        if (dog2.age > dog1.age && dog2.age > dog3.age) {
            System.out.println("Oldest dog name is " + dog2.name + " and his breed is " + Dog.breed.AustralianShepherd);
        }
        if (dog3.age > dog1.age && dog3.age > dog2.age) {
            System.out.println("Oldest dog name is " + dog3.name + " and his breed is " + Dog.breed.AustralianTerrier);


            // Створюю обєкт test якому присвоюю старшого dog
            // Dog test = dog1.CheckOldestDog(dog2);//за допомогою обєкту dog1 який має якісь параметри викликаю метод
            //де на вхід даю інший обєкт dog2  і метод порівнює їх поля
            //test=test.CheckOldestDog(dog3);
            //System.out.println("Oldest dog name is " + test.getName());
            //if(test==dog1){
            //System.out.println("Oldest dog breed is "+ Dog.breed.AmericanBulldog);
            // }
            //else if(test==dog2){
            // System.out.println("Oldest dog breed  is "+ Dog.breed.AustralianShepherd);
            //}
            //else if(test==dog3){
            //   System.out.println("Oldest dog breed  is "+ Dog.breed.AustralianTerrier);
        }

    }
}


