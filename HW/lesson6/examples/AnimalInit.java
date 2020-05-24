package lesson6.examples;

public class AnimalInit {

	public static void main(String[] args) {
		
		Cat cat = new Cat("Meow", "Aegean");
		Dog dog = new Dog("Gav", "Boerboel");
		
		System.out.println(cat.voice());
		System.out.println(cat.feed());
		
		System.out.println(dog.voice());
		System.out.println(dog.feed());
		
	}

}
