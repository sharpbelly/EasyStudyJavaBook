package chapter08;

import java.util.Random;

public class Q4Dice {

    public int roll(){
        Random r = new Random();
        return r.nextInt(5)+1;
    }
}
