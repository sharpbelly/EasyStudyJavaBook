package chapter07;

public class Computer implements Controllabel{
    @Override
    public void turnOn() {
        System.out.println("Computer를 켠다.");
    }

    @Override
    public void trunOff() {
        System.out.println("Computer를 끈다.");
    }
}
