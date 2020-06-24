package JUNIT5;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.time.Duration;

import static junit.framework.TestCase.assertEquals;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;


public class StringTest {

    private String str;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Initialize connection to database");
    }


    @AfterAll
    static void afterAll() {
        System.out.println("Close connection to database");
    }


    @BeforeEach
    void beforeEach(TestInfo info) {
        System.out.println("Initialize data for each test" + info.getDisplayName());
    }


    @BeforeEach
    void afterEach(TestInfo info) {
        System.out.println("Clean uo data for each test" + info.getDisplayName());
    }


    @org.junit.jupiter.api.Test
    void lengthbasic() {
        int actuallength = "abcde".length();
        int expectedlength = 5;

        assertEquals(expectedlength, actuallength);

    }

    @Test
    public void toUpperCase() {
        String str = "abcd";
        String result = str.toUpperCase();
        assertEquals("ABCD", result);
        assertNotNull(result);

    }

    @Test
    public void containsbasic() {

        String str = "fwfw";
        boolean result = str.contains("g");
        assertEquals(false, result);
        //assertFalse(result);

    }


    @Test
    public void splitbasic() {

        String str = "abc def ghi";

        String actualresult[] = str.split(" ");

        String[] expectedresult = new String[]{"abc", "def", "ghi"};
        assertArrayEquals(actualresult, expectedresult);


    }


    @Test
    @DisplayName("When length is null, throw an exception")
    public void lengthException() {

        String str = null;

        assertThrows(NullPointerException.class,
                () -> {
                    str.length();
                }
        );


    }


    @ParameterizedTest
    @ValueSource(strings = {"abcd", "abc", "a", "def", " "})
    public void lengthgreaterthanzerousingparametrizedtest(String str) {

        assertTrue(str.length() > 0);


    }


    @ParameterizedTest
    @CsvSource(value = {"abcd,ABCD", "abc,ABC", "'',''", "abcdefg,ABCDEFG"})
    void upperCase(String word, String capitword) {
        assertEquals(capitword, word.toUpperCase());

    }

    @ParameterizedTest(name = "{0} length is {1}")
    @CsvSource(value = {"abcd,4", "abc,3", "'',0", "abcdefg,7"})
    void length(String word, int expectedLength) {
        assertEquals(expectedLength, word.length());

    }

    @Test
    @RepeatedTest(10)
    public void containsbasicd() {
        assertFalse("abcdefg".contains("ijk"));
    }


    @org.junit.jupiter.api.Test
    @Disabled
    void perfomanceTest() {

        assertTimeout(Duration.ofSeconds(5),
                () -> {

                    for (int i = 0; i <= 1000000; i++) {
                        int j = i;
                        System.out.println(j);
                    }
                });
    }

    @Nested
    class EmptyStringTests {
        @BeforeEach
        void setToEmpty() {

            str = "";

        }


        @org.junit.jupiter.api.Test
        void lengthIsZero() {
            assertEquals(0, str.length());
        }

        @org.junit.jupiter.api.Test
        void upperCaseIsEmpty() {
            assertEquals("", str.toUpperCase());
        }


    }


}




