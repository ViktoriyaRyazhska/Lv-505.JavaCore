package Lesson4practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class PracticeTest {


    @Test
    public void add() {
assertTrue(Practice.add(5,2)==7);
    }

    @Test
    public void div() {
        assertEquals(5,Practice.div(10,2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivZero() {
        Practice.div(10,0);
    }


}