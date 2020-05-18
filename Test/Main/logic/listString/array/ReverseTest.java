package Main.logic.listString.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void arrayReverse() throws Exception {

int[][] strat = {{1,0},  //2 1   //created matrix на вхід в метод
                 {2,3}}; //3 0

int [][] actual = Reverse.arrayReverse(strat); // reversed this matrix with help of the method

int [][] expected  = {{2,1},{3,0}};   //result which is expected
assertEquals(expected,actual);





    }
}