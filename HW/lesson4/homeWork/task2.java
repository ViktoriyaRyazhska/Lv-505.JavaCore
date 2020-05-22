package lesson4.homeWork;

import lesson4.homeWork.Dog.Breed;


public class task2 {

	
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.setName("Janise");
		dog1.setBreed(Breed.Boxer);
		dog1.setAge(2);

		Dog dog2 = new Dog();
		dog2.setName("Tayson");
		dog2.setBreed(Breed.SiberianHuskie);
		dog2.setAge(6);
		
		Dog dog3 = new Dog();
		dog3.setName("Gogy");
		dog3.setBreed(Breed.FrenchBulldog);
		dog3.setAge(5);
		
		System.out.println(dog3.getBreed());
		
		
		if(dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3)) { 
			System.out.println("There are dogs with the same names");		
		} else { 
			System.out.println("No dogs have the same name");
		}
		
		
		System.out.print("The oldest ");
		if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()){
			System.out.println(dog1);
		} else if(dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()){
			System.out.println(dog2);
		} else {
			System.out.println(dog3);
		}
		
		
		
	}
}
