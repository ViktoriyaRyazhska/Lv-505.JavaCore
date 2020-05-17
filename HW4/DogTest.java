package HW4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void older() {
        Dog dog = new Dog("n", Breed.AKITA.getBreed(), 2);
        Dog dog2 = new Dog("N",Breed.LABRADOR.getBreed(),2);
        assertEquals(dog2, dog.older(dog2));
        assertFalse(dog.equals(dog2));
        dog2.setName("n");
        assertTrue(dog.equals(dog2));
        dog2.setName(" n ");
        assertFalse(dog.equals(dog2));
    }
}