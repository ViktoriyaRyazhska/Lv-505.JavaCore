package HW4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;


class Hm4Test {

    @org.junit.jupiter.api.Test
    void testRangeOfFloat() {
        assertTrue(Hm4.rangeOfFloat(1.2f,2.3f,-4.5f));
    }

    @org.junit.jupiter.api.Test
    void testRangeOfFloat1() {
        assertTrue(Hm4.rangeOfFloat(5f,0f,-5f));
    }

    @org.junit.jupiter.api.Test
    void testRangeOfFloat2() {
        assertFalse(Hm4.rangeOfFloat(5f,0f,-5.000001f));
    }

    @org.junit.jupiter.api.Test
    void testMinInt() {
        assertEquals(2,Hm4.minInt(44,5,2));
    }

    @org.junit.jupiter.api.Test
    void testMinInt1() {
        assertEquals(0,Hm4.minInt(0,0,0));
    }

    @org.junit.jupiter.api.Test
    void testMinInt2() {
        assertEquals(-100,Hm4.minInt(5,-100,44));
    }

    @org.junit.jupiter.api.Test
    void testMaxInt() {
        assertEquals(5,Hm4.maxInt(1, -3, 5));
    }

    @org.junit.jupiter.api.Test
    void testMaxInt1() {
        assertEquals(2,Hm4.maxInt(2, 0, (2147483647+1)));
    }

    @org.junit.jupiter.api.Test
    void testMaxInt2() {
        assertEquals(0,Hm4.maxInt(0, 0, 0));
    }

    @org.junit.jupiter.api.Test
    void testHttpError() {
        assertEquals("Not Found",Hm4.httpError(404));
    }

    @org.junit.jupiter.api.Test
    void testHttpError1() {
        assertEquals("HTTP error not found",Hm4.httpError(-5));
    }

    @org.junit.jupiter.api.Test
    void testHttpError2() {
        assertEquals("HTTP error not found",Hm4.httpError(2147483647+1));
    }

    @org.junit.jupiter.api.Test
    void testHttpError3()  {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Hm4.httpError(5/0);
    });}
}