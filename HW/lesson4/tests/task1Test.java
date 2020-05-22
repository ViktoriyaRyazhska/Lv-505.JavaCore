package lesson4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lesson4.homeWork.Dog;

class task1Test {

	Dog dog1 = new Dog();
	Dog dog2 = new Dog();

	@Test
	public void testDogName() {
		dog1.setName("sss");
		dog2.setName("SSs");
		assertTrue(dog1.equals(dog2));

	}

}
