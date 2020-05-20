package lesson5;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Less5Test {

    @Test
    public void testMaxSumAmount() {
        assertEquals(Arrays.toString(new int[]{5, 18, 2}),
                Arrays.toString(Less5.maxSumAmount(new int[]{
                        5, -4, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -100})));

        assertEquals(Arrays.toString(new int[]{0, 0, 2}), Arrays.toString(Less5.maxSumAmount(new int[]{-100, 0, -9})));
        assertEquals(Arrays.toString(new int[]{0, 0, 0}), Arrays.toString(Less5.maxSumAmount(new int[]{0, 0, 0, 0})));
        assertEquals(Arrays.toString(new int[]{-5, 0, 3}), Arrays.toString(
                Less5.maxSumAmount(new int[]{2147483647 + 5, 2147483647 + 2147483644, 2147483647 + 473647})));

    }

    @Test
    public void testPosValue() {
        assertEquals(1, Less5.posValue(new int[]{9, 6, 0, -3}));
        assertEquals(0, Less5.posValue(new int[]{0, 6, 0, -3}));
        assertEquals(0, Less5.posValue(new int[]{0, -0, 0}));
        assertEquals(-1, Less5.posValue(new int[]{9, -6, 0, -3}));
    }
}