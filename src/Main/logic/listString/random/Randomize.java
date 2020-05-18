package Main.logic.listString.random;

import java.util.Random;

public class Randomize {

    private Random random;

    public Randomize(Random random) {
        this.random = random;
    }

    public int getRandom(int a){

        int i =random.nextInt(a);
        if(i>5)
            throw new IllegalArgumentException("i>5;i==" + i);
        return i;

    }
}
