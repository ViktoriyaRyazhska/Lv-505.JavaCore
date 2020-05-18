package Main.logic.listString.random;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RandomizeTest {

    @Test
    public void getRandom() throws Exception {
        Random mock = mock(Random.class);

Randomize randomize = new Randomize(mock);
int val =10;
when(mock.nextInt()).thenReturn(3);




    }
}