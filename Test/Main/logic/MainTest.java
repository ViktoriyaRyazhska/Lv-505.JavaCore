package Main.logic;

import Main.logic.listString.Main;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {
    private Main main;

    @Test
    public void addStringtoList()throws Exception {
        main = new Main();
        main.addStringtoList("a","b","c");

        List<String> expected = Arrays.asList("a","b","c");
        List<String> actual = main.words;
        assertEquals(expected,actual);

    }
    @Test
    public void addStringtoList2()throws Exception {
        main = new Main();
        main.addStringtoList("a","b","c");

        List<String> expected = Arrays.asList("a","b","c");
        List<String> actual = main.words;
        assertEquals(expected,actual);

    }


}