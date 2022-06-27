package chapter04;

public class Dice {
    int number;

    public int roll(){

        do {
            this.number = (int)(Math.random() * 10);
        } while(this.number >6);

        return this.number;
    }
}
