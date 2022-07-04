package chapter07;

public class TV implements Controllabel{

    @Override
    public void turnOn() {
        System.out.println("TV를 켠다");
    }

    @Override
    public void trunOff() {
        System.out.println("TV를 끈다.");
    }
}
